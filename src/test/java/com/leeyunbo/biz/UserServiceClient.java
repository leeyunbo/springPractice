package com.leeyunbo.biz;

/*
 * 작성자 : 이윤복
 * 작성일 : 4/22 
 * 목적 : 회원 테스트 코드
 */

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.leeyunbo.biz.user.UserService;
import com.leeyunbo.biz.user.UserVO;
import com.leeyunbo.biz.user.impl.UserServiceImpl;


public class UserServiceClient {
	public static void main(String[] args) {
		//1. Spring 컨테이너 구동 
		AbstractApplicationContext container =
				new GenericXmlApplicationContext("applicationContext4.xml");
		
		//2. Spring 컨테이너로부터 UserServiceImpl Lookup 
		UserService userService =
				(UserService) container.getBean("userService");
		
		//3. 로그인 기능 테스트 
		UserVO vo = new UserVO(); 
		vo.setId("test");
		vo.setPassword("test123");
		UserVO user = userService.getUser(vo);
		if(user != null) {
			System.out.println(user.getName() + " 님 환영합니다.");
		} else {
			System.out.println("아이디 혹은 비밀번호가 올바르지 않습니다.");
		}
		
		//4. 스프링 컨테이너 종료
		container.close();
	}
}
