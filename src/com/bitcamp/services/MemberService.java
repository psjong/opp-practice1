package com.bitcamp.services;
import com.bitcamp.domains.MemberBean;
/**
 * 요구사항 (기능정의)
 * <사용자기능>
 * 1. 회원가입
 * 2. 마이페이지
 * 3. 비번 수정
 * 4. 회원탈퇴
 * 5. 아이디 체크
 * 6. 로그인
 * **********
 * <관리자기능>
 * 1. 회원목록
 * 2. 아이디검색
 * 3. 이름검색
 * 4. 전체 회원수
 * 
 * */

	public class MemberService {
		
		private MemberBean[] members;
		private int count ;
		
		public MemberService () {
			members = new MemberBean[10];
			count=0;
		}
		
		/*
		 * 1.회원가입:id, pw, name, email, hpnumber, snn 입력받고 회원가입 완료.
		 */
		public String getJoin(MemberBean param) {
			String result = "";
			
			members[count] = param ;
			count++;
			
			return result = "회원가입완료";
		}
		
		/*
		 * 2.마이페이지
		 * */
		public String getMyPage(MemberBean param) {
			String result = "";
			
			result = param.toString();
			return result;
		}
		
		/*
		 * 3.비밀번호 수정: 아이디와 비밀번호(구비밀번호+신규비밀번호를 같이 받아온다.)
		 * */
		public String changePw(MemberBean param) {
			String result = "아이디와 비밀번호가 일치하지 않습니다.";
			String[] pws = param.getPw().split(",");
			for(int i=0 ; i<count ; i++) {
				if(param.getId().equals(members[i].getId()) && pws[0].equals(members[i].getPw()) ) {
					members[i].setPw(pws[1]);
					result = "비밀번호가 변경되었습니다.";
					break;
				}
			}
			
			return result;
		}
		
		/*
		 * 4.회원탈퇴
		 * */
		public String getWithDrawal(MemberBean param) {
			String result = "아이디와 비밀번호가 일치하지 않습니다.";
			for(int i=0 ; i<count ; i++) {
				if(param.getId().equals(members[i].getId()) && param.getPw().equals(members[i].getPw()) ) {
					members[i]=members[count];
					members[count] = null;
					count --;
					result = "회원탈퇴가 완료되었습니다.";
					break;
				}
			}
			return result;
		}
		
		/*
		 * 5.아이디 체크 (중복되는 아이디가 있는지 확인)
		 * */
		public String getCheckId(String id) {
			String result = "사용가능한 아이디 입니다.";
			for(int i=0 ; i<count ; i++) {
				if(id.equals(members[i].getId())) {
					result = "이미 사용중인 아이디 입니다.";
					break;
				}
			}
			
			return result;
		}
		
		/*
		 * 6.로그인
		 * */
		public String getlogIn(MemberBean param) {
			String msg = "아이디와 비밀번호가 일치하지 않습니다.";
			
			for(int i=0 ; i<count ; i++) {
				if(param.getId().equals(members[i].getId()) && param.getPw().equals(members[i].getPw())) {
					msg = "로그인 되었습니다.";
					break;
				}
			}
			
			return msg;
		}
		
/*
* ****************************************************************************************
* */

		/*
		 * 1.회원목록
		 */
		public String list() {
			String result = "";
			
			
			for(int i=0 ; i<count ; i++) {
				result += members[i].toString() + ", \n";
			}
			
			return result;
		}
		
		/*
		 * 2.아이디 검색
		 * */
		public String findById(String id) {
			String result = "";
			
			for(int i=0 ; i<count ; i++) {
				if(id.equals(members[i].getId())) {
					result = members[i].toString();
					break;
				}
			}
			
			return result;
		}
		
		/*
		 * 3.이름검색
		 * */
		public MemberBean[] findByName(String name) {
			
			int count = 0;
			
			for(int i=0 ; i<this.count ; i++) {
				if(name.equals(members[i].getName())) {
					count ++;
				}
			}
			
			MemberBean[] member = new MemberBean[count];
					
			count = 0;
			for(int i=0 ; i<this.count ; i++) {
				if(name.equals(members[i].getName())) {
					member[count] = members[i];
					count ++;
					if(member.length == count) {								
						break;
					}
				}
			}
			
			return member;
		}
		
		/*
		 * 6.회원수
		 * */
		public String countAll() {
			String result = "";
			result = "회원수는 : " + count;
			return result;
		}
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	