package com.leeyunbo.biz.common;

import org.aspectj.lang.JoinPoint;

public class AfterThrowing {
	public void exceptionLog(JoinPoint jp, Exception exceptObj) {
		String method = jp.getSignature().getName();
		
		if(exceptObj instanceof IllegalArgumentException) {
			System.out.println("부적합한 값이 입력되었습니다.");
		} else if(exceptObj instanceof NumberFormatException) {
			System.out.println("숫자 형식의 값이 아닙니다.");
		} else if(exceptObj instanceof Exception) {
			System.out.println("문제가 발생했습니다.");
		}
	}
}
