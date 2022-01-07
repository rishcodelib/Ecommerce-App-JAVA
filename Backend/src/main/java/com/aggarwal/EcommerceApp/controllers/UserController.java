package com.aggarwal.EcommerceApp.controllers;

import java.util.List;

import org.hibernate.exception.DataException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
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

	@PostMapping("/user/login")
	public void login(@PathVariable("email") String email, String password) {
		IUserService.login(email, password);

	}

	@PostMapping("/user")
	@ResponseBody
	public void AddUser(User user) {
		try {
			myuser.addUser(user);
		} catch (DataIntegrityViolationException e) {
			e.printStackTrace();
		}

	}

	@PostMapping("user/{id}")
	public void DeleteUser(@PathVariable("id") int UserId) {
		try {

			myuser.deleteUser(UserId);
		} catch (NullPointerException e) {
			e.printStackTrace();
		} catch (DataException d) {
			d.printStackTrace();
		}

	}

	@PutMapping("user/{id}")
	public void UpdateUser(@RequestBody User user) {
		myuser.updateUser(user);
	}

}