package com.example.adminpage.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.adminpage.models.JobTitle;


@Controller
public class JobTitleController {


    //Get All JobTitles
    @GetMapping("jobTitles")
    public String findAll(){

        return "jobTitle";
    }



}
