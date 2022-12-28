package com.hms.hotel.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hms.hotel.dtos.OwnerRequestDTO;
import com.hms.hotel.dtos.OwnerResponseDTO;
import com.hms.hotel.services.OwnerService;

@RestController
@RequestMapping("v1/hms/owner")
public class OwnerController {
	
	@Autowired
	private OwnerService ownerService;
	
	@PostMapping("/addOwner")
	public ResponseEntity<String> addOwner(@Valid @RequestBody OwnerRequestDTO ownerRequestDTO) {
		return ResponseEntity.status(HttpStatus.CREATED).body(ownerService.addOwner(ownerRequestDTO));
	}
	
	@GetMapping("/getOwner/{ownerId}")
	public ResponseEntity<OwnerResponseDTO> getOwnerById(@PathVariable String ownerId) {
		return ResponseEntity.status(HttpStatus.OK).body(ownerService.getOwnerById(ownerId));
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<OwnerResponseDTO>> getAllOwner() {
		return ResponseEntity.status(HttpStatus.OK).body(ownerService.getAllOwners());
	}
	
}
