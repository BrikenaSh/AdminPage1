package com.example.adminpage.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.adminpage.models.Location;

@Repository
public interface LocationRepository extends CrudRepository<Location, Integer> {

}