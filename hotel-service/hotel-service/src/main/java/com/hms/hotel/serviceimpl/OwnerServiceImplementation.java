package com.hms.hotel.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hms.hotel.dtos.OwnerRequestDTO;
import com.hms.hotel.dtos.OwnerResponseDTO;
import com.hms.hotel.entities.HotelOwnerEntity;
import com.hms.hotel.mapper.MappingBtwDTOs;
import com.hms.hotel.repositories.OwnerRepository;
import com.hms.hotel.services.OwnerService;

@Service
public class OwnerServiceImplementation implements OwnerService {

	@Autowired
	private OwnerRepository ownerRepository;
	
	@Override
	public String addOwner(OwnerRequestDTO ownerRequestDTO) {
		
		HotelOwnerEntity ownerEntity = MappingBtwDTOs.dtoToOwner(ownerRequestDTO);
		String saveOwner = ownerRepository.save(ownerEntity).getOwnerId();
		return saveOwner != null ? "Owner saved successfully!!!" : "something went wrong";
	}
	
	@Override
	public OwnerResponseDTO getOwnerById(String ownerId) {
		HotelOwnerEntity ownerEntity = ownerRepository.findById(ownerId).orElseThrow();
		return MappingBtwDTOs.ownerToDto(ownerEntity);
	}

	@Override
	public List<OwnerResponseDTO> getAllOwners() {
		List<OwnerResponseDTO> response = new ArrayList<>();
		List<HotelOwnerEntity> owners = ownerRepository.findAll();
		for (HotelOwnerEntity ownerEntity : owners) {
			response.add(MappingBtwDTOs.ownerToDto(ownerEntity));
		}
		return response;
	}
	
}
