package Entities;

import java.time.LocalDate;

public class Gamer {
	private int ID;
	private String Name;
	private String Surname;
	private LocalDate DateOfBirth;
	private String IdentifyNumber;
	
	public Gamer() {
		
	}
	
	
	public Gamer(int iD, String name, String surname, LocalDate dateOfBirth, String identifyNumber) {
		super();
		ID = iD;
		Name = name;
		Surname = surname;
		setDateOfBirth(dateOfBirth);
		IdentifyNumber = identifyNumber;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getSurname() {
		return Surname;
	}
	public void setSurname(String surname) {
		Surname = surname;
	}
	public String getIdentifyNumber() {
		return IdentifyNumber;
	}
	public void setIdentifyNumber(String identifyNumber) {
		IdentifyNumber = identifyNumber;
	}


	public LocalDate getDateOfBirth() {
		return DateOfBirth;
	}


	public void setDateOfBirth(LocalDate dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}
}
