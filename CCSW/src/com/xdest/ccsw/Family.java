package com.xdest.ccsw;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Family implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -336800693711613817L;
	private List<Parent> parents;
	private List<Child> children;
	private List<EmergencyContact> emergencyContacts;
	
	public Family() {
		parents = new ArrayList<Parent>();
		children = new ArrayList<Child>();
		emergencyContacts = new ArrayList<EmergencyContact>();
	}
	
	public boolean addEmergencyContact(String firstName, String middleName, String lastName, LocalDate bday, Sex sex, String phoneNumber, String email) {
		if(firstName == null || middleName == null || lastName == null || sex == null) return false;
		emergencyContacts.add(new OtherContact(firstName, middleName, lastName, bday, sex, phoneNumber, email));
		return true;
	}
	
	public boolean addEmergencyContact(Parent p) {
		return this.emergencyContacts.add(p);
	}
	
	
	public boolean addParent(String firstName, String middleName, String lastName, int birthMonth, int birthDay, int birthYear, Sex sex, String phoneNumber, String email) {
		if(firstName == null || middleName == null || lastName == null || birthMonth < 1 || birthMonth > 12 || birthDay < 1 || birthDay > 31 || sex == null) return false;
		parents.add(new Parent(firstName, middleName, lastName, birthMonth, birthDay, birthYear, sex, this, phoneNumber, email));
		return true;
	}

	public boolean addChild(String firstName, String middleName, String lastName, int birthMonth, int birthDay, int birthYear, Sex sex) {
		if(firstName == null || middleName == null || lastName == null || birthMonth < 1 || birthMonth > 12 || birthDay < 1 || birthDay > 31 || sex == null) return false;
		children.add(new Child(firstName, middleName, lastName, birthMonth, birthDay, birthYear, sex, this));
		return true;
	}
	
	public List<Parent> getParents() {
		List<Parent> newList = new ArrayList<Parent>();
		newList.addAll(parents);
		return newList;
	}
	
	public List<Child> getChildren() {
		List<Child> newList = new ArrayList<Child>();
		newList.addAll(children);
		return newList;
	}
	
	public List<EmergencyContact> getEmergencyContacts() {
		List<EmergencyContact> newList = new ArrayList<EmergencyContact>();
		newList.addAll(emergencyContacts);
		return newList;
	}
	
	public boolean removeParent(Parent p) {
		return this.parents.remove(p);
	}
	
	public boolean removeEmergencyContact(EmergencyContact c) {
		return this.emergencyContacts.remove(c);
	}
	
	public boolean removeChild(Child c) {
		return this.children.remove(c);
	}
}
