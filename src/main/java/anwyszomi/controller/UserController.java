package anwyszomi.controller;

import anwyszomi.domain.User;
import anwyszomi.services.UserService;
import anwyszomi.services.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping(path = "/users")
    public List<User> getAllUsers() {
       return userService.getAllUsers();
    }

    @PostMapping(path = "/addUser", params ={"login", "password", "email"})
    public void addUser(User user){
        userService.addUser(user);
    }

    @DeleteMapping(path = "/users")
    public void deleteUser(@RequestParam(name = "id") Long id){
        userService.deleteUser(id);
    }
}
