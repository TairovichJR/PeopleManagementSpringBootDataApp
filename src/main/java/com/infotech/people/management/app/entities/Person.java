package com.infotech.people.management.app.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name="person_table")
@DynamicUpdate
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="person_id")
	private int id;
	
	@Column(name="first_name", length = 60, nullable = false)
	private String fistName;
	
	@Column(name="last_name", length = 60, nullable = false)
	private String lastName;
	
	@Column(name="email", unique = true)
	private String email;
	
	@Column(name="creation_date")
	private Date creationDate;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Person(String fistName, String lastName, String email, Date creationDate) {
		super();
		this.fistName = fistName;
		this.lastName = lastName;
		this.email = email;
		this.creationDate = creationDate;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFistName() {
		return fistName;
	}


	public void setFistName(String fistName) {
		this.fistName = fistName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Date getCreationDate() {
		return creationDate;
	}


	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}


	@Override
	public String toString() {
		return "Person [id=" + id + ", fistName=" + fistName + ", lastName=" + lastName + ", email=" + email
				+ ", creationDate=" + creationDate + "]";
	}
	
}
