package com.issac.portfolio.service;

import com.issac.portfolio.entity.ContactMessage;

import java.util.List;

public interface ContactMessageService {
    ContactMessage saveMessage(ContactMessage message);

    List<ContactMessage> getAllContacts();
}
