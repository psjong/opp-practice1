package com.bitcamp.domains;

public class MemberBean {
	
	private String id, pw, name, email, hpnumber, snn ;
	
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return this.id;
	}
	
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getPw() {
		return this.pw;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return this.email;
	}
	
	public void setHpnumber(String hpnumber) {
		this.hpnumber = hpnumber;
	}
	public String getHpnumber() {
		return this.hpnumber;
	}
	
	public void setSnn(String snn) {
		this.snn = snn;
	}
	public String getSnn() {
		return this.snn;
	}
	
	@Override
	public String toString() {
		return  String.format("아이디 : %s \n"
				+ "비밀번호 : %s \n"
				+ "이름 : %s \n"
				+ "이메일 : %s \n"
				+ "핸드폰번호 : %s \n"
				+ "주소 : %s \n", id, pw, name, email, hpnumber, snn);
	}
}