package com.hms.hotel.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "hms_hotel_facilities")
public class HotelFacilitiesEntity {
	
	@Id
	private String faciId;
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
	@Temporal(TemporalType.TIMESTAMP)
    private Date hotelFesiCreatedDate;
    @Temporal(TemporalType.TIMESTAMP)
    private Date hotelFesiLastUpdatedDate;
	
}
