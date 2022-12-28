package com.hms.users.helper;

import java.util.Random;

public class HelperUtility {
	
	private HelperUtility() {} 
	
	private static Random rand = new Random();
			
    public static String getCode() {
    	
        return "HMSU"+Long.toString(rand.nextInt(900000000)).substring(0,5);
    }
}
