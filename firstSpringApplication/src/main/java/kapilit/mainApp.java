package kapilit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        
        Demo demo = (Demo) context.getBean("helloBean");

        
        System.out.println(demo);

        
	}

}
