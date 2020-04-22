package com.leeyunbo.biz.common;

import org.aspectj.lang.JoinPoint;

import com.leeyunbo.biz.user.UserVO;

public class AfterReturning {
	public void afterLog(JoinPoint jp, Object returnObj) {
		String method = jp.getSignature().getName();
		if(returnObj instanceof UserVO) { // �ڽ� -> �θ�, ��ĳ������ ������ �Ǿ���
			UserVO user = (UserVO) returnObj; // ����, �θ� -> �ڽ��̵Ǵ� �ٿ� ĳ������ ������
			if(user.getRole().equals("Admin")) {
				System.out.println(user.getName() + " �α���(Admin)");
			}
		}
	
		System.out.println("[���� ó��] " + method + "() �޼ҵ� ���ϰ� : " + returnObj.toString());
	}
}
