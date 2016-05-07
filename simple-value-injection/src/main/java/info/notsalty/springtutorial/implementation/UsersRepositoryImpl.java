package info.notsalty.springtutorial.implementation;

import info.notsalty.springtutorial.Domain.User;
import info.notsalty.springtutorial.api.Logger;
import info.notsalty.springtutorial.api.UsersRepository;

public class UsersRepositoryImpl implements UsersRepository {

	private Logger logger;

	public User createUser(String name) {
		logger.log("Tworzenie u¿ytkownika " + name);
		return new User(name);
	}

	public void setLogger(Logger logger) {// ustawianie loggera
		this.logger = logger;

	}

}
