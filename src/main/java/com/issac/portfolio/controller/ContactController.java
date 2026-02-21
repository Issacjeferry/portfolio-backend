package com.issac.portfolio.controller;

import com.issac.portfolio.entity.ContactMessage;
import com.issac.portfolio.service.ContactMessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/contact")
@RequiredArgsConstructor
public class ContactController {

    private final ContactMessageService contactMessageService;

    @PostMapping
    public String sendMessage(@RequestBody ContactMessage message) {
        contactMessageService.saveMessage(message);
        return "Message sent successfully";
    }
}
