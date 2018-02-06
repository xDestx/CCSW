package com.xdest.ccsw;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * A class to represent a family. Includes parents, children, and emergency contacts. Family members belong to the family only. Duplicated family members (to use as emergency contacts for another family, for example) will not remain in step with each other.
 * @author xDestx
 *
 */
public class Family implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -336800693711613817L;
	private List<Parent> parents;
	private List<Child> children;
	private List<EmergencyContact> emergencyContacts;
	
	/**
	 * Create a new family
	 */
	public Family() {
		parents = new ArrayList<Parent>();
		children = new ArrayList<Child>();
		emergencyContacts = new ArrayList<EmergencyContact>();
	}
	
	/**
	 * Add an emergency contact. Leave no fields blank.
	 * @param firstName First name
	 * @param middleName Middle name
	 * @param lastName Last name
	 * @param bday Birthday as LocalDate object
	 * @param sex Sex
	 * @param phoneNumber Phone number (best)
	 * @param email Email (best)
	 * @return True, if the contact was added.
	 */
	public boolean addEmergencyContact(String firstName, String middleName, String lastName, LocalDate bday, Sex sex, String phoneNumber, String email) {
		if(firstName == null || middleName == null || lastName == null || sex == null) return false;
		emergencyContacts.add(new OtherContact(firstName, middleName, lastName, bday, sex, phoneNumber, email));
		return true;
	}
	
	/**
	 * Add a parent as an emergency contact
	 * @param p The parent to add
	 * @return True, if it could be added.
	 */
	public boolean addEmergencyContact(Parent p) {
		return this.emergencyContacts.add(p);
	}
	
	/**
	 * Add a parent to this family. Leave no fields blank
	 * @param firstName First name
	 * @param middleName Middle name
	 * @param lastName Last name
	 * @param birthMonth Birth month
	 * @param birthDay Birth day
	 * @param birthYear Birth year
	 * @param sex Sex
	 * @param phoneNumber Phone number (best)
	 * @param email Email (best)
	 * @return True, if the parent could be added
	 */
	public boolean addParent(String firstName, String middleName, String lastName, int birthMonth, int birthDay, int birthYear, Sex sex, String phoneNumber, String email) {
		if(firstName == null || middleName == null || lastName == null || birthMonth < 1 || birthMonth > 12 || birthDay < 1 || birthDay > 31 || sex == null) return false;
		parents.add(new Parent(firstName, middleName, lastName, birthMonth, birthDay, birthYear, sex, this, phoneNumber, email));
		return true;
	}

	/**
	 * Add a child to this family. Leave no fields blank.
	 * @param firstName First name
	 * @param middleName Middle name
	 * @param lastName Last name
	 * @param birthMonth Birth month
	 * @param birthDay Birth day
	 * @param birthYear Birth year
	 * @param sex Sex
	 * @return True, if the child could be added
	 */
	public boolean addChild(String firstName, String middleName, String lastName, int birthMonth, int birthDay, int birthYear, Sex sex) {
		if(firstName == null || middleName == null || lastName == null || birthMonth < 1 || birthMonth > 12 || birthDay < 1 || birthDay > 31 || sex == null) return false;
		children.add(new Child(firstName, middleName, lastName, birthMonth, birthDay, birthYear, sex, this));
		return true;
	}
	
	/**
	 * Get a copy of the parent list.
	 * @return A <strong>copy</strong> of the parent list
	 */
	public List<Parent> getParents() {
		List<Parent> newList = new ArrayList<Parent>();
		newList.addAll(parents);
		return newList;
	}
	
	/**
	 * Get a copy of the children list.
	 * @return A <strong>copy</strong> of the children list.
	 */
	public List<Child> getChildren() {
		List<Child> newList = new ArrayList<Child>();
		newList.addAll(children);
		return newList;
	}
	
	/**
	 * Get a copy of the emergency contacts
	 * @return A <strong>copy</strong> of the emergency contact list.
	 */
	public List<EmergencyContact> getEmergencyContacts() {
		List<EmergencyContact> newList = new ArrayList<EmergencyContact>();
		newList.addAll(emergencyContacts);
		return newList;
	}
	
	/**
	 * Remove a parent from this family
	 * @param p The parent to remove
	 * @return True, if it was removed
	 */
	public boolean removeParent(Parent p) {
		return this.parents.remove(p);
	}
	
	/**
	 * Remove an emergency contact from this family
	 * @param c The contact to remove
	 * @return True, if it was removed
	 */
	public boolean removeEmergencyContact(EmergencyContact c) {
		return this.emergencyContacts.remove(c);
	}
	
	/**
	 * Remove a child from this family
	 * @param c The child to remove
	 * @return True, if it was removed
	 */
	public boolean removeChild(Child c) {
		return this.children.remove(c);
	}
}
