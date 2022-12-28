package com.hms.hotel.serviceimpl;

import com.hms.hotel.dtos.HotelRequestDTO;
import com.hms.hotel.dtos.HotelResponseDTO;
import com.hms.hotel.entities.HotelEntity;
import com.hms.hotel.exceptions.ResourceNotFoundException;
import com.hms.hotel.mapper.MappingBtwDTOs;
import com.hms.hotel.repositories.HotelRepository;
import com.hms.hotel.services.HotelService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelRepository hotelRepository;

	@Override
	public String addHotel(HotelRequestDTO requestDTO) {
		HotelEntity hotelEntity = MappingBtwDTOs.dtoToHotel(requestDTO);
		return hotelRepository.save(hotelEntity).getHotelId() != null ? "Hotel saved successfully!!!" : "something went wrong";
	}

	@Override
	public HotelResponseDTO getHotelById(String hotelId) {
		HotelEntity hotelEntity = hotelRepository.findById(hotelId).orElseThrow(() -> new ResourceNotFoundException("Data not found"));
		return MappingBtwDTOs.hotelToDto(hotelEntity);
	}

	@Override
	public List<HotelResponseDTO> getAllHotels() {
		List<HotelResponseDTO> hotelList = new ArrayList<>();
		List<HotelEntity> hotels = hotelRepository.findAll();
		for (HotelEntity hotelEntity : hotels) {
			hotelList.add(MappingBtwDTOs.hotelToDto(hotelEntity));
		}
		return hotelList;
	}
}
