package chat.bot.controller;

import chat.bot.models.User;
import chat.bot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/saveUser")
    public void create(@RequestBody User user){
        userService.saveUser(user);
    }

    @GetMapping("/getUser/{userId}")
    public Optional<User> getUser(@PathVariable UUID userId){
        return userService.getUserById(userId);
    }

    @PostMapping("/getAllUser")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @DeleteMapping("/deleteUser/{userId}")
    public void deleteUser(@PathVariable UUID userId){
        userService.deleteUser(userId);
    }
}
