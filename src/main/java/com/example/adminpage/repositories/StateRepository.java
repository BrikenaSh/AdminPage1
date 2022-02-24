package com.example.adminpage.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.adminpage.models.State;

@Repository
public interface StateRepository extends JpaRepository<State, Integer> {

}
