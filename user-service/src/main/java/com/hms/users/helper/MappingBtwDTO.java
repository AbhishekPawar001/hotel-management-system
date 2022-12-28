package com.hms.users.helper;

import com.hms.users.dtos.RequestDTO;
import com.hms.users.dtos.ResponseDTO;
import com.hms.users.entities.UserEntity;

import java.time.LocalDateTime;

public class MappingBtwDTO {
	
	private MappingBtwDTO() {} 
	
    public static UserEntity dtoToUser(RequestDTO requestDTO) {
        UserEntity userEntity = new UserEntity();
        userEntity.setUserCode(HelperUtility.getCode());
        userEntity.setUserFullName(requestDTO.getUserFullName());
        userEntity.setUserDOB(requestDTO.getUserDOB());
        userEntity.setUserCity(requestDTO.getUserCity());
        userEntity.setUserEmail(requestDTO.getUserEmail());
        userEntity.setUserGender(requestDTO.getUserGender());
        userEntity.setUserMobile(requestDTO.getUserMobile());
        userEntity.setUserNationality(requestDTO.getUserNationality());
        userEntity.setUserState(requestDTO.getUserState());
        userEntity.setCreatedDate(LocalDateTime.now());
        userEntity.setLastUpdate(LocalDateTime.now());
        userEntity.setUserStatus(1);
        userEntity.setUserPostalCode(requestDTO.getUserPostalCode());
        userEntity.setUserMaritalStatus(requestDTO.getUserMaritalStatus());
        return userEntity;
    }

    public static ResponseDTO userToDto(UserEntity userEntity) {
        ResponseDTO responseDTO = new ResponseDTO();
        responseDTO.setUserCity(userEntity.getUserCity());
        responseDTO.setUserCode(userEntity.getUserCode());
        responseDTO.setUserGender(userEntity.getUserGender());
        responseDTO.setUserEmail(userEntity.getUserEmail());
        responseDTO.setUserDOB(userEntity.getUserDOB());
        responseDTO.setUserMobile(userEntity.getUserMobile());
        responseDTO.setUserState(userEntity.getUserState());
        responseDTO.setUserNationality(userEntity.getUserNationality());
        responseDTO.setUserStatus(getUserStatus(userEntity.getUserStatus()));
        responseDTO.setUserPostalCode(userEntity.getUserPostalCode());
        responseDTO.setUserFullName(userEntity.getUserFullName());
        responseDTO.setUserMaritalStatus(userEntity.getUserMaritalStatus());
        return responseDTO;
    }
    public static String getUserStatus(int status) {
        return status == 1 ? "Enable" : "Disable";
    }
}
