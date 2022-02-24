package com.example.adminpage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {

/*here we create a method to redirect in homepage*/

    @GetMapping("/index")
    public String goHome(){
        return "index";
    }


/*write the method for login/logout*/

    @GetMapping("/login")
    public String login(){
        return "login";
    }


    @GetMapping("/logout")
    public String logout(){
        return "login";
    }


    /* adding a new user->registration*/
   @GetMapping("/register")
    public String register(){
        return "register";
    }




}
