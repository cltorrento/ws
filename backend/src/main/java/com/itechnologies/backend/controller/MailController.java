package com.itechnologies.backend.controller;

import com.itechnologies.backend.model.Mail;
import com.itechnologies.backend.services.MailService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class MailController {
    private final MailService mailService;

    public MailController(MailService mailService) {
        this.mailService = mailService;
    }

    @PostMapping("/mail")
    public ResponseEntity<Mail> addMail(@RequestBody Mail mail){
        Mail newMail = mailService.addMail(mail);
        return new ResponseEntity<>(newMail, HttpStatus.CREATED);
    }

}
