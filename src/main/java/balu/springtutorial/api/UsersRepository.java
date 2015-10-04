package balu.springtutorial.api;

import balu.springtutorial.domain.User;

public interface UsersRepository {
	User createUser (String name);

}
