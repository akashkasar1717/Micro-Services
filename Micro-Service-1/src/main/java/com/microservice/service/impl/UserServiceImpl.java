package com.microservice.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.entities.User;
import com.microservice.repository.UserRepository;
import com.microservice.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public User saveUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public List<User> fetchUserList() {
		return userRepository.findAll();
	}

	@Override
	public User fetchUser(Long id) {
		Optional<User> user = userRepository.findById(id);
		User us = user.get();
		return us;
	}
}
