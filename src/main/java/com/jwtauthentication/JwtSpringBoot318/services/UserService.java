package com.jwtauthentication.JwtSpringBoot318.services;
import com.jwtauthentication.JwtSpringBoot318.controllers.AuthController;
import com.jwtauthentication.JwtSpringBoot318.entities.User;
import com.jwtauthentication.JwtSpringBoot318.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {


    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;



    public List<User> getUser(){

        return userRepository.findAll();
    }
   public User createUser(User user){
        user.setUserId(UUID.randomUUID().toString());
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
   }
}
