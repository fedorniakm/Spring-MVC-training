package com.narentie.conference.controller;

import com.narentie.conference.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/user")
    public User getUser(@RequestParam(value = "firstname", defaultValue = "Maksym") String firstname,
                        @RequestParam(value = "lastname", defaultValue = "F.") String lastname,
                        @RequestParam(value = "age", defaultValue = "22") int age) {
        var user = new User();

        user.setFirstName(firstname);
        user.setLastName(lastname);
        user.setAge(age);

        return user;
    }

    @PostMapping("/user")
    public User postUser(User user) {
        System.out.println("User firstName: " + user.getFirstName());

        return user;
    }
}
