package kapilit.user;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class user {

	@Id
	private int uId;
	private String uName;
	
	public user(int i, String string) {
		// TODO Auto-generated constructor stub
	}
	public int getuId() {
		return uId;
	}
	public void setuId(int uId) {
		this.uId = uId;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	
	
}
