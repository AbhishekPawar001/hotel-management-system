package com.hms.hotel.dtos;

import java.util.Date;
import java.util.List;

import com.hms.hotel.entities.HotelEntity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OwnerResponseDTO {
	
	private String ownerId;
	private String name;
	private String email;
	private String mobile;
	private String phone;
	private String idCard;
	private String idCardNumber;
	private String nameOnIdCard;
	private String status;
	private Date createdDate;
	private List<HotelEntity> hotels;
	
}
