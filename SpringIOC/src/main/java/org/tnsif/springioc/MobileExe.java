package org.tnsif.springioc;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


//program to demonstrate on spring IOC
public class MobileExe {

	public static void main(String[] args) {
		// created object for classes 
		
	    /*	Airtel a = new Airtel();
		a.call();
		a.massage();
		
		Jio j = new Jio();
		j.call();
		j.massage();
		*/
		
		@SuppressWarnings("resource")
		ApplicationContext c = new ClassPathXmlApplicationContext("beans.xml");
		/*Airtel  a=(Airtel) c.getBean("Airtel");
		a.call();
		a.massage();*/
		
		Sim s = c.getBean("sim ",Sim.class);
				s.call();
				s.massage();
		
		
		
	}

}
