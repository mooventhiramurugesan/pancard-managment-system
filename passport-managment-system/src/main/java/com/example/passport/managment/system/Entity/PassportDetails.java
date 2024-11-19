package com.example.passport.managment.system.Entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "passportdetails")
public class PassportDetails {

	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)  
    private Long id; 
	
	private String passportnumber;
    private String passporttype;
    private String validate;
    private int pincode;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "persondetails_id", referencedColumnName = "id")
    private PersonDetails personDetails;

    public PassportDetails() {
    }

	public PassportDetails(Long id, String passportnumber, String passporttype, String validate, int pincode) {
		
		this.id = id;
		this.passportnumber = passportnumber;
		this.passporttype = passporttype;
		this.validate = validate;
		this.pincode = pincode;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPassportnumber() {
		return passportnumber;
	}

	public void setPassportnumber(String passportnumber) {
		this.passportnumber = passportnumber;
	}

	public String getPassporttype() {
		return passporttype;
	}

	public void setPassporttype(String passporttype) {
		this.passporttype = passporttype;
	}

	public String getValidate() {
		return validate;
	}

	public void setValidate(String validate) {
		this.validate = validate;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public PersonDetails getPersonDetails() {
		return personDetails;
	}

	public void setPersonDetails(PersonDetails personDetails) {
		this.personDetails = personDetails;
	}	
}
