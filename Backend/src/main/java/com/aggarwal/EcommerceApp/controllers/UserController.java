package com.aggarwal.EcommerceApp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aggarwal.EcommerceApp.Services.UserService;
import com.aggarwal.EcommerceApp.entity.Users;

@RestController
public class UserController {

	@Autowired
	private UserService myuser;

	@RequestMapping("/users")
	public List<Users> GetAllUsers() {
		return myuser.getAllUsers();
//		return "All Users";
	}

	@PostMapping("/user")
	public void AddUser(Users user) {
		myuser.addUser(user);
		
	}

	@PostMapping("/user/{id}")
	public void DeleteUser(@PathVariable("id") int UserId) {
		myuser.deleteUser(UserId);

	}

	@PutMapping
	public void UpdateUser(@RequestBody Users user) {
		myuser.updateUser(user);
	}

}