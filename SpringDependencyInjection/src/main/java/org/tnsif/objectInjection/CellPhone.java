package org.tnsif.objectInjection;
//program to demonstrate on DI in the form of objects
public class CellPhone {
	
	//2.DI in the form of objects
	Charger charger;

	//DI using setters
	public void setCharger(Charger charger) {
		this.charger = charger;
	}
	
	//injecting the object of Charger class
	public void accept()
	{
		charger.power();
	}

	

	
	

	

	
	
	

}