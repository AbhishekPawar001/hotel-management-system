package com.hms.hotel.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ConvenienceRequestDTO {
	
	private String hotelNearbyTransport;
    private String hotelNearbyTransportDistance;
    private String hotelNearbyRestro;
    private String hotelNearbyRestroDistance;
    private String hotelNearbyPlaceToVisit;
    private String hotelNearbyPlaceToVisitDistance;
    
}
