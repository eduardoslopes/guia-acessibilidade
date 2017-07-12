package com.acessibilityguide.api.util;

import com.google.maps.GeoApiContext;
import com.google.maps.GeocodingApi;
import com.google.maps.model.GeocodingResult;
import com.google.maps.model.LatLng;

public class GeoGoogleAPIUtil {
	
	private GeoApiContext geoApiContext;
	private static final String API_KEY_MAP = "AIzaSyAuISKM0-PhsQ9UlRz0l11YuTEeURlo0po";
	
	public GeoGoogleAPIUtil() {
		geoApiContext = new GeoApiContext().setApiKey(API_KEY_MAP);
	}

	public GeocodingResult[] search(String query) {
		try {
			GeocodingResult[] places = GeocodingApi.geocode(geoApiContext, query).await();
			return places;
		} catch (Exception e) {
			e.getMessage();
		}
		return null;
	}
	
	public String findFullAddress(LatLng location) {
		try {
			GeocodingResult[] places  = GeocodingApi.reverseGeocode(geoApiContext, location).await();
			return places[0].formattedAddress;
		} catch (Exception e) {
			e.getMessage();
		}
		return null;
	}
}
