package com.example.graphqltest10.service.mappers;

import com.example.graphqltest10.dao.entities.Users;
import com.example.graphqltest10.service.dtos.UserDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {
    private final ModelMapper modelMapper=new ModelMapper();

    public Users toUser(UserDTO user){
        return this.modelMapper.map(user,Users.class);
    }
}
