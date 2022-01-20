package com.erno.example.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.erno.example.model.People;

@RestController
public class PalAPI {
	@GetMapping("/")
	public People getPeople() {
		return new People(18 ,"Pál");
	}

}
