package com.hms.hotel.services;

import java.util.List;

import com.hms.hotel.dtos.HotelRequestDTO;
import com.hms.hotel.dtos.HotelResponseDTO;

public interface HotelService {
	
    String addHotel(HotelRequestDTO requestDTO);

	HotelResponseDTO getHotelById(String hotelId);
	
	List<HotelResponseDTO> getAllHotels();
}
