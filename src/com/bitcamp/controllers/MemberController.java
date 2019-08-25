package com.bitcamp.controllers;
import javax.swing.JOptionPane;

import com.bitcamp.domains.MemberBean;
import com.bitcamp.services.MemberService;

public class MemberController {

	public static void main(String[] args) {
		
		MemberService service = new MemberService();
		MemberBean member = null;
		String[] arr = null;
		String temp = "";

		while(true) {
			
			switch(JOptionPane.showInputDialog("0.종료 \n"
					+ "1.회원가입 \n"
					+ "2.마이페이지\n"
					+ "3.비번수정\n"
					+ "4.회원탈퇴\n"
					+ "5.아이디 체크\n"
					+ "6.로그인\n"
					+ "11.회원목록 \n"
					+ "12.아이디검색\n"
					+ "13.이름검색\n"
					+ "14.전체 회원수\n")) {
			case "0" :
				return;
				
			case "1" :
				arr = JOptionPane.showInputDialog("아이디,비밀번호,이름,이메일주소,핸드폰번호,주소").split(",");
				member = new MemberBean();
				member.setId(arr[0]);
				member.setPw(arr[1]);
				member.setName(arr[2]);
				member.setEmail(arr[3]);
				member.setHpnumber(arr[4]);
				member.setSnn(arr[5]);
				JOptionPane.showMessageDialog(null, service.getJoin(member));
				
				break;
				
			case "2" :
				JOptionPane.showMessageDialog(null, service.getMyPage(member));
				break;
				
			case "3" :
				member  = new MemberBean();
				arr = JOptionPane.showInputDialog("아이디,구비밀번호,신규비밀번호").split(",");
				member.setId(arr[0]);
				member.setPw(arr[1]+","+arr[2]);
				JOptionPane.showMessageDialog(null, service.changePw(member));
				break;
				
			case "4" :
				member = new MemberBean();
				arr = JOptionPane.showInputDialog("아이디,비밀번호").split(",");
				member.setId(arr[0]);
				member.setPw(arr[1]);
				JOptionPane.showMessageDialog(null, service.getWithDrawal(member));
				break;
				
			case "5" :
				String checkId = JOptionPane.showInputDialog("아이디 입력");
				JOptionPane.showMessageDialog(null, service.getCheckId(checkId));
				
				break;
				
			case "6" :
				member = new MemberBean();
				arr = JOptionPane.showInputDialog("아이디,비밀번호").split(",");
				member.setId(arr[0]);
				member.setPw(arr[1]);
				JOptionPane.showMessageDialog(null, service.getlogIn(member));
				break;
			
			case "11" : 
				JOptionPane.showMessageDialog(null, service.list());
				break;
				
			case "12" : 
				String serchId = JOptionPane.showInputDialog("조회 ID");
				JOptionPane.showMessageDialog(null, service.findById(serchId));
				break;
			
			case "13" : 
				String serchName = JOptionPane.showInputDialog("조회 이름");
				JOptionPane.showMessageDialog(null, service.findByName(serchName));
				
			case "14" : 
				JOptionPane.showMessageDialog(null, service.countAll());
			
			}
			
			
		}
		
	}

}
