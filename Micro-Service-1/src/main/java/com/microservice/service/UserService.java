package com.microservice.service;

import java.util.List;

import com.microservice.entities.User;

public interface UserService {
	User saveUser(User user);

	List<User> fetchUserList();

	User fetchUser(Long id);
}
