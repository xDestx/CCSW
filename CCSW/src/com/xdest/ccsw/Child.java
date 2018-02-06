package com.xdest.ccsw;

import java.time.LocalDate;

public class Child extends Person {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8724780143005957885L;
	private Family f;
	
	Child(String firstName, String middleName, String lastName, LocalDate birthday, Sex sex, Family f) {
		super(firstName, middleName, lastName, birthday, sex);
		this.f = f;
	}
	
	Child(String firstName, String middleName, String lastName, int month, int day, int year, Sex sex, Family f) {
		super(firstName, middleName, lastName, LocalDate.of(year, month, day), sex);
		this.f = f;
	}
	
	public Family getFamily() {
		return this.f;
	}

}
