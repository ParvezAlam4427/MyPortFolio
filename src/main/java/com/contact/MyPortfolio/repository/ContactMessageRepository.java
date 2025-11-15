package com.contact.MyPortfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.contact.MyPortfolio.entity.ContactMessage;

public interface ContactMessageRepository extends JpaRepository<ContactMessage, Long> {
}
