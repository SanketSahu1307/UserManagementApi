package com.careerinfotech.usermanagement.utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Iterator;
import java.util.Random;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import com.careerinfotech.usermanagement.dto.UserSignUp;
import com.careerinfotech.usermanagement.entity.UserProfile;

import lombok.Data;

@Data
@Component
public class EmailUtils {

	@Autowired
	private JavaMailSender mailSender;

	public boolean sendEmail(String to, String subject, String body) {
		MimeMessage mimeMessage = mailSender.createMimeMessage();
		boolean isSent = false;
		try {
			MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage, true);
			messageHelper.setTo(to);
			messageHelper.setSubject(subject);
			messageHelper.setText(body);
			mailSender.send(messageHelper.getMimeMessage());
			isSent = true;

		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return isSent;
	}

	public String readEmailFromHtml(UserProfile users) {
		String emailBody = "";
		String file = "welcome.html";
		try {
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String line = bufferedReader.readLine();
			StringBuffer buffer = new StringBuffer();
			while (line != null) {
				buffer.append(line);
				line=bufferedReader.readLine();
			}
			emailBody=buffer.toString();
			emailBody=emailBody.replace("{name}",users.getFirstName()+users.getLastName());
			emailBody=emailBody.replace("{password}",users.getPassword());
		} catch (Exception e) {
			System.out.println("error occured");
			e.printStackTrace();
		}
		return emailBody;
	}
	
	
	public String generateRandomPassword() {
		String charSeq = "ABCDEFGHIJKLMNOPWRSTUVXYZ1234567890@#$";
		Random random = new Random();
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<8;i++) {
			int randomSeq = random.nextInt(charSeq.length());
			char password = charSeq.charAt(randomSeq);
			sb.append(password);
		}
		return sb.toString();
		
	}

}
