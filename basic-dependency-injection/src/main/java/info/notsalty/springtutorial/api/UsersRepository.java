package info.notsalty.springtutorial.api;

import info.notsalty.springtutorial.Domain.User;

public interface UsersRepository {
	/*
	 * Bedzie pozwala³o na stowrzenie uzytkowinikatr4er
	 */
	User createUser(String name);

	void setLogger(Logger logger);

}
