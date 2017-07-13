package com.acessibilityguide.api.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.acessibilityguide.api.model.GuideUser;

@CrossOrigin
@RestController
@RequestMapping("/api/user")
public class GuideUserController extends AbstractCRUDController<GuideUser> {
	
}
