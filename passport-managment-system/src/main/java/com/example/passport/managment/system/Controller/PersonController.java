package com.example.passport.managment.system.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.passport.managment.system.Entity.PersonDetails;
import com.example.passport.managment.system.Service.PersonService;

@Controller
@RequestMapping("/api")
public class PersonController {

	@Autowired
	private PersonService personservice;
	
	@PostMapping("/inputdetails")
	public ResponseEntity<PersonDetails> save(@RequestBody PersonDetails persondetails){
		
		PersonDetails XYT=personservice.saveDetails(persondetails);
		return ResponseEntity.ok(XYT);
	}
}
