package org.tnsif.objectInjection;

public class Charger {
	
	//private data members
	private String brand;
	private int voltage;
	private String type;
	
	//DI using setters
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setVoltage(int voltage) {
		this.voltage = voltage;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public void power()
	{
		System.out.println("Details related to charger: ");
		System.out.println("Brand:" +brand+" "+"Voltage: "+voltage+" "+"Charger-Type: "+type);
	}
	
	

}