package com.itechnologies.backend.services;

import com.itechnologies.backend.model.Mail;
import com.itechnologies.backend.repository.MailRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class MailService {
    private final MailRepository mailRepository;

    public MailService(MailRepository mailRepository) {
        this.mailRepository = mailRepository;
    }

    public Mail addMail(Mail mail){
        return mailRepository.save(mail);
    }
}
