package com.mailsender.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mailsender.mail.MockMailSender;
import com.mailsender.mail.SmtpMailSender;

@Configuration
public class Config {

	@Bean("mock")
	public MockMailSender mockMail() {
		return new MockMailSender();
	}
	
	@Bean("smtp")
	public SmtpMailSender smtpMail() {
		return new SmtpMailSender();
	}	
}