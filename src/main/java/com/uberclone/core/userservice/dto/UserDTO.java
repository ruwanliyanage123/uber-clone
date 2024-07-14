package com.uberclone.core.userservice.dto;

import com.uberclone.core.userservice.common.UserType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private String nic;
    private String address;
    private UserType userType;
}
