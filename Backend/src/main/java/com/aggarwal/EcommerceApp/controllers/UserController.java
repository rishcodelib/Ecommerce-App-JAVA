package com.aggarwal.EcommerceApp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aggarwal.EcommerceApp.Service.IUserService;
import com.aggarwal.EcommerceApp.entity.User;

@RestController
public class UserController {

	@Autowired
	private IUserService myuser;

	@GetMapping("/user")
	public List<User> GetAllUsers() {
		return myuser.getAllUser();
	}

	@PostMapping("/user")
	public void AddUser(@PathVariable("user")User user) {
		myuser.addUser(user);
		
	}

	@PostMapping("/{id}")
	public void DeleteUser(@PathVariable("id") int UserId) {
		myuser.deleteUser(UserId);

	}

	@PutMapping("/{id}")
	public void UpdateUser(@RequestBody User user) {
		myuser.updateUser(user);
	}

}