package com.wendi.Hello_Human.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Hellocontroller {
	
//	@GetMapping()
//	public String index(
//			@RequestParam(value="firstName", required=false) String firstName,
//			@RequestParam(value="lastName", required=false) String lastName,
//			@RequestParam(value="repeat", required=false) Integer time
//			) {
//		// if no first name giving only return 
//		if (firstName == null) {
//			return "Hello Human";
//		
//		// we check from last parameter 
//		} else if (time == 0) {
//			return "Hello " + firstName + " " + lastName;
//			
//		// we check the second last parameter
//		} else if (lastName == null) {
//			return "Hello " + firstName;
//		
//		// if both last and second last giving we run all 
//		} else {
//			String repeattime = "";
//			for (int i = 0; i < time; i++) {
//				repeattime += "Hello " + firstName + " " + lastName + " ";
//			}
//			return repeattime;
//		}
//	}
//	
	@GetMapping("/")
	public String withyourname(@RequestParam(value="name", required=false) String name) {
		if(name == null) {
			return "Hello Human";
		}else {
			return "Hello " + name;
		}
	}
	
	
	
	

}
