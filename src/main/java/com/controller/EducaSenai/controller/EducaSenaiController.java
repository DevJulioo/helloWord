package com.controller.EducaSenai.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EducaSenaiController {
	
	@GetMapping
	public String OlaMundo() {
		return "OlaMundo!";
	}

}
