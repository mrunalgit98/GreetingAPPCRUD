package com.example.greetingappcrud.Controller;

import com.example.greetingappcrud.model.User;
import com.example.greetingappcrud.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class GreetingController {
    @Autowired
    GreetingService greetingService;
    @PostMapping("/save")
    public User saveRepo (@RequestBody User user){
        User user1= greetingService.saveRepo(user);
//       list.add(user1);
        return user1;
    }
    @GetMapping("/get/{id}")
    public Optional<User>getById(@PathVariable int id){
        Optional<User>response=greetingService.getById(id);
        return response;
    }
}
