package guru.springframework.controllers;

import guru.springframework.domain.UserCommand;
import guru.springframework.entities.User;

public class UserController {

    User saveUser(UserCommand command){
        // fake implementation
        return new User();
    }
}
