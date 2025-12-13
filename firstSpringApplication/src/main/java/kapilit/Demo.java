package kapilit;

public class Demo {

	private String value;

	public Demo() {
		super();
	}

	public Demo(String value) {
		super();
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Demo [value=" + value + "]";
	}

	
	
	
}
