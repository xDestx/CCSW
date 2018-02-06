package com.xdest.ccsw;

import java.time.LocalDate;

/**
 * A parent of a family
 * @author xDestx
 *
 */
public class Parent extends Person implements EmergencyContact {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3651096343217049937L;
	private Family f;
	private String phoneNumber;
	private String email;
	
	/**
	 * Create a new Parent with a given family
	 * @param firstName First name
	 * @param middleName Middle name
	 * @param lastName Last name
	 * @param birthday Birth date object
	 * @param sex Sex
	 * @param f Family
	 * @param phoneNumber Phone number 
	 * @param email Email
	 */
	Parent(String firstName, String middleName, String lastName, LocalDate birthday, Sex sex, Family f, String phoneNumber, String email) {
		super(firstName, middleName, lastName, birthday, sex);
		this.f = f;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	/**
	 * Create a new parent with a given family
	 * @param firstName First name
	 * @param middleName Middle name
	 * @param lastName Last name
	 * @param month Month
	 * @param day Day
	 * @param year Year
	 * @param sex sex
	 * @param f Family
	 * @param phoneNumber Phone number 
	 * @param email email
	 */
	Parent(String firstName, String middleName, String lastName, int month, int day, int year, Sex sex, Family f, String phoneNumber, String email) {
		super(firstName, middleName, lastName, LocalDate.of(year, month, day), sex);
		this.f = f;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	/**
	 * Get the family of this parent
	 * @return This parents family
	 */
	public Family getFamily() {
		return this.f;
	}

	@Override
	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	@Override
	public String getEmail() {
		return this.email;
	}
}
