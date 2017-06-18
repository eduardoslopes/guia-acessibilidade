package com.acessibilityguide.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.acessibilityguide.api.model.GuideUser;
import com.acessibilityguide.api.service.GuideUserService;

@CrossOrigin
@RestController
@RequestMapping("/api/user")
public class GuideUserController extends AbstractCRUDController<GuideUser> {

	@Autowired
	private GuideUserService userService;
	
	@RequestMapping(value = "/login", method=RequestMethod.POST)
	public GuideUser login(@RequestBody GuideUser user){
		GuideUser nUser = userService.login(user);
		return nUser;
	}
	
}
