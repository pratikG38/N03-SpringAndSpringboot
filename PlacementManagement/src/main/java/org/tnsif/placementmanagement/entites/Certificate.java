package org.tnsif.placementmanagement.entites;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Certificate")
public class Certificate {
	
	@Id
	private Integer id;
	private Integer year;
	private String college;
	
	//default constructor
	public Certificate() {
		super();
		// TODO Auto-generated constructor stub
	}

	//Parameterized constructor
	public Certificate(Integer id, Integer year, String college) {
		super();
		this.id = id;
		this.year = year;
		this.college = college;
	}

	//TO string method
	@Override
	public String toString() {
		return "Certificate [id=" + id + ", year=" + year + ", college=" + college + "]";
	}

	//Getters & setters method
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}
	
	
	
	
	
	
	

}

