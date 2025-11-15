package com.contact.MyPortfolio.service;

import com.contact.MyPortfolio.entity.ContactMessage;
import com.contact.MyPortfolio.repository.ContactMessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactMessageService {

    @Autowired
    private ContactMessageRepository repo;

    public void save(ContactMessage msg) {
        repo.save(msg);
    }
}
