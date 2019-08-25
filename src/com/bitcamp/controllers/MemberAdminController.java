package com.bitcamp.controllers;
import javax.swing.JOptionPane;
import com.bitcamp.domains.MemberBean;
import com.bitcamp.services.MemberService;

public class MemberAdminController {

	public static void main(String[] args) {
		
		MemberBean member = new MemberBean();
		MemberService service = new MemberService();
		
		while(true) {
			switch(JOptionPane.showInputDialog("0.종료\n"
					+ "1.회원목록 \n"
					+ "2.아이디검색\n"
					+ "3.이름검색\n"
					+ "4.전체 회원수\n")) {
			case "0" :
				return;
				
			case "1" : 
				break;
				
			case "2" : 
				break;
				
			case "3" : 
				break;
				
			case "4" : 
				break;
				
			}
		}
		
		
	}
	
}
