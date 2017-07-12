package com.acessibilityguide.api.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.acessibilityguide.api.model.MarkerType;
import com.acessibilityguide.api.model.query.QMarkerType;

@Service
public class MarkerTypeService {

	public List<MarkerType> findAll() {
		return new QMarkerType().findList();
	}

	
	
}
