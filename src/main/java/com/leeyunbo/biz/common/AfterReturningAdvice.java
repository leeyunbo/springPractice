package com.leeyunbo.biz.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.annotation.AfterReturning;
import org.springframework.stereotype.Service;

import com.leeyunbo.biz.user.UserVO;

@Service
@Aspect
public class AfterReturningAdvice {
	@Pointcut("execution(* com.leeyunbo.biz..*Impl.get*(..))")
	public void getPointcut() {}
	
	@AfterReturning(pointcut="getPointcut()", returning="returnObj")
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
