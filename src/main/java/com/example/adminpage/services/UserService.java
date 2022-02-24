package com.example.adminpage.services;

import com.example.adminpage.models.User;
import com.example.adminpage.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired private BCryptPasswordEncoder encoder;

    @Autowired private UserRepository userRepository;

    public void save(User user){
/*here we have to encode tha password and then we can save the new user*/
    user.setPassword(encoder.encode(user.getPassword()));
    userRepository.save(user);

    }

}
