package com.leeyunbo.annotation;

import org.springframework.stereotype.Component;

@Component("dogCloth")
public class DogCloth implements Cloth {
	public DogCloth() {
		System.out.println("===> DogCloth 객체 생성");
	}
	
	public void dressCloth() {
		System.out.println("== 강아지 옷을 입혔습니다.");
	}
	
	public void undressCloth() {
		System.out.println("== 강아지 옷을 벗겼습니다.");
	}
}
