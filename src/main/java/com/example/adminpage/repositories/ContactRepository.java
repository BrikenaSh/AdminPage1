package com.example.adminpage.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.adminpage.models.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
