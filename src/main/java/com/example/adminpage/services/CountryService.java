package com.example.adminpage.services;

import com.example.adminpage.models.Country;
import com.example.adminpage.repositories.CountryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountryService {
/*write a method to return a list of countries that we added manually in db*/

    private final CountryRepository countryRepository;

         public CountryService(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }
         public List<Country> getCountries(){
         return countryRepository.findAll();

    }

    public void save(Country country) {
        countryRepository.save(country);
    }



    //get by Id and update data
    public Optional<Country> findById(int id) {
          return countryRepository.findById(id);

    }


}
