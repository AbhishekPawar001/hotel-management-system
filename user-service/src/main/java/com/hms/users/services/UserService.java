package com.hms.users.services;

import com.hms.users.dtos.RequestDTO;
import com.hms.users.dtos.ResponseDTO;

import java.util.List;

public interface UserService {
    String saveUser(RequestDTO requestDTO);

    ResponseDTO getUserById(String userCode);

    List<ResponseDTO> getAllUsers();
}
