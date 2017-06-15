package com.acessibilityguide.api.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.acessibilityguide.api.model.AcessibilityType;
import com.acessibilityguide.api.model.query.QAcessibilityType;

@Service
public class AcessibilityTypeService extends AbstractCRUDService<AcessibilityType> {

	@Override
	public AcessibilityType findById(Long id) {
		return new QAcessibilityType().id.eq(id).findUnique();
	}

	@Override
	public List<AcessibilityType> findAll() {
		return new QAcessibilityType().findList();
	}

}
