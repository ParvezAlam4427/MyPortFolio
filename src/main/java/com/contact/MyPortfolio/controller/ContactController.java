package com.contact.MyPortfolio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;   // <-- THIS covers PostMapping & GetMapping
import com.contact.MyPortfolio.entity.ContactMessage;
import com.contact.MyPortfolio.service.ContactMessageService;

@RestController
@RequestMapping("/api/contact")
@CrossOrigin(origins = "*")
public class ContactController {

    @Autowired
    private ContactMessageService service;

    @GetMapping("/test")
    public String test() {
        return "Backend is working!";
    }

    @PostMapping
    public ResponseEntity<String> submitMessage(@RequestBody ContactMessage message) {
        service.saveMessage(message);
        return ResponseEntity.ok("Message Saved Successfully");
    }
}
