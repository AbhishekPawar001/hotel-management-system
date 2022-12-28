package com.hms.hotel.dtos;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class HotelRequestDTO {

	private String ownerId;
	private String name;
    private String city;
    private String state;
    private int status;
    private String plotnoBuildingno;
    private String streetAreaLocality;
    private int postalCode;
    private String country;
    private int numberOfRooms;
    private int numberOfFloors;

    private List<FacilitiesRequestDTO> hotelfacilities;

    private List<ConvenienceRequestDTO> hotelConvenience;

}
