package com.hms.users.serviceImpl;

import com.hms.users.dtos.RequestDTO;
import com.hms.users.dtos.ResponseDTO;
import com.hms.users.entities.UserEntity;
import com.hms.users.helper.MappingBtwDTO;
import com.hms.users.repository.UserRepository;
import com.hms.users.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public String saveUser(RequestDTO requestDTO) {
        UserEntity userEntity = MappingBtwDTO.dtoToUser(requestDTO);
        int userid = userRepository.save(userEntity).getUserId();
        return userid > 0 ? "user saved!!!" : "something went wrong";
    }

    @Override
    public ResponseDTO getUserById(String userCode) {
        UserEntity userEntity = userRepository.findByUserCode(userCode);
        return MappingBtwDTO.userToDto(userEntity);
    }

    @Override
    public List<ResponseDTO> getAllUsers() {

        List<ResponseDTO> users = new ArrayList<>();
        List<UserEntity> userEntities = userRepository.findAll();
        for (UserEntity userEntity: userEntities) {
            users.add(MappingBtwDTO.userToDto(userEntity));
        }
        return users;
    }
}
