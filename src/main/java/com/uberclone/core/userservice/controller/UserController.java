package com.uberclone.core.userservice.controller;

import com.uberclone.core.userservice.dto.UserDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user-service")
public class UserController {
    @PostMapping()
    public ResponseEntity<UserDTO> creteUser(@RequestBody UserDTO userDTO) {
        return new ResponseEntity<>(userDTO, HttpStatus.OK);
    }
}
