package com.acessibilityguide.api.service;

import org.springframework.stereotype.Service;

import com.acessibilityguide.api.util.GeoGoogleAPIUtil;
import com.google.maps.model.GeocodingResult;
import com.google.maps.model.LatLng;

@Service
public class GeoLocationService {
	
	public GeocodingResult[] search (String str){
		GeoGoogleAPIUtil api = new GeoGoogleAPIUtil();
		return api.search(str); 
	}
	
	public String findFullAddress(Double latitude, Double longitude) {
		GeoGoogleAPIUtil api = new GeoGoogleAPIUtil();
		return api.findFullAddress(new LatLng(latitude, longitude));
	}
	
}
