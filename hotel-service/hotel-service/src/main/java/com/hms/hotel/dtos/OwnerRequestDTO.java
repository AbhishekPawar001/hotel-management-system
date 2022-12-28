package com.hms.hotel.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OwnerRequestDTO {
	
	private String name;
	private String mobile;
	private String phone;
	private String email;
	private String idCard;
	private String idCardNumber;
	private String nameOnIdCard;
	
}
