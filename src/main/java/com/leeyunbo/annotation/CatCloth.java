package com.leeyunbo.annotation;

import org.springframework.stereotype.Component;

@Component("catCloth")
public class CatCloth implements Cloth{
	public void CatCloth() {
		System.out.println("===> CatCloth ��ü ����");
	}
	
	@Override
	public void dressCloth() {
		System.out.println("== ����� ���� �������ϴ�.");
	}

	@Override
	public void undressCloth() {
		System.out.println("== ����� ���� ������ϴ�.");
	}

}
