package com.acessibilityguide.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.acessibilityguide.api.service.GeoLocationService;
import com.google.maps.model.GeocodingResult;

@RestController
@RequestMapping("/api/geolocation")
public class GeoLocationController {

	@Autowired
	private GeoLocationService service;

	@RequestMapping(method = RequestMethod.POST)
	public GeocodingResult[] search(@RequestBody String str) {
		return service.search(str);
	}
}
