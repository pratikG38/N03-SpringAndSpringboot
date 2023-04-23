package org.tnsif.autowiredexample;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//Program to demonstrate on autowired concept

public class Executor {

	public static void main(String[] args) {
		ApplicationContext c=new ClassPathXmlApplicationContext("beans.xml");
		Bike b=c.getBean("bike",Bike.class);
		b.accept();
	}

}