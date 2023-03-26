package com.mail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mail.entity.Entity;
import com.mail.service.EmailService;

@RestController
public class EmailController {

	@Autowired(required = true)
     private EmailService emailService;

	@PostMapping("/sendMail")
    public String sendMail(@RequestBody Entity entity) {
    String status = emailService.sendSimpleMail(entity);
    return status;
	}
    
    @GetMapping("/")
	public String Demo() {
		return"maha";
    }
}
