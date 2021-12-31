package com.careerinfotech.usermanagement.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.careerinfotech.usermanagement.dto.EmailandaPasswordSetting;
import com.careerinfotech.usermanagement.dto.UserSignIn;
import com.careerinfotech.usermanagement.dto.UserSignUp;
import com.careerinfotech.usermanagement.entity.UserProfile;
import com.careerinfotech.usermanagement.repository.UserDao;
import com.careerinfotech.usermanagement.utils.EmailUtils;

@Service
public class UserService {

	@Autowired
	private UserDao repo;

	@Autowired
	private EmailUtils util;

	public UserSignUp saveUserData(UserSignUp signUp) {
		ModelMapper mapper = new ModelMapper();
		UserProfile profile = mapper.map(signUp, UserProfile.class);
//		profile.setPassword(util.generateRandomPassword());
		UserProfile save = repo.save(profile);
		boolean sendEmail = util.sendEmail(signUp.getEmail(),"welcome "+signUp.getFirstName()+"Your Account is Generated",
				util.readEmailFromHtml(profile));
		if (sendEmail) {
			profile.setPassword(util.generateRandomPassword());
		}
		return signUp;
	}

	public String saveUserSignIn(UserSignIn signIn) {
		UserProfile findByEmailandPassword = repo.findByEmailandPassword(signIn.getEmail(), signIn.getPassword());
		if (findByEmailandPassword == null) {
			return "Invalid email or password...";
		}
		return "login Successfully...";
	}

	public List<UserProfile> getUserData() {
		List<UserProfile> findAll = repo.findAll();
		return findAll;
	}

	public String generateNewPassword(EmailandaPasswordSetting eSet) {
		UserProfile user = repo.findByEmailandPassword(eSet.getEmail(), eSet.getPassword());
		if (user == null) {
			return "Enter correct password";
		}
		if (eSet.getNewPwd().equals(eSet.getConfirmPwd())) {
			user.setPassword(eSet.getNewPwd());
			UserProfile save = repo.save(user);
			return "Password successfully changed...";
		}
		return "Password not matched or wrong password...";

	}

	public void deleteUserById(Long id) {
		repo.deleteById(id);
	}

	public String forgetEmailAndPassword(String email) {
		UserProfile user = repo.findByEmail(email);
		if (user == null) {
			return "Enter Corrrect email...";
		}
		user.setPassword(user.getFirstName() +123);
		UserProfile save = repo.save(user);
		boolean sendEmail = util.sendEmail(email, "Your Login Successfully Done ",
				"Congrats!...Your Password is " + save.getPassword());
		return "Successfully sent password to your email...";
		
	}

}
