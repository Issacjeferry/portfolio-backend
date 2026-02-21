package com.issac.portfolio.service;

import com.issac.portfolio.entity.ContactMessage;
import com.issac.portfolio.repository.ContactMessageRepository;
import com.issac.portfolio.service.ContactMessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ContactMessageServiceImpl implements ContactMessageService {

    private final ContactMessageRepository repository;

    @Override
    public ContactMessage saveMessage(ContactMessage message) {
        return repository.save(message);
    }
}
