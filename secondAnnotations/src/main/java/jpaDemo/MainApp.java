package jpaDemo;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kapilit.service.UserService;
import kapilit.user.user;

public class MainApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        UserService service = ((BeanFactory) context).getBean(UserService.class);

        service.addUser(new user(0, null));
        service.addUser(new user(2, "Rahul"));

        System.out.println("All Users:");
        service.getAllUsers().forEach(System.out::println);

        System.out.println("User with ID 1:");
        System.out.println(service.getUser(1));

        service.deleteUser(2);
	}

}
