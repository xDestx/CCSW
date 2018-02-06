package com.xdest.ccsw;

import java.time.LocalDate;

public class OtherContact extends Person implements EmergencyContact {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2037633103061171395L;
	private String email, phoneNumber;
	
	OtherContact(String firstName, String middleName, String lastName, LocalDate birthday, Sex sex, String email, String phoneNumber) {
		super(firstName, middleName, lastName, birthday, sex);
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public String getPhoneNumber() {
		return this.phoneNumber;
	}

}
