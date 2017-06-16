package com.acessibilityguide.api.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.avaje.ebean.Model;

@Service
public abstract class AbstractCRUDService<T extends Model> {

	public T save(T object){
		object.save();
		return object;
	}
	public abstract T findById(Long id);
	
	public abstract List<T> findAll();
	
	public T update(T object){
		object.update();
		return object;
	}
	
}
