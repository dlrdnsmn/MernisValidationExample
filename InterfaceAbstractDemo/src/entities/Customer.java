package entities;

import java.sql.Date;

import abstracts.CustomerService;
import abstracts.EntityService;

public class Customer implements EntityService{

	public int id;
	public String firstName;
	public String lastName;
	public int  dateTime;
	public String nationalId;
	
	public Customer() {
		super();
	}

	public Customer(int id, String firstName, String lastName, int  dateTime, String nationalId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateTime = dateTime;
		this.nationalId = nationalId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int  getDateTime() {
		return dateTime;
	}

	public void setDateTime(int  dateTime) {
		this.dateTime = dateTime;
	}

	public String getNationalId() {
		return nationalId;
	}

	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
	}

	
	
}
