package org.tnsif.autowiredexample;

public class Bike {
	
	//DI in the form of objects
	Petrol p;
	
	
	/*//DI using setters
	public void setP(Petrol p) {
		this.p = p;
	}*/
	
	
	
	//injecting the object of Petrol
	public void accept()
	{
		p.engine();
	}
	
	//DI Using constructor
	public Bike(Petrol p) {
		super();
		System.out.println("Autowire using constructor");
		this.p = p;
	}
	

}