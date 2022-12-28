package com.hms.users.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RequestDTO {
    @NotBlank
    @NotBlank(message = "name must not be empty")
    private String userFullName;
    @Email
    @NotNull(message = "email must not be empty")
    private String userEmail;
    @Size(min = 10, max = 10, message = "mobile number must be 10 character")
    @NotNull(message = "mobile number must not be empty")
    private String userMobile;
    @NotNull(message = "DOB must not be empty")
    private String userDOB;
    @NotNull(message = "gender must not be empty")
    private String userGender;
    @NotNull(message = "your marital status must not be empty")
    private String userMaritalStatus;
    @NotNull(message = "nationality must not be empty")
    private String userNationality;
    @NotNull(message = "city must not be empty")
    private String userCity;
    @NotNull(message = "state must not be empty")
    private String userState;
    @NotNull(message = "postal code must not be empty")
    private String userPostalCode;
}
