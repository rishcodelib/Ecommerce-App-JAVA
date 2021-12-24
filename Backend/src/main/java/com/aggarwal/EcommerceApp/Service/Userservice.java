package com.aggarwal.EcommerceApp.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aggarwal.EcommerceApp.Repository.UserRepository;
import com.aggarwal.EcommerceApp.entity.User;

@Service
public class Userservice implements IUserService {

	@Autowired
	private UserRepository Urepo;

	public List<User> getAllUser() {
		List<User> User = new ArrayList<>();
		Urepo.findAll().forEach(User::add);
		return User;

	}

	public String addUser(User user) {
			Urepo.save(user);
			return "user Added Success";
	}

	public void updateUser(User user) {
		Urepo.save(user);
	}

	public void deleteUser(int UserId) {
		Urepo.deleteById(UserId);
	}

	

	
}
