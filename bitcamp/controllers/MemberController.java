/*
 * /*
 * 요구사항 (기능정의) 
 * 1. 회원가입
 * 2. 마이페이지 회원정보 확인
 * 3. 비번 수정 기능
 * 4. 회원탈퇴
 * ******************
 * <관리자기능>
 * 5. 회원목록
 * 6. 아이디검색
 */
 
package com.bitcamp.controllers;

import javax.swing.JOptionPane;
import com.bitcamp.domains.MemberBean;
import com.bitcamp.services.MemberService;

public class MemberController {
	
	public static void main(String[] args) {
		MemberBean member = null;
		MemberService service = new MemberService();
		MemberBean[] members = new MemberBean[10];
		String[] arr = {};
		String temp = "";
		while(true) {
			switch(JOptionPane.showInputDialog("0. 종료 \n "
					+ "1.회원가입 \n"
					+ "2.마이페이지 \n "
					+ "3.비밀번호 수정 \n "
					+ "4.회원 탈퇴 \n"
					+ "5.아이디 체크\n"
					+ "6.로그인")) {
			case "0" : JOptionPane.showInputDialog(null, "종료");
			case "1" :String spec = JOptionPane.showInputDialog("이름,아이디,비밀번호,주민번호,혈액형,키,몸무게");
					 	 arr =spec.split(",");
					 	member = new MemberBean(); //정보받아야되니까 객체하나 만들어야겠구나 얘이름은 멤버야
					 	member.setName(arr[0]);
					 	member.setId(arr[1]);
					 	member.setPw(arr[2]);
					 	member.setSsn(arr[3]);
					 	member.setBlood(arr[4]);
					 	member.setHeight(Double.parseDouble(arr[5]));
					 	member.setWeight(Double.parseDouble(arr[6]));
					 
					 	JOptionPane.showMessageDialog(null, service.getJoin(member)); //조인을 출력해
					 break;
			case "2" :  
				 		JOptionPane.showMessageDialog(null, service.getMyPage(member));
				break;		 	
			case "3" : temp = JOptionPane.showInputDialog("아이디, 현재비번, 변경할 비번");
							member = new MemberBean();
							member.setId(arr[0]);
							member.setPw(arr[1] +"," + arr[2]);
							JOptionPane.showMessageDialog(null, service.changePassword(member));
				
				break;	
			case "4" : JOptionPane.showInputDialog(null, "회원탈퇴 완료");
				break;	
			 				
			case "5" :break;	
			case "6" :break;	
			default : 
			}

		}
	}
}
