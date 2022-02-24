package com.example.adminpage.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.adminpage.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    /*find a user by his username*/

    User findByUsername(String username);

}