package com.example.greetingappcrud.service;


import com.example.greetingappcrud.model.User;
import com.example.greetingappcrud.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class GreetingService {
    @Autowired
    GreetingRepository greetingRepository;
    public static String getMessage(){
        return "Hello";
    }

    public static String messageByName(String fname, String lname){
        return "Hello " + fname + " " + lname;
    }


    public User saveRepo(User user){
        User user1=new User(user);
        greetingRepository.save(user1);
        return user1;
    }
//    public String save(User user){
//        User user1=new User();
//        greetingRepository.save(user);
//        return "hello" + user1;
//    }
}