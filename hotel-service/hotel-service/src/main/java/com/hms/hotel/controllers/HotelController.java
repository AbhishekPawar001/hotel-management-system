package com.hms.hotel.controllers;

import com.hms.hotel.dtos.HotelRequestDTO;
import com.hms.hotel.dtos.HotelResponseDTO;
import com.hms.hotel.services.HotelService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/hms/hotels")
public class HotelController {

    @Autowired
    private HotelService hotelService;

    @GetMapping("/ping")
    public ResponseEntity<String> getApiStatus() {
        return ResponseEntity.ok().body("Hotel service is running or up!");
    }
    
    @PostMapping("/addHotel")
    public ResponseEntity<String> addHotel(@RequestBody HotelRequestDTO requestDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(hotelService.addHotel(requestDTO));
    }
    
    @GetMapping("/getHotel/{hotelId}")
    public ResponseEntity<HotelResponseDTO> getHotelById(@PathVariable String hotelId) {
    	return ResponseEntity.status(HttpStatus.OK).body(hotelService.getHotelById(hotelId));
    }
    
    @GetMapping("/all")
    public ResponseEntity<List<HotelResponseDTO>> getAllHotels() {
    	return ResponseEntity.status(HttpStatus.OK).body(hotelService.getAllHotels());
    }
}
