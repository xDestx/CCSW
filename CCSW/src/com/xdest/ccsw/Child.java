package com.xdest.ccsw;

import java.time.LocalDate;
/**
 * Class to represent a child in a family
 * @author xDestx
 *
 */
public class Child extends Person {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8724780143005957885L;
	private Family f;
	
	/**
	 * Create a new child with a given family
	 * @param firstName First name
	 * @param middleName Middle name
	 * @param lastName Last name
	 * @param birthday Birthday object as LocalDate object
	 * @param sex Sex
	 * @param f Family
	 */
	Child(String firstName, String middleName, String lastName, LocalDate birthday, Sex sex, Family f) {
		super(firstName, middleName, lastName, birthday, sex);
		this.f = f;
	}
	
	/**
	 * Create a new child with a given family
	 * @param firstName First name
	 * @param middleName Middlen name
	 * @param lastName Last name
	 * @param month Birth month
	 * @param day Birth day
	 * @param year Birth year 
	 * @param sex Sex
	 * @param f Family
	 */
	Child(String firstName, String middleName, String lastName, int month, int day, int year, Sex sex, Family f) {
		super(firstName, middleName, lastName, LocalDate.of(year, month, day), sex);
		this.f = f;
	}
	
	/**
	 * Get the family this child belongs to
	 * @return The family
	 */
	public Family getFamily() {
		return this.f;
	}

}
