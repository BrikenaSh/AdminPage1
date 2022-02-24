package com.example.adminpage.controllers;

import java.util.Optional;
import java.util.Properties;

import com.example.adminpage.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.adminpage.models.User;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;


@Controller
public class UserController {

@Autowired private UserService userService;

//Get All Users
@GetMapping("/users")
 public String findAll() {
     return "User";

}


//Modified method to Add a new user User
@PostMapping(value = "users/addNew")

public RedirectView addNew(User user, RedirectAttributes redir) {
    userService.save(user);
    RedirectView redirectView = new RedirectView("/login", true);
      redir.addFlashAttribute("message", "You successfully registered! You can now login");
       return redirectView;
}


}

