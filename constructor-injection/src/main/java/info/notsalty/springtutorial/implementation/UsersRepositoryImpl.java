package info.notsalty.springtutorial.implementation;

import info.notsalty.springtutorial.Domain.User;
import info.notsalty.springtutorial.api.Logger;
import info.notsalty.springtutorial.api.UsersRepository;

public class UsersRepositoryImpl implements UsersRepository {

	private Logger logger;

	public UsersRepositoryImpl(Logger logger, String localization, String dbName) {//indeksy tutaj 0.Logger logger, 1.String localization, 2.String dbName
		this.logger = logger;
		logger.log("Lokalizacja repozytorium: " + localization + "/" + dbName);
	}

	public UsersRepositoryImpl() {

	}

	public User createUser(String name) {
		logger.log("Tworzenie u¿ytkownika " + name);
		return new User(name);
	}

}
