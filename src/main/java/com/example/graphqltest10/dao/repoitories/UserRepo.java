package com.example.graphqltest10.dao.repoitories;

import com.example.graphqltest10.dao.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepo extends JpaRepository<Users,Long> {
    Users findUsersByEmail(String email);
    @Query("select s from Users s where s.date_Naissance=:date")
    Users findByDate(String date);
}
