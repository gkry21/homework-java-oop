package com.bitcamp.domains;

public class MemberBean {
	private String name, id, pw, ssn, blood;
	private double height, weight;

	public void setName(String name) {
		this.name = name;
	}

		public String getName() {
		return this.name;
	}

	public void setId(String Id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getPw() {
		return pw;
	}
	
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getSsn() {
		return ssn;
	}
	public void setBlood(String blood) {
		this.blood = blood;
	}
	public String getBlood() {
		return blood;
	}
	
	public void setHeight(Double height) {
		this.height = height;
	}
	public double getHeight() {
		return height;
	}
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	public double getWeight() {
		return weight;
	}
	public String toString() {
		return String.format("회원정보 \n"
									+ "이름 : \n"
									+ "아이디 : \n"
									+ "비밀번호 : \n"
									+ "주민번호 : \n"
									+ "아이디 : \n"
									+ "아이디 : \n"
									+ "아이디 : \n",
									name,id,pw,ssn,blood,height,weight);
	}
		
	}
