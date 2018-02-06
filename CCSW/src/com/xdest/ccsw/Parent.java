package com.xdest.ccsw;

import java.time.LocalDate;

public class Parent extends Person implements EmergencyContact {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3651096343217049937L;
	private Family f;
	private String phoneNumber;
	private String email;
	
	Parent(String firstName, String middleName, String lastName, LocalDate birthday, Sex sex, Family f, String phoneNumber, String email) {
		super(firstName, middleName, lastName, birthday, sex);
		this.f = f;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	Parent(String firstName, String middleName, String lastName, int month, int day, int year, Sex sex, Family f, String phoneNumber, String email) {
		super(firstName, middleName, lastName, LocalDate.of(year, month, day), sex);
		this.f = f;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	
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
