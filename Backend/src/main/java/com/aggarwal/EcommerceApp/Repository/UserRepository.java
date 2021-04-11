package com.aggarwal.EcommerceApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aggarwal.EcommerceApp.entity.Users;


public interface UserRepository extends JpaRepository<Users, Integer>{

}
