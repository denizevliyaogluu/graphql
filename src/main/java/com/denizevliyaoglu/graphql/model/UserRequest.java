package com.denizevliyaoglu.graphql.model;

import lombok.Data;

@Data
public class UserRequest {
    private Long id;
    private String username;
    private String phoneNumber;
    private Role role;


}
