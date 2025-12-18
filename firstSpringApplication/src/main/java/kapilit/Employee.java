package kapilit;

import java.util.ArrayList;

public class Employee {// implements Serializable {

	private int id;
	private String name;
	private int age , salary;
	private Address address;
	private ArrayList<Employee> emp;
	public Employee(int id, String name, int age, int salary, ArrayList<Employee> emp) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.emp = emp;
	}

	public Employee() {
		super();
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public ArrayList<Employee> getEmp() {
		return emp;
	}

	public void setEmp(ArrayList<Employee> emp) {
		this.emp = emp;
	}

	public Employee(int id, String name, int age, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public Employee(int id, String name, int age, int salary, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + ", address=" + address
				+ "]";
	}
	
	 
	
}
