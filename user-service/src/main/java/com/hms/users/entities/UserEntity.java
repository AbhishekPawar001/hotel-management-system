package com.hms.users.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;
    private String userCode;
    private String userFullName;
    private String userEmail;
    private String userMobile;
    private String userDOB;
    private String userGender;
    private String userMaritalStatus;
    private String userNationality;
    private int userStatus;
    private String userCity;
    private String userState;
    private String userPostalCode;
    private String userEmailVerify;
    private LocalDateTime createdDate;
    private LocalDateTime lastUpdate;
}
