package com.uberclone.core.userservice.service.api;

import com.uberclone.core.userservice.dto.UserDTO;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public interface UserService {

    /**
     * To create userData
     *
     * @param userDTO user dto
     */
    public abstract UserDTO createPatient(UserDTO userDTO);
}
