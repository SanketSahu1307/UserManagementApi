package com.careerinfotech.usermanagement.controller;

import java.util.List;

import javax.mail.internet.ContentType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.careerinfotech.usermanagement.dto.EmailandaPasswordSetting;
import com.careerinfotech.usermanagement.dto.UserSignIn;
import com.careerinfotech.usermanagement.dto.UserSignUp;
import com.careerinfotech.usermanagement.entity.UserProfile;
import com.careerinfotech.usermanagement.service.UserService;
import com.careerinfotech.usermanagement.utils.EmailUtils;


@CrossOrigin(origins = "http://localhost:4200/")
@RestController
public class UserResource {
	
	@Autowired
	private UserService serv;
	
	@Autowired
	private EmailUtils util;
	
	@GetMapping("/msg")
	public String msg() {
		return "My name is sanket...";
	}
	
	@PostMapping(value = "/signUp",produces = MediaType.APPLICATION_JSON_VALUE)
	public UserSignUp saveUserSignUp(@RequestBody UserSignUp user) {
		UserSignUp saveUserData = serv.saveUserData(user);
		return saveUserData;
	}
	
	@PostMapping("/signIn")
	public String userSignIn(@RequestBody UserSignIn signIn) {
		String allUserData = serv.saveUserSignIn(signIn);
		return allUserData;
	}
	
	@GetMapping("/userData")
	public List<UserProfile> getUserSignUp() {
		List<UserProfile> userData = serv.getUserData();
		return userData;
	}
	
	@PutMapping("/setPasswordandEmail")
	public String setEmailandPassword(@Validated @RequestBody EmailandaPasswordSetting user) {
		String generateNewPassword = serv.generateNewPassword(user);
		return generateNewPassword;
	}
	
	@DeleteMapping("delete/{id}")
	public String userDelete(@PathVariable("id") Long id) {
		serv.deleteUserById(id);
		return "user delete successfully... ";
	}
	
	@PostMapping("/forget/{email}")
	public String forgetPassword(@PathVariable("email")String email) {
		String forgetEmailAndPassword = serv.forgetEmailAndPassword(email);
		return forgetEmailAndPassword;
	}
	
	@GetMapping("/emailHtml")
	public String getEmailBody(UserProfile users) {
		EmailUtils util = new EmailUtils();
		return util.readEmailFromHtml(users);
	}
	
	
//	@GetMapping("/email")
//	public boolean emailEca() {
//		return util.sendEmail("sanketgupta315@gmail.com", "First Email Example Learning", "welcome Sanket now u can email anyone...using your api.");
//		
//	}
	
	

}
