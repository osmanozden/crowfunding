package com.crowdfunding.be.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto extends BaseDto{
    @NotBlank
    @Email
    private String email;
    private List<RoleDto> roles;

    private String password;

    @NotEmpty
    private String firstName;

    @NotEmpty private String lastName;

    private String resetKey;

    private TokenDto tokenDto;

    private String phoneNumber;

    private long companyId;

    private String userName;

    public UserDto(String name, String surName, String email, List<RoleDto> roles) {
        this.firstName = name;
        this.lastName = surName;
        this.email = email;
        this.roles = roles;
    }

    public UserDto(String email, String pass) {
        this.email = email;
        this.password = pass;
    }
}
