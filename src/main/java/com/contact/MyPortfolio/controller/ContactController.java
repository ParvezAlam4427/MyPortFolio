package com.contact.MyPortfolio.controller;

import com.contact.MyPortfolio.entity.ContactMessage;
import com.contact.MyPortfolio.service.ContactMessageService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/contact")
@CrossOrigin(origins = "*")  // allow HTML/JS requests
public class ContactController {

    @Autowired
    private ContactMessageService service;

    @PostMapping
    public ResponseEntity<String> submitMessage(@RequestBody ContactMessage msg) {
        service.save(msg);
        return ResponseEntity.ok("Message saved successfully!");
    }
}