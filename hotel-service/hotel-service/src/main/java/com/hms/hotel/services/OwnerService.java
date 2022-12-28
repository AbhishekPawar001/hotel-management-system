package com.hms.hotel.services;

import java.util.List;

import com.hms.hotel.dtos.OwnerRequestDTO;
import com.hms.hotel.dtos.OwnerResponseDTO;

public interface OwnerService {

	String addOwner(OwnerRequestDTO ownerRequestDTO);
	
	OwnerResponseDTO getOwnerById(String ownerId);
	
	List<OwnerResponseDTO> getAllOwners();

}
