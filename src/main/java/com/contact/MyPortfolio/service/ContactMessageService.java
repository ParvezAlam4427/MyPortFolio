package com.contact.MyPortfolio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.contact.MyPortfolio.entity.ContactMessage;
import com.contact.MyPortfolio.repository.ContactMessageRepository;

@Service
public class ContactMessageService {

    @Autowired
    private ContactMessageRepository repo;

    public void saveMessage(ContactMessage msg) {
        repo.save(msg);
    }
}
