package balu.springtutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import balu.springtutorial.api.UsersRepository;
import balu.springtutorial.domain.User;
import balu.springtutorial.implementations.SomeBean;

public class MainSpring {

	public static void main(String[] args) {
	
		ApplicationContext context = new ClassPathXmlApplicationContext("konfiguracja.xml");
		
		SomeBean bean = context.getBean("someBean", SomeBean.class);
	}

}
