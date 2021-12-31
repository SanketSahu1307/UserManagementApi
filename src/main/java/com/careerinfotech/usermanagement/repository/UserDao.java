package com.careerinfotech.usermanagement.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.careerinfotech.usermanagement.entity.UserProfile;

@Repository
public interface UserDao extends JpaRepository<UserProfile, Long>{

	@Query("select s from UserProfile s where s.email=:email and s.password=:password")
	UserProfile findByEmailandPassword(@Param("email")String email,@Param("password")String password);
//	UserProfile findByEmailandPassword(String email,String password);

	UserProfile findByEmail(String email);

	



}
