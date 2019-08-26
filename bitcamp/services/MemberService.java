//작업할때 서버 먼저 작성함? 컨트롤러 먼저 작성되야 하는거아님? 키워드는 정해서 줌? 빈을 먼저 작성해야함? 우선순위가 뭐임?

/*
 * 요구사항 (기능정의) 
 * 1. 회원가입 /id,name,pw,ssn,height,weight
 * 2. 마이페이지 회원정보 확인 
 * 3. 비번 수정 기능
 * 4. 회원탈퇴
 * 5.아이디 존재 체크
 * 6. 로그인
 * ******************
 * <관리자기능>
 * 1. 회원목록
 * 2. 아이디검색 
 * 3. 이름검색
 * 4. 전체회원수
 */
package com.bitcamp.services;
import com.bitcamp.domains.MemberBean;


public class MemberService {
		private MemberBean[] members;
		private int count;
		public MemberService() {  // 우리 서버 멤버는 10개만 받을수 있어
			members = new MemberBean[10]; //멤버스를 멤버빈에 생성해.
			count = 0; // 숫자 카운팅해 얼마일지 아직모름
		}
	/**
	 * 1. 회원가입 /id,name,pw,ssn,height,weight
	 */
		public String getJoin(MemberBean param) {
			String msg ="회원가입 성공";
			members[count] = param; 
			count++;
			return msg;
		}
	/**
	 * 2. 마이페이지 회원정보 확인
	 */
		public String getMyPage(MemberBean param) {
			return param.toString();
		}
	/**
	 * 3. 비번 수정 기능
	 */
		public String changePassword(MemberBean param) {
			String msg ="비밀번호가 변경되었습니다.";
			String id = param.getId();
			String pw = param.getPw();
			String[] pws = pw.split(",");
			String oldPw = pws[0];
			String newPw = pws[1];
			for(int i =0;i<count;i++) {
				if(param.getId().equals(members[i].getId())
						&& param.getPw().equals(members[i].getPw())) {
					members[i].setPw(newPw);
				}
			}
			return msg;
		}
		/*
		 * 4. 회원탈퇴 기능
		 */
		public String withDraw(MemberBean param) {
			String msg = "회원탈퇴 완료";
			return msg;
		}
		/*
		 * 5. 아이디 체크
		 */
		public String existId(String id) {
			String msg = "가입 가능한 아이디 입니다.";
			
			MemberBean member = new MemberBean();
			
			for(int i=0;i<= count; i++) {
				if(id.equals(members[i].getId())) {
					msg = "이미 존재하는 아이디";
					break;
				}
			}
			return msg;
		}
		/*
		 * 6. 로그인 
		 */
		public String login(MemberBean param) {
			String msg = "로그인 실패";
			for(int i=0;i<count;i++) {
				if(param.getId().equals(members[i].getId()) && param.getPw().equals(members[i].getPw()));
						msg = "로그인 되었습니다.";
						break;
				
			}
			return msg;
		}
}