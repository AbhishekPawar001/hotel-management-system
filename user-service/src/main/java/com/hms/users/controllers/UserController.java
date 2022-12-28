package com.hms.users.controllers;

import com.hms.users.dtos.RequestDTO;
import com.hms.users.dtos.ResponseDTO;
import com.hms.users.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/v1/hms/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/ping")
    public ResponseEntity<String> getApiStatus() {
        return ResponseEntity.ok().body("User service is running or up!");
    }

    @PostMapping("/addUser")
    public ResponseEntity<String> addUser(@Valid @RequestBody RequestDTO requestDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.saveUser(requestDTO));
    }

    @GetMapping("/{userCode}")
    public ResponseEntity<ResponseDTO> getUser(@PathVariable("userCode") String userCode) {
        return ResponseEntity.status(HttpStatus.OK).body(userService.getUserById(userCode));
    }

    @GetMapping("/all")
    public ResponseEntity<List<ResponseDTO>> getAllUsers() {
        return ResponseEntity.status(HttpStatus.OK).body(userService.getAllUsers());
    }
}
