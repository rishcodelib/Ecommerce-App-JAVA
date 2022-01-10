package com.aggarwal.EcommerceApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aggarwal.EcommerceApp.entity.UserCredentials;

@Repository
public interface UserCredentialRepository extends JpaRepository<UserCredentials, Integer> {

}
