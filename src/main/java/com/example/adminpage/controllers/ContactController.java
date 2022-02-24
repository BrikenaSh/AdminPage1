package com.example.adminpage.controllers;

import com.example.adminpage.models.Contact;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class ContactController {


    //Get All Contacts
    @GetMapping("/contacts")
    public String findAll(){

        return "contact";
    }



}
