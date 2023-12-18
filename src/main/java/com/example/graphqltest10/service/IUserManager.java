package com.example.graphqltest10.service;

import com.example.graphqltest10.dao.entities.Users;
import com.example.graphqltest10.service.dtos.UserDTO;

public interface IUserManager {
    Users getUserByEmail(String email);
    Users getUserByDateNaissance(String date);
    Users saveUser(UserDTO ud);
    public Users deleteUser(Long id);
}
