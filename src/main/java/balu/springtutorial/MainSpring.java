package balu.springtutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import balu.springtutorial.api.UsersRepository;
import balu.springtutorial.domain.User;

public class MainSpring {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("konfiguracja.xml");
		UsersRepository usersRepository = context.getBean("repozytoriumUzytkownikow", UsersRepository.class);

		User konrad = usersRepository.createUser("Konrad");
	}

}
