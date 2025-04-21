package com.picker.pickSpot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.picker.pickSpot.dto.PickRequest;
import com.picker.pickSpot.dto.PickResponse;
import com.picker.pickSpot.services.PickSpotServices;

@RestController
@RequestMapping("/pickSpot")
public class PickController {
	
	@Autowired
	private PickSpotServices service;
	
	@PostMapping
	public PickResponse pickSpot(@RequestBody PickRequest request) {
		return service.pickBestSpot(request);
	}

}
