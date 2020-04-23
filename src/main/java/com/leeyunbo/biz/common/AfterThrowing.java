package com.leeyunbo.biz.common;

import org.aspectj.lang.JoinPoint;

public class AfterThrowing {
	public void exceptionLog(JoinPoint jp, Exception exceptObj) {
		String method = jp.getSignature().getName();
		
		if(exceptObj instanceof IllegalArgumentException) {
			System.out.println("�������� ���� �ԷµǾ����ϴ�.");
		} else if(exceptObj instanceof NumberFormatException) {
			System.out.println("���� ������ ���� �ƴմϴ�.");
		} else if(exceptObj instanceof Exception) {
			System.out.println("������ �߻��߽��ϴ�.");
		}
	}
}
