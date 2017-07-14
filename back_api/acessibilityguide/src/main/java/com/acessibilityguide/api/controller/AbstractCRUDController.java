package com.acessibilityguide.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.acessibilityguide.api.service.AbstractCRUDService;
import com.avaje.ebean.Model;

public abstract class AbstractCRUDController<T extends Model> {

	@Autowired
	protected AbstractCRUDService<T> service;
	
	@RequestMapping(method=RequestMethod.POST)
	public T save(@RequestBody T object){
		return service.save(object);
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public List<T> findAll(){
		return service.findAll();
	}
	
	@RequestMapping(value="{id}", method=RequestMethod.GET)
	public T findById(@PathVariable(name="id") Long id){
		return service.findById(id);
	}
	
	@RequestMapping(method=RequestMethod.PUT)
	public T update(@RequestBody T object){
		return service.update(object);
	}
	
}
