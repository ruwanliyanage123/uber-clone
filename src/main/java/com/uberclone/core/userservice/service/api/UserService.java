package com.uberclone.core.userservice.service.api;

import com.uberclone.core.userservice.dto.UserDTO;
import com.uberclone.core.userservice.entity.UserEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
public interface UserService {

    /**
     * To create userData
     *
     * @param userDTO user dto
     */
    public abstract UserDTO createUser(UserDTO userDTO);

    /**
     * To get all users
     *
     * @return all users
     */
    public abstract List<UserDTO> getAllUsers();

    /**
     * To getUser by Id
     *
     * @param userId get user by id
     * @return user by id
     */
    public abstract UserDTO getUserById(long userId);
}
