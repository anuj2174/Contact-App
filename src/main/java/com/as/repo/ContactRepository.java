package com.as.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.as.entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
