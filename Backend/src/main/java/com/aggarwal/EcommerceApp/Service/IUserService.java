package com.aggarwal.EcommerceApp.Service;

import java.util.List;

import com.aggarwal.EcommerceApp.entity.Users;

public interface IUserService {
	

	public List<Users> getAllUsers();
	
	public String addUser(Users user);
	
	public void updateUser(Users user);

	public void deleteUser(int UserId);
}
