package org.tnsif.placementmanagement.entites;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="College")
public class College {
	@Id
	private Integer id;
	private String collegename;
	private String location;
	// Default COntstructor 
	public College() {
		super();
		// TODO Auto-generated constructor stub
	}
	// Parameterized Constructor
	public College(Integer id, String collegename, String location) {
		super();
		this.id = id;
		this.collegename = collegename;
		this.location = location;
	}
	// To String
	@Override
	public String toString() {
		return "College [id=" + id + ", collegename=" + collegename + ", location=" + location + "]";
	}
	// Setters ANd Getters 
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCollegename() {
		return collegename;
	}
	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	

}
