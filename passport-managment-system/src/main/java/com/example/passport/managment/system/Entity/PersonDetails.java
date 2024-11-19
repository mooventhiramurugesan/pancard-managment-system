package com.example.passport.managment.system.Entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "persondetails")
public class PersonDetails {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long id;  

    private String name;
    private String fathername;
    private int age;
    private String address;

    @OneToOne(mappedBy = "personDetails", cascade = CascadeType.ALL)
    private PassportDetails passportDetails;

    public PersonDetails() {
    }

	public PersonDetails(Long id, String name, String fathername, int age, String address) {
		
		this.id = id;
		this.name = name;
		this.fathername = fathername;
		this.age = age;
		this.address = address;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFathername() {
		return fathername;
	}

	public void setFathername(String fathername) {
		this.fathername = fathername;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public PassportDetails getPassportDetails() {
		return passportDetails;
	}

	public void setPassportDetails(PassportDetails passportDetails) {
		this.passportDetails = passportDetails;
	}

  
	
}
