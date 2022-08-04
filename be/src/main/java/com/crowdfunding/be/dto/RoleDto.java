package com.crowdfunding.be.dto;

import com.crowdfunding.be.types.PrivilegeType;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Data
public class RoleDto extends BaseDto {

    @NotBlank
    private String name;

    @NotNull
    @NotEmpty(message = "authorities list cannot be empty.")
    private Set<PrivilegeType> authorities;
}
