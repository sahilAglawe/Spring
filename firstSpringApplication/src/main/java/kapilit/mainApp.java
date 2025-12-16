package kapilit;



import java.io.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainApp {

	public static void main(String[] args) throws IOException {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        
        Employee e1 = (Employee) context.getBean("emp");
        File f = new File("emm.txt");
        try {
       
			FileOutputStream fos = new FileOutputStream(f);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(e1);
			oos.close();
			fos.close();
			FileInputStream fis = new FileInputStream(f);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Employee e2 = (Employee) ois.readObject();
			ois.close();
			fis.close();
			
			System.out.println(e2);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        
      //  System.out.println(e1);
       // demo.show();
        //  demo.display();
        
	}

}
