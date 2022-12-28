package com.hms.users.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDTO {
    private String userCode;
    private String userFullName;
    private String userEmail;
    private String userMobile;
    private String userDOB;
    private String userGender;
    private String userMaritalStatus;
    private String userNationality;
    private String userStatus;
    private String userCity;
    private String userState;
    private String userPostalCode;
}
