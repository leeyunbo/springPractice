package com.leeyunbo.annotation;

import org.springframework.stereotype.Component;

@Component("dogCloth")
public class DogCloth implements Cloth {
	public DogCloth() {
		System.out.println("===> DogCloth ��ü ����");
	}
	
	public void dressCloth() {
		System.out.println("== ������ ���� �������ϴ�.");
	}
	
	public void undressCloth() {
		System.out.println("== ������ ���� ������ϴ�.");
	}
}
