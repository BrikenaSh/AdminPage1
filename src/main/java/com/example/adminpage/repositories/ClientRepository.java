package com.example.adminpage.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.adminpage.models.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {



}
