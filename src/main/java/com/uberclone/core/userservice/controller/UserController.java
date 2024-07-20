package com.uberclone.core.userservice.controller;

import com.uberclone.core.userservice.dto.UserDTO;
import com.uberclone.core.userservice.service.api.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user-service")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping()
    public ResponseEntity<UserDTO> creteUser(@RequestBody UserDTO userDTO) {
        final UserDTO dto = userService.createPatient(userDTO);
        return new ResponseEntity<>(dto, HttpStatus.OK);
    }
}
