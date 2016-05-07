package info.notsalty.springtutorial;

import info.notsalty.springtutorial.api.Logger;
import info.notsalty.springtutorial.api.UsersRepository;
import info.notsalty.springtutorial.implementation.LoggerImpl;
import info.notsalty.springtutorial.implementation.UsersRepositoryImpl;

public class Main {

	public static void main(String[] args) {

		Logger logger = new LoggerImpl();
		UsersRepository usersRepository = new UsersRepositoryImpl();
		usersRepository.setLogger(logger);

		usersRepository.createUser("janek");

	}

}
