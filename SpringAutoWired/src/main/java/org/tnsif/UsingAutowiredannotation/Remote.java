package org.tnsif.UsingAutowiredannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Remote {
	
	//DI in the form of objects
	private Cell cell;

	//DI using setters
	
	@Autowired
	
	@Qualifier("c2")
	public void setCell(Cell cell) {
		this.cell = cell;
	}

	//default constructor
	public Remote() 
	{
		System.out.println("Default constructor for Remote");
	}
	
	//injecting the object of Cell class
	public void remote() {
		cell.power();
	}
	

}