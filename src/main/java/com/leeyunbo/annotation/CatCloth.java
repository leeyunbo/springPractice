package com.leeyunbo.annotation;

import org.springframework.stereotype.Component;

@Component("catCloth")
public class CatCloth implements Cloth{
	public void CatCloth() {
		System.out.println("===> CatCloth 객체 생성");
	}
	
	@Override
	public void dressCloth() {
		System.out.println("== 고양이 옷을 입혔습니다.");
	}

	@Override
	public void undressCloth() {
		System.out.println("== 고양이 옷을 벗겼습니다.");
	}

}
