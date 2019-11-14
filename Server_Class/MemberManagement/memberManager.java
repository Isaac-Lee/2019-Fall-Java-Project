package Server_Class.MemberManagement;

import DBController.*;

public class memberManager {
	
	static boolean addMember(String ID, String Password) { // add에 성공하면 true 반대는 false
		return insertIntoDB.addManager(ID, Password);
	}
	
	static boolean deleteMember() {			// add에 성공하면 true 반대는 false
		return false;
	}
	
	static void findMember(String ID) {		// 특정 회원을 찾음
		
	}
	
	static void findMemberList() {			// 모든 회원의 리스트를 출력
		
	}
	
	static void findEvent(String ID) { 		// ??? 왜 있는거야??
		
	}
	
	static boolean findToken(String ID) {  	// 토큰이 있는다면 true 반대는 false
		return false;
	}
	
	static int getNumberOfMember() {		// 모든 회원의 수를 반환.
		return 0;
	}
	
}
