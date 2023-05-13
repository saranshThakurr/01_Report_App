package com.saranshit.utils;

import java.io.File;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

@Component
public class EmailSender {
	
	@Autowired
	private JavaMailSender mailSender;
	
	public boolean sendEmail(String to,String body,String subject,File f) {
		boolean isSent=false;
		try {
		MimeMessage mime=mailSender.createMimeMessage();
		MimeMessageHelper helper=new MimeMessageHelper(mime,true);
		helper.setTo(to);
		helper.setSubject(subject);
		helper.setText(body,true);
		helper.addAttachment("plan_info", f);
		mailSender.send(mime);
		isSent=true;
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		return isSent;
	}
}
