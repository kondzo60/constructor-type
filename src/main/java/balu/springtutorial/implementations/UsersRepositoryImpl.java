package balu.springtutorial.implementations;

import balu.springtutorial.api.Logger;
import balu.springtutorial.api.UsersRepository;
import balu.springtutorial.domain.User;

public class UsersRepositoryImpl implements UsersRepository {
private Logger logger;
	public User createUser(String name) {
		logger.log("Tworzenie uzytkownika: " +name);
		return new User(name);
	}

	public void setLogger(Logger logger) {
		this.logger = logger;
	}

}
