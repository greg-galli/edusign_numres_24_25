package fr.numres.edusign.controllers;

import fr.numres.edusign.entities.User;
import fr.numres.edusign.repositories.UserRepository;
import fr.numres.edusign.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final IUserService userService;

    @Autowired
    public UserController(IUserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getUsers()
    {
        return userService.getUsers();
    }

    @PostMapping
    public User createUser(@RequestBody User user)
    {
        return userService.createAndFlushUser(user);
    }
}
