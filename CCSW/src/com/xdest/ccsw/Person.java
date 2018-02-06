package com.xdest.ccsw;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * Class to represent a person.
 * @author xDestx
 *
 */
public abstract class Person implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8386301711066738237L;
	private String firstName, middleName, lastName;
	private LocalDate birthday;
	private Sex sex;
	
	/**
	 * Create a new person instance
	 * @param firstName First name
	 * @param middleName Middle name, or "" if none
	 * @param lastName Last name
	 * @param birthday Birthday
	 * @param sex Sex
	 */
	Person(String firstName, String middleName, String lastName, LocalDate birthday, Sex sex) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.birthday = birthday;
		this.sex = sex;
	}
	
	/*
	 * Get methods
	 */
	/**
	 * Get the first name of this person
	 * @return First name
	 */
	public String getFirstName() {
		if(firstName == null) return "";
		return this.firstName;
	}
	
	/**
	 * Get the middle name of this person
	 * @return Middle name
	 */
	public String getMiddleName() {
		if(middleName == null) return "";
		return this.middleName;
	}
	
	/**
	 * Get the last name of this person
	 * @return Last name
	 */
	public String getLastName() {
		if(lastName == null) return "";
		return this.lastName;
	}
	
	/**
	 * Gets the full formatted name of this person
	 * <br/>Ex: <code>John F Doe</code>
	 * @return A formatted name
	 */
	public String getFormattedName() {
		if(this.middleName.length() >= 1) {
			return this.getFirstName() + " " + this.getMiddleName().substring(0, 1) + " " + this.getLastName();
		} else {
			return this.getFirstName() + " " + this.getLastName();
		}
	}
	/**
	 * Get the name in Last, First Middle format.
	 * @return The formatted name
	 */
	public String getNameLFM() {
		return this.getLastName() + ", " + this.getFirstName() + " " + this.getMiddleName().substring(0, 1);
	}
	
	/**
	 * Get the birthday of this person
	 * @return The birthday as a LocalDate object
	 */
	public LocalDate getBirthday() {
		return this.birthday;
	}
	
	
	/**
	 * Get the current age of this person
	 * @return The age
	 */
	public int getAge() {
		LocalDate years = LocalDate.now().minusYears(birthday.getYear());
		if(years.getDayOfYear() < birthday.getDayOfYear()) {
			years = years.minusYears(1);
		}
		return years.getYear();
	}
	
	/**
	 * Get the biological sex of this person
	 * @return The sex
	 */
	public Sex getSex() {
		return this.sex;
	}

}