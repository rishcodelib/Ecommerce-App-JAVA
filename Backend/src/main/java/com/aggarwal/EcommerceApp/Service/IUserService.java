package com.aggarwal.EcommerceApp.Service;

import java.util.List;

import com.aggarwal.EcommerceApp.entity.User;

public interface IUserService {

	public List<User> getAllUser();

	public String addUser(User user);

	public void updateUser(User user);

	public void deleteUser(int UserId);

	public boolean login(String email, String password) ;

	public User getUser(int userId);
}
