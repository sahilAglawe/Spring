package kapilit;

import java.util.ArrayList;

public class department {
  
  private  ArrayList<Employee> emp;
   public department() {
	super();
   }
   @Override
   public String toString() {
	return "department [emp=" + emp + "]";
   }
   public department(ArrayList<Employee> emp) {
	super();
	this.emp = emp;
   }
   
  
   
   
}
