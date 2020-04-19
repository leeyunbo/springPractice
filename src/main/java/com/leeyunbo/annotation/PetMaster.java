package com.leeyunbo.annotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class PetMaster {
	public static void main(String[] args) {
		AbstractApplicationContext factory =
				new GenericXmlApplicationContext("applicationContext3.xml");
		
		Dog dog = (Dog) factory.getBean("dog");
		dog.dressCloth();
		dog.undressCloth();
		
		factory.close();
	}
}
