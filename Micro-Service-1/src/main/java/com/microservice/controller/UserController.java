package com.microservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.microservice.dto.Address;
import com.microservice.entities.User;
import com.microservice.external.AddressExternal;
import com.microservice.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	AddressExternal addressExternal;

	@Autowired
	private UserService userService;
	
	@GetMapping("user")
	public List<User> userHandler() {
		List<User> user = userService.fetchUserList();
		return user;
	}

	@PostMapping("postuser")
	public ResponseEntity<String> postUserHandler(@RequestBody User user) {
		System.out.println(user);
		User users = userService.saveUser(user);
		return new ResponseEntity<String>(HttpStatus.CREATED);
	}

	@GetMapping("user/{id}")
	public User getUserById(@PathVariable Long id) {
		User user = userService.fetchUser(id);
		Address address = addressExternal.getAddress(id);
		user.setAddress(address);
		return user;
	}
}
