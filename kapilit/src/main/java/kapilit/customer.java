package kapilit;

import java.util.Map;

public class customer {

	private int cId;
	private String cName;
	private Map<Integer,product> products;
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public Map<Integer, product> getProducts() {
		return products;
	}
	public void setProducts(Map<Integer, product> products) {
		this.products = products;
	}
	@Override
	public String toString() {
		return "customer [cId=" + cId + ", cName=" + cName + ", products=" + products + "]";
	}
	
	
}
