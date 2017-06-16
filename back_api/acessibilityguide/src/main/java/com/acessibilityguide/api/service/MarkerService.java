package com.acessibilityguide.api.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.acessibilityguide.api.model.Marker;
import com.acessibilityguide.api.model.query.QMarker;

@Service
public class MarkerService extends AbstractCRUDService<Marker> {

	@Override
	public Marker findById(Long id) {
		return new QMarker().id.eq(id).findUnique();
	}

	@Override
	public List<Marker> findAll() {
		return new QMarker().findList();
	}

}
