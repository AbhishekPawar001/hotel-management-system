package com.hms.hotel.helper;

import java.util.Random;

import com.hms.hotel.constants.UtilConstants;

public class HelperUtility {
	
	private HelperUtility() {} 
	
	private static Random rand = new Random();
			
	public static String randumNumber() {
		return Long.toString(rand.nextInt(900000000)).substring(0,5);
	}
	
    public static String getOwnerId() {
        return UtilConstants.HMSO+randumNumber();
    }
    
    public static String getHotelId() {
    	return UtilConstants.HMSH+randumNumber();
    }
    
    public static String getFeciId() {
    	return UtilConstants.HMSF+randumNumber();
    }
    
    public static String getConveId() {
    	return UtilConstants.HMSC+randumNumber();
    }
}
