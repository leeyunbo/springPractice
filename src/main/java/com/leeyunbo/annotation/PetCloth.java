package com.leeyunbo.annotation;

import org.springframework.stereotype.Component;

@Component("cloth")
public class PetCloth {
	public PetCloth() {
		System.out.println("===> PetCloth °´Ã¼ »ý¼º");
	}
	
	public void dressCloth() {
		System.out.println("== ¿ÊÀ» ÀÔÇû½À´Ï´Ù.");
	}
	
	public void undressCloth() {
		System.out.println("== ¿ÊÀ» ¹þ°å½À´Ï´Ù.");
	}
}
