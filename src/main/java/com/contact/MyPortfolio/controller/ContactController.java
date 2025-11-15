package com.contact.MyPortfolio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.contact.MyPortfolio.entity.ContactMessage;
import com.contact.MyPortfolio.service.ContactMessageService;

@RestController
@RequestMapping("/api/contact")
@CrossOrigin(origins = "*") // allow frontend access from anywhere
public class ContactController {

    @Autowired
    private ContactMessageService service;

    @PostMapping
    public ResponseEntity<String> submitMessage(@RequestBody ContactMessage message) {
        service.saveMessage(message);
        return ResponseEntity.ok("Message Saved Successfully");
    }
}
