package com.aggarwal.EcommerceApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aggarwal.EcommerceApp.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

	boolean findByEmail(String email);

	boolean existsByEmail(String email);




}
