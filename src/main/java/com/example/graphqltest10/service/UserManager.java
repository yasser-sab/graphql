package com.example.graphqltest10.service;

import com.example.graphqltest10.dao.entities.Users;
import com.example.graphqltest10.dao.repoitories.UserRepo;
import com.example.graphqltest10.service.dtos.UserDTO;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserManager implements IUserManager {
    @Autowired
    private UserRepo ur;

    @Override
    public Users getUserByEmail(String email) {
        return ur.findUsersByEmail(email);
    }

    @Override
    public Users getUserByDateNaissance(String date) {
        return ur.findByDate(date);
    }

    @Override
    public Users saveUser(UserDTO ud){
        return ur.save(new Users(null,ud.getName(),ud.getEmail(),ud.getDate_Naissance()));
    }

    @Override
    public Users deleteUser(Long id){
        Users s = ur.findById(id).get();
        ur.delete(s);
        return s;
    }

}