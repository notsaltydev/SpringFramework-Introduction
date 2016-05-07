package info.notsalty.springtutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import info.notsalty.springtutorial.api.UsersRepository;

public class MainSpring {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("konfiguracja.xml");

		UsersRepository usersRepository = context.getBean("repozytoriumUzytkownikow", UsersRepository.class);
		
		usersRepository.createUser("Andrzej");

	}

}
