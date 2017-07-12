package com.acessibilityguide.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.acessibilityguide.api.dto.VoteDTO;
import com.acessibilityguide.api.model.Marker;
import com.acessibilityguide.api.service.MarkerService;

@CrossOrigin
@RestController
@RequestMapping("/api/marker")
public class MarkerController extends AbstractCRUDController<Marker> {

	@Autowired
	private MarkerService markerService;
	
	@RequestMapping(value="/applyVote", method=RequestMethod.PUT)
	public Marker applyVote(@RequestBody VoteDTO vote){
		Marker marker = markerService.applyVote(vote);
		return marker;
	}
	
}
