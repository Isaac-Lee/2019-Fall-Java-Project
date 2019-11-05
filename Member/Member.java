package Member;

public class Member {
	private String ID;
	private String Password;
	private String PhoneNum;
	private String Email;
	private boolean nowUse;
	
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getPhoneNum() {
		return PhoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		PhoneNum = phoneNum;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public boolean isNowUse() {
		return nowUse;
	}
	public void setNowUse(boolean nowUse) {
		this.nowUse = nowUse;
	}
	
	public Member(String id, String password) {
		setID(id);
		setPassword(password);
	}

}
