package org.tnsif.objectInjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DIUsingObjects {

	public static void main(String[] args) {
		BeanFactory f=new ClassPathXmlApplicationContext("web.xml");
		CellPhone e1=f.getBean("c2",CellPhone.class);
		e1.accept();
		


	}

}