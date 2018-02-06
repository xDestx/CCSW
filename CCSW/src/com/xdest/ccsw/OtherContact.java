package com.xdest.ccsw;

import java.time.LocalDate;

/**
 * A simple form of a contact
 * @author xDestx
 *
 */
public class OtherContact extends Person implements EmergencyContact {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2037633103061171395L;
	private String email, phoneNumber;
	
	/**
	 * Create a new Contact which does not belong to a family.
	 * @param firstName First name
	 * @param middleName Middle name
	 * @param lastName Last name
	 * @param birthday Birth date as LocalDate object
	 * @param sex Sex
	 * @param email Email
	 * @param phoneNumber Phone number
	 */
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
