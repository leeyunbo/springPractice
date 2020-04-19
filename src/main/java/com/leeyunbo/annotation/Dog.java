package com.leeyunbo.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("dog")
public class Dog implements Pet {
	@Autowired
	private PetCloth cloth; 
	
	public Dog() {
		System.out.println("===> Dog °´Ã¼ »ý¼º");
	}
	
	@Override
	public void dressCloth() {
		cloth.dressCloth();
	}
	
	@Override
	public void undressCloth() {
		cloth.undressCloth();
	}
}
 