package com.hms.hotel.mapper;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.hms.hotel.dtos.ConvenienceRequestDTO;
import com.hms.hotel.dtos.FacilitiesRequestDTO;
import com.hms.hotel.dtos.HotelRequestDTO;
import com.hms.hotel.dtos.HotelResponseDTO;
import com.hms.hotel.dtos.OwnerRequestDTO;
import com.hms.hotel.dtos.OwnerResponseDTO;
import com.hms.hotel.entities.HotelEntity;
import com.hms.hotel.entities.HotelFacilitiesEntity;
import com.hms.hotel.entities.HotelNearbyConvenienceEntity;
import com.hms.hotel.entities.HotelOwnerEntity;
import com.hms.hotel.helper.HelperUtility;

public class MappingBtwDTOs {
	
	private MappingBtwDTOs() {}

	public static String getStatus(int status) {
		return status == 1 ? "Enable" : "Disable";
	}
	
	public static HotelOwnerEntity dtoToOwner(OwnerRequestDTO ownerRequestDTO) {
		HotelOwnerEntity ownerEntity = new HotelOwnerEntity();
		ownerEntity.setOwnerId(HelperUtility.getOwnerId());
		ownerEntity.setOwnerName(ownerRequestDTO.getName());
		ownerEntity.setOwnerMobile(ownerRequestDTO.getMobile());
		ownerEntity.setOwnerPhone(ownerRequestDTO.getPhone());
		ownerEntity.setOwnerEmail(ownerRequestDTO.getEmail());
		ownerEntity.setOwnerIdCard(ownerRequestDTO.getIdCard());
		ownerEntity.setOwnerIdCardNumber(ownerRequestDTO.getIdCardNumber());
		ownerEntity.setOwnerNameOnIdCard(ownerRequestDTO.getNameOnIdCard());
		ownerEntity.setOwnerStatus(1);
		ownerEntity.setOwnerCreatedDate(new Date());
		ownerEntity.setOwnerLastUpdatedDate(new Date());
		
		return ownerEntity;
	}
	
	public static OwnerResponseDTO ownerToDto(HotelOwnerEntity ownerEntity) {
		OwnerResponseDTO responseDto = new OwnerResponseDTO();
		responseDto.setOwnerId(ownerEntity.getOwnerId());
		responseDto.setName(ownerEntity.getOwnerName());
		responseDto.setEmail(ownerEntity.getOwnerEmail());
		responseDto.setMobile(ownerEntity.getOwnerMobile());
		responseDto.setPhone(ownerEntity.getOwnerPhone());
		responseDto.setIdCard(ownerEntity.getOwnerIdCard());
		responseDto.setIdCardNumber(ownerEntity.getOwnerIdCardNumber());
		responseDto.setNameOnIdCard(ownerEntity.getOwnerNameOnIdCard());
		responseDto.setStatus(getStatus(ownerEntity.getOwnerStatus()));
		responseDto.setCreatedDate(ownerEntity.getOwnerCreatedDate());
		responseDto.setHotels(ownerEntity.getHotels());
		
		return responseDto;	
	}
	
	public static HotelEntity dtoToHotel(HotelRequestDTO hotelRequestDTO) {
		HotelEntity hotelEntity = new HotelEntity();
		hotelEntity.setHotelId(HelperUtility.getHotelId());
		hotelEntity.setHotelName(hotelRequestDTO.getName());
		hotelEntity.setHotelCity(hotelRequestDTO.getCity());
		hotelEntity.setHotelState(hotelRequestDTO.getState());
		hotelEntity.setHotelCountry(hotelRequestDTO.getCountry());
		hotelEntity.setHotelNumberOfRooms(hotelRequestDTO.getNumberOfRooms());
		hotelEntity.setHotelNumberOfFloors(hotelRequestDTO.getNumberOfFloors());
		hotelEntity.setHotelPlotnoBuildingno(hotelRequestDTO.getPlotnoBuildingno());
		hotelEntity.setHotelStreetAreaLocality(hotelRequestDTO.getStreetAreaLocality());
		hotelEntity.setHotelStatus(1);
		hotelEntity.setHotelPostalCode(hotelRequestDTO.getPostalCode());
		hotelEntity.setHotelCreatedDate(new Date());
		hotelEntity.setHotelLastUpdatedDate(new Date());
		hotelEntity.setHotelFacilities(dtoToFacility(hotelRequestDTO.getHotelfacilities()));
		hotelEntity.setHotelConvenience(dtoToConvenience(hotelRequestDTO.getHotelConvenience()));
		
		return hotelEntity;
	}
	
	public static HotelResponseDTO hotelToDto(HotelEntity hotelEntity) {
		HotelResponseDTO responseDto = new HotelResponseDTO();
		responseDto.setHotelId(hotelEntity.getHotelId());
		responseDto.setName(hotelEntity.getHotelName());
		responseDto.setCity(hotelEntity.getHotelCity());
		responseDto.setState(hotelEntity.getHotelState());
		responseDto.setCountry(hotelEntity.getHotelCountry());
		responseDto.setNumberOfRooms(hotelEntity.getHotelNumberOfRooms());
		responseDto.setNumberOfFloors(hotelEntity.getHotelNumberOfFloors());
		responseDto.setPlotnoBuildingno(hotelEntity.getHotelPlotnoBuildingno());
		responseDto.setStreetAreaLocality(hotelEntity.getHotelStreetAreaLocality());
		responseDto.setStatus(getStatus(hotelEntity.getHotelStatus()));
		responseDto.setPostalCode(hotelEntity.getHotelPostalCode());
		responseDto.setCreatedDate(hotelEntity.getHotelCreatedDate());
		responseDto.setHotelFacilities(hotelEntity.getHotelFacilities());
		responseDto.setHotelConvenience(hotelEntity.getHotelConvenience());
		
		return responseDto;
	}
	
	public static List<HotelFacilitiesEntity> dtoToFacility(List<FacilitiesRequestDTO> facilitiesRequestDTO) {
		List<HotelFacilitiesEntity> hotelFacilitiesList = new ArrayList<>();
		HotelFacilitiesEntity hotelFacilitiesEntity = new HotelFacilitiesEntity();
		hotelFacilitiesList.add(hotelFacilitiesEntity);
		for (FacilitiesRequestDTO hotelFacilities : facilitiesRequestDTO) {		
			hotelFacilitiesEntity.setFaciId(HelperUtility.getFeciId());
			hotelFacilitiesEntity.setHotel247CheckIns(hotelFacilities.getHotel247CheckIns());
			hotelFacilitiesEntity.setHotelBanquetHall(hotelFacilities.getHotelBanquetHall());
			hotelFacilitiesEntity.setHotelCardPayment(hotelFacilities.getHotelCardPayment());
			hotelFacilitiesEntity.setHotelCctvCameras(hotelFacilities.getHotelCctvCameras());
			hotelFacilitiesEntity.setHotelFesiCreatedDate(new Date());
			hotelFacilitiesEntity.setHotelFesiLastUpdatedDate(new Date());
			hotelFacilitiesEntity.setHotelFireExtinguisher(hotelFacilities.getHotelFireExtinguisher());
			hotelFacilitiesEntity.setHotelFreeWifi(hotelFacilities.getHotelFreeWifi());
			hotelFacilitiesEntity.setHotelHousekeeping(hotelFacilities.getHotelHousekeeping());
			hotelFacilitiesEntity.setHotelKitchen(hotelFacilities.getHotelKitchen());
			hotelFacilitiesEntity.setHotelParking(hotelFacilities.getHotelParking());
			hotelFacilitiesEntity.setHotelPowerBackup(hotelFacilities.getHotelPowerBackup());
			hotelFacilitiesEntity.setHotelSeatingArea(hotelFacilities.getHotelSeatingArea());
			hotelFacilitiesEntity.setHotelSecurity(hotelFacilities.getHotelSecurity());
		}
		return hotelFacilitiesList;
	}
	
	public static List<HotelNearbyConvenienceEntity> dtoToConvenience(List<ConvenienceRequestDTO> convenienceRequestDTO) {
		List<HotelNearbyConvenienceEntity> hotelConvenienceList = new ArrayList<>();
		HotelNearbyConvenienceEntity hotelConvenienceEntity = new HotelNearbyConvenienceEntity();
		hotelConvenienceList.add(hotelConvenienceEntity);
		for (ConvenienceRequestDTO convenience : convenienceRequestDTO) {
			hotelConvenienceEntity.setConveId(HelperUtility.getConveId());
			hotelConvenienceEntity.setHotelNearbyCreatedDate(new Date());
			hotelConvenienceEntity.setHotelNearbyLastUpdatedDate(new Date());
			hotelConvenienceEntity.setHotelNearbyPlaceToVisit(convenience.getHotelNearbyPlaceToVisit());
			hotelConvenienceEntity.setHotelNearbyPlaceToVisitDistance(convenience.getHotelNearbyPlaceToVisitDistance());
			hotelConvenienceEntity.setHotelNearbyRestro(convenience.getHotelNearbyRestro());
			hotelConvenienceEntity.setHotelNearbyRestroDistance(convenience.getHotelNearbyRestroDistance());
			hotelConvenienceEntity.setHotelNearbyTransport(convenience.getHotelNearbyTransport());
			hotelConvenienceEntity.setHotelNearbyTransportDistance(convenience.getHotelNearbyTransportDistance());
		}
		return hotelConvenienceList;
	}
	
}
