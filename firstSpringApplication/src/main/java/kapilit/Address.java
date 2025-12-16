package kapilit;

import java.io.Serializable;

public class Address implements Serializable {

	private int doorNo;
	private String city;
	public Address() {
		super();
	}
	public Address(int doorNo, String city) {
		super();
		this.doorNo = doorNo;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [doorNo=" + doorNo + ", city=" + city + "]";
	}
	
	
}
