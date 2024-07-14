package com.uberclone.core.userservice.service.api;

import com.uberclone.core.userservice.dto.UserDTO;

public interface UserService {

    /**
     * To create userData
     *
     * @param userDTO user dto
     */
    public abstract void createPatient(UserDTO userDTO);
}
