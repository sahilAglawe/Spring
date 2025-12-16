package kapilit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        
        Employee e1 = (Employee) context.getBean("emp");

        
        System.out.println(e1);
       // demo.show();
        //  demo.display();
        
	}

}
