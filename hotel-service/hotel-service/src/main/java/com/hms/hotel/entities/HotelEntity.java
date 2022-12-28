package com.hms.hotel.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

import com.hms.hotel.constants.UtilConstants;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "hms_hotels")
public class HotelEntity {

    @Id
    private String hotelId;
    private String hotelName;
    private String hotelCity;
    private String hotelState;
    private int hotelStatus;
    private String hotelPlotnoBuildingno;
    private String hotelStreetAreaLocality;
    private int hotelPostalCode;
    private String hotelCountry;
    private int hotelNumberOfRooms;
    private int hotelNumberOfFloors;
    @Temporal(TemporalType.TIMESTAMP)
    private Date hotelCreatedDate;
    @Temporal(TemporalType.TIMESTAMP)
    private Date hotelLastUpdatedDate;    
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = UtilConstants.HOTEL_ID)
    private List<HotelFacilitiesEntity> hotelFacilities;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = UtilConstants.HOTEL_ID)
    private List<HotelNearbyConvenienceEntity> hotelConvenience;
    
}
