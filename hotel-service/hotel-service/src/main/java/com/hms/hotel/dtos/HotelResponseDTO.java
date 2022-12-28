package com.hms.hotel.dtos;

import java.util.Date;
import java.util.List;

import com.hms.hotel.entities.HotelFacilitiesEntity;
import com.hms.hotel.entities.HotelNearbyConvenienceEntity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class HotelResponseDTO {
	
	private String hotelId;
	private String name;
    private String city;
    private String state;
    private String status;
    private String plotnoBuildingno;
    private String streetAreaLocality;
    private int postalCode;
    private String country;
    private int numberOfRooms;
    private int numberOfFloors;
    private Date createdDate;
    
    private List<HotelFacilitiesEntity> hotelFacilities;
    private List<HotelNearbyConvenienceEntity> hotelConvenience;
}
