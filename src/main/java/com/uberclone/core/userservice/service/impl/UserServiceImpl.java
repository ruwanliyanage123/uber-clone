package com.uberclone.core.userservice.service.impl;

import com.uberclone.core.userservice.dto.UserDTO;
import com.uberclone.core.userservice.service.api.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public UserDTO createPatient(UserDTO userDTO) {
        final UserDTO userDTO1 = new UserDTO();
        userDTO1.setUserName(userDTO1.getUserName()+" appended");
        return userDTO1;
    }
}
