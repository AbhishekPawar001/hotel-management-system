package com.hms.hotel.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FacilitiesRequestDTO {

	private char hotelFreeWifi;
	private char hotelPowerBackup;
	private char hotelCardPayment;
	private char hotelCctvCameras;
	private char hotelBanquetHall;
	private char hotelSecurity;
	private char hotel247CheckIns;
	private char hotelParking;
	private char hotelHousekeeping;
	private char hotelKitchen;
	private char hotelFireExtinguisher;
	private char hotelSeatingArea;
	
}
