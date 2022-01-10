package com.aggarwal.EcommerceApp.Service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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

	public void addUser(User user) {

		Urepo.save(user);

	}

	public void updateUser(User user) {
		try {
			Urepo.save(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void deleteUser(int UserId) {
		try {
			Urepo.deleteById(UserId);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public boolean login(String email, String password) {

		try {
			return Urepo.existsByEmail(email);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;

	}

	@Override
	public User getUser(int userId) {

		return Urepo.findById(userId).get();

	}

}
