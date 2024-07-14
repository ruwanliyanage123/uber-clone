package com.uberclone.core.userservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user-service")
public class UserController {
    @GetMapping()
    public String creteUser() {
        return "hellow Im ruwan";
    }
}
