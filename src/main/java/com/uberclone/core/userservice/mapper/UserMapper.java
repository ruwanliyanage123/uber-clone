package com.uberclone.core.userservice.mapper;

import com.uberclone.core.userservice.dto.UserDTO;
import com.uberclone.core.userservice.entity.UserEntity;

public class UserMapper {
    public static UserDTO mapToDto(UserEntity userEntity) {
        UserDTO userDTO = new UserDTO();
        userDTO.setUserName(userEntity.getUserName());
        userDTO.setFirstName(userEntity.getFirstName());
        userDTO.setAddress(userEntity.getAddress());
        userDTO.setNic(userEntity.getNic());
        return userDTO;
    }

    public static UserEntity mapToEntity(UserDTO userDto) {
        UserEntity userEntity = new UserEntity();
        userEntity.setUserName(userDto.getUserName());
        userEntity.setFirstName(userDto.getFirstName());
        userEntity.setAddress(userDto.getAddress());
        userEntity.setNic(userDto.getNic());
        return userEntity;
    }
}
