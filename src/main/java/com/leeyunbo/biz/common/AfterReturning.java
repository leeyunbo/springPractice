package com.leeyunbo.biz.common;

import org.aspectj.lang.JoinPoint;

import com.leeyunbo.biz.user.UserVO;

public class AfterReturning {
	public void afterLog(JoinPoint jp, Object returnObj) {
		String method = jp.getSignature().getName();
		if(returnObj instanceof UserVO) { // 자식 -> 부모, 업캐스팅이 선행이 되었음
			UserVO user = (UserVO) returnObj; // 따라서, 부모 -> 자식이되는 다운 캐스팅이 가능함
			if(user.getRole().equals("Admin")) {
				System.out.println(user.getName() + " 로그인(Admin)");
			}
		}
	
		System.out.println("[사후 처리] " + method + "() 메소드 리턴값 : " + returnObj.toString());
	}
}
