package com.uberclone.core.userservice.entity;

import com.uberclone.core.userservice.common.UserType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user")
public class UserEntity {
    @Id
    @Column(name = "id")
    private long id;
    @Column(name = "firstName")
    private String firstName;
    @Column(name = "lastName")
    private String lastName;
    @Column(name = "userName")
    private String userName;
    @Column(name = "password")
    private String password;
    @Column(name = "nic")
    private String nic;
    @Column(name = "address")
    private String address;
    @Column(name = "userType")
    private UserType userType;
}
