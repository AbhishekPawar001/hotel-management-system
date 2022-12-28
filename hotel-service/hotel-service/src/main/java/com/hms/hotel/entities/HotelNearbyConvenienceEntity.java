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
@Table(name = "hms_nearby_convenience")
public class HotelNearbyConvenienceEntity {

	@Id
	private String conveId;
    private String hotelNearbyTransport;
    private String hotelNearbyTransportDistance;
    private String hotelNearbyRestro;
    private String hotelNearbyRestroDistance;
    private String hotelNearbyPlaceToVisit;
    private String hotelNearbyPlaceToVisitDistance;
    @Temporal(TemporalType.TIMESTAMP)
    private Date hotelNearbyCreatedDate;
    @Temporal(TemporalType.TIMESTAMP)
    private Date hotelNearbyLastUpdatedDate;

}
