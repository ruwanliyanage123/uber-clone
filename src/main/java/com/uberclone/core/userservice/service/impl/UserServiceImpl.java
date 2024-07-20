package com.uberclone.core.userservice.service.impl;

import com.uberclone.core.userservice.dao.UserRepository;
import com.uberclone.core.userservice.dto.UserDTO;
import com.uberclone.core.userservice.entity.UserEntity;
import com.uberclone.core.userservice.mapper.UserMapper;
import com.uberclone.core.userservice.service.api.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDTO createUser(UserDTO userDTO) {
        final UserEntity requestEntity = UserMapper.mapToEntity(userDTO);
        final UserEntity responseEntity = userRepository.save(requestEntity);
        return UserMapper.mapToDto(responseEntity);
    }

    @Override
    public List<UserDTO> getAllUsers() {
        final List<UserEntity> userEntity = userRepository.findAll();
        final List<UserDTO> userDTOS = userEntity.stream().map(UserMapper::mapToDto).toList();
        return userDTOS;
    }

    @Override
    public UserDTO getUserById(long userId) {
        final Optional<UserEntity> userEntity = userRepository.findById(userId);
        return UserMapper.mapToDto(userEntity.get());
    }

}
