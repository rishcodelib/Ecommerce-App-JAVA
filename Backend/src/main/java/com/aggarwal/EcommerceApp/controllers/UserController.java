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
import org.springframework.web.bind.annotation.RequestParam;
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

	@GetMapping("/user/{id}")
	public User getUser(@RequestParam("userId") int userId) {
		System.out.println(userId);
		return myuser.getUser(userId);
	}

	@PostMapping("/user/signin")
	public Boolean signin(@RequestParam("email") String email, @RequestParam("password") String password) {
		return myuser.login(email, password);

	}

	@PostMapping("/user")
	@ResponseBody
	public void addUser(User user) {
		try {
			myuser.addUser(user);
		} catch (DataIntegrityViolationException e) {
			e.printStackTrace();
		}

	}

	@PostMapping("user/{id}")
	public void deleteUser(@PathVariable("id") int UserId) {
		try {

			myuser.deleteUser(UserId);
		} catch (NullPointerException e) {
			e.printStackTrace();
		} catch (DataException d) {
			d.printStackTrace();
		}

	}

	@PutMapping("user/{id}")
	public void updateUser(@RequestBody User user) {
		myuser.updateUser(user);
	}

}