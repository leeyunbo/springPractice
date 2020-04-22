package com.leeyunbo.biz.common;

import org.aspectj.lang.ProceedingJoinPoint;

public class AroundAdvice {
	public Object aroundLog(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("[BEFORE] : ����Ͻ� �޼��� ���� ���� ó���� ����...");
		Object returnObj = pjp.proceed(); 
		System.out.println("[AFTER] : ����׽� �޼��� ���� �Ŀ� ó���� ����..."); 
		return returnObj; 
	}
}
