package com.acessibilityguide.api.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.acessibilityguide.api.model.AcessibilityType;

@CrossOrigin
@RestController
@RequestMapping("/api/acessibilityType")
public class AcessibilityTypeController extends AbstractCRUDController<AcessibilityType> {

}
