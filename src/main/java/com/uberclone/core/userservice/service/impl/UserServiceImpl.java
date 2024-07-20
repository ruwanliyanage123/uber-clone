package com.uberclone.core.userservice.service.impl;

import com.uberclone.core.userservice.dto.UserDTO;
import com.uberclone.core.userservice.service.api.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public UserDTO createPatient(UserDTO userDTO) {
        userDTO.setUserName(userDTO.getUserName()+" appended by service");
        userDTO.setFirstName(userDTO.getFirstName()+" appended by service");
        return userDTO;
    }
}
