package Entities;
import java.time.LocalDate;

import Abstract.Entity;

public class Customer implements Entity{
	
	private int id;
	private String FirstName;
	private String LastName;
	private LocalDate DateofBirth;
	private String NationalityID;
	
	public Customer() {
		
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public LocalDate getDateofBirth() {
		return DateofBirth;
	}
	public void setDateofBirth(LocalDate dateofBirth) {
		DateofBirth = dateofBirth;
	}
	public String getNationalityID() {
		return NationalityID;
	}
	public void setNationalityID(String identifyNumber) {
		NationalityID = identifyNumber;
	}
	
	
}
