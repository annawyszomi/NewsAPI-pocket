package anwyszomi.controller;

import anwyszomi.domain.User;
import anwyszomi.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping(path = "/users")
    public ResponseEntity<?> getAllUsers() {
       return new ResponseEntity<Page<User>>(userService.findAll(Pageable.unpaged()),HttpStatus.OK);
    }

    @PostMapping(path = "/addUser")
    public ResponseEntity<?> addUser(@RequestBody User user){
        userService.add(user);
        return new ResponseEntity<Void>( HttpStatus.CREATED);
    }

    @GetMapping(path="users/{id}")
    public ResponseEntity<?>findById(@PathVariable Long id){
        Optional<User> userOpt= userService.findById(id);
        if(userOpt.isPresent()){
            return new ResponseEntity<Optional<User>>(userOpt,HttpStatus.OK);
        }
        return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping(path = "/delete/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable Long id) {
        Optional<User>userOpt = userService.findById(id);
      if(userOpt.isPresent()){
          userService.delete(id);
          return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
        }
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    @PutMapping("/update")
    public ResponseEntity<?> updateUser(@RequestBody User user){
        Optional<User> userOpt = userService.update(user);
        if(userOpt.isPresent()) {
            return new ResponseEntity<Optional<User>>(userOpt, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
