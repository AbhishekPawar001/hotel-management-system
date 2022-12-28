//package com.hms.hotel.controllers;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.hms.hotel.dtos.FacilitiesRequestDTO;
//import com.hms.hotel.services.FacilitiesService;
//
//@RestController
//@RequestMapping("/v1/hms/facilities")
//public class FacilitiesController {
//	
//	@Autowired
//	private FacilitiesService facilitiesService;
//	
//	@PostMapping("/addFacilities")
//	public ResponseEntity<String> addActivities(@RequestBody FacilitiesRequestDTO facilitiesRequestDTO) {
//		return ResponseEntity.status(HttpStatus.CREATED).body(facilitiesService.saveFacilities(facilitiesRequestDTO));
//	}
//	
//}
