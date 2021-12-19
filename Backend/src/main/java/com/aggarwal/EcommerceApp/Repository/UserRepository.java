package com.aggarwal.EcommerceApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aggarwal.EcommerceApp.entity.User;
import com.aggarwal.EcommerceApp.entity.Users;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
