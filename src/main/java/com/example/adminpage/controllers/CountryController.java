package com.example.adminpage.controllers;

import com.example.adminpage.models.Country;

import com.example.adminpage.repositories.CountryRepository;
import com.example.adminpage.services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class CountryController {

    private final CountryService countryService;

    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }


    //Get All Countries

@GetMapping("/countries")
public String getCountries(Model model) {
    List<Country>countryList = countryService.getCountries();
    model.addAttribute("countries", countryList);
    return "country";
}


@PostMapping("/countries/addNew")

    public String addNew(Country country){
        countryService.save(country);
        return "redirect:/countries";
}

 @RequestMapping("countries/findById")
    @ResponseBody
    public Optional<Country> findById(int id){
        return countryService.findById(id);

 }

  @RequestMapping(value = "/countries/update", method = {RequestMethod.GET})
    public String update(Country country){
       countryService.save(country);
       return "redirect:/countries";

    }
}

