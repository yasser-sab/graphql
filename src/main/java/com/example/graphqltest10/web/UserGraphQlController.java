package com.example.graphqltest10.web;

import com.example.graphqltest10.dao.entities.Users;
import com.example.graphqltest10.service.UserManager;
import com.example.graphqltest10.service.dtos.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class UserGraphQlController {
    @Autowired
    private UserManager um;

    @QueryMapping
    public Users getUserByEmail(@Argument String email){
        return um.getUserByEmail(email);
    }

    @QueryMapping
    public Users getUserByDate(@Argument String date){
        return um.getUserByDateNaissance(date);
    }
    @MutationMapping
    public Users saveUser(@Argument UserDTO user){
        return um.saveUser(user);
    }

    @MutationMapping
    public Users deleteUserr(@Argument Long id){
        return um.deleteUser(id);
    }

}
