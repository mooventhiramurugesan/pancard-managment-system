package com.example.passport.managment.system.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.passport.managment.system.Entity.PersonDetails;
import com.example.passport.managment.system.Repository.PersonRepo;

@Service
public class PersonService {

	@Autowired
	private PersonRepo personrepo;
	
	public PersonDetails  saveDetails(PersonDetails persondetails) {
		PersonDetails details=personrepo.save(persondetails);
		return details;
	}
}
