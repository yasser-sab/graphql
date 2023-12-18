package com.example.graphqltest10.service.dtos;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@Builder
public class UserDTO {
    private String name;
    private String email;
    private String date_Naissance;
}
