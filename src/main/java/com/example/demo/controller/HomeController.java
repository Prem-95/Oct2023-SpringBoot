package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("home")
public class HomeController {
	
	@GetMapping("hello")
	public ResponseEntity<?> getResponse(){
		return new ResponseEntity<String>("Hello world!!", HttpStatus.OK);
	}

}
