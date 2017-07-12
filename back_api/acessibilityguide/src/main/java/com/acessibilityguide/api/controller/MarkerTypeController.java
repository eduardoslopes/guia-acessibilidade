package com.acessibilityguide.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.acessibilityguide.api.model.MarkerType;
import com.acessibilityguide.api.service.MarkerTypeService;

@CrossOrigin
@RestController
@RequestMapping("/api/markerType")
public class MarkerTypeController {

	@Autowired
	private MarkerTypeService markertypeService;
	
	@RequestMapping(value="/findAll", method=RequestMethod.GET)
	public List<MarkerType> findAll(){
		return markertypeService.findAll();
	}
	
}
