package com.acessibilityguide.api.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.acessibilityguide.api.model.Marker;

@CrossOrigin
@RestController
@RequestMapping("/api/marker")
public class MarkerController extends AbstractCRUDController<Marker> {

}
