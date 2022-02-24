package com.example.adminpage.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.adminpage.models.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {

}
