package com.example.greetingappcrud.Controller;

import com.example.greetingappcrud.model.User;
import com.example.greetingappcrud.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
}
