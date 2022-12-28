package com.hms.hotel.entities;

import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "hms_hotels_owner")
public class HotelOwnerEntity {
	
	@Id
	private String ownerId;
	private String ownerName;
	private String ownerMobile;
	private String ownerPhone;
	private String ownerEmail;
	private String ownerIdCard;
	private String ownerIdCardNumber;
	private String ownerNameOnIdCard;
	private int ownerStatus;
	@Temporal(TemporalType.TIMESTAMP)
	private Date ownerCreatedDate; 
	@Temporal(TemporalType.TIMESTAMP)
	private Date ownerLastUpdatedDate;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "owner_id", insertable = false, updatable = false)
	private List<HotelEntity> hotels;
	
}
