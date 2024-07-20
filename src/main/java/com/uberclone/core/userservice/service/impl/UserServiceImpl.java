package com.uberclone.core.userservice.service.impl;

import com.uberclone.core.userservice.dao.UserRepository;
import com.uberclone.core.userservice.dto.UserDTO;
import com.uberclone.core.userservice.entity.UserEntity;
import com.uberclone.core.userservice.mapper.UserMapper;
import com.uberclone.core.userservice.service.api.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDTO createPatient(UserDTO userDTO) {
        final UserEntity requestEntity = UserMapper.mapToEntity(userDTO);
        final UserEntity responseEntity = userRepository.save(requestEntity);
        return UserMapper.mapToDto(responseEntity);
    }
}
