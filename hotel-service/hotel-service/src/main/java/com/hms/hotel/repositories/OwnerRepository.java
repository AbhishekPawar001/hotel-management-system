package com.hms.hotel.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hms.hotel.entities.HotelOwnerEntity;

public interface OwnerRepository extends JpaRepository<HotelOwnerEntity, String> {

}
