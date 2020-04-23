package com.leeyunbo.biz;

/*
 * �ۼ��� : ������
 * �ۼ��� : 4/22 
 * ���� : ȸ�� �׽�Ʈ �ڵ�
 */

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.leeyunbo.biz.user.UserService;
import com.leeyunbo.biz.user.UserVO;
import com.leeyunbo.biz.user.impl.UserServiceImpl;


public class UserServiceClient {
	public static void main(String[] args) {
		//1. Spring �����̳� ���� 
		AbstractApplicationContext container =
				new GenericXmlApplicationContext("applicationContext4.xml");
		
		//2. Spring �����̳ʷκ��� UserServiceImpl Lookup 
		UserService userService =
				(UserService) container.getBean("userService");
		
		//3. �α��� ��� �׽�Ʈ 
		UserVO vo = new UserVO(); 
		vo.setId("test");
		vo.setPassword("test123");
		UserVO user = userService.getUser(vo);
		if(user != null) {
			System.out.println(user.getName() + " �� ȯ���մϴ�.");
		} else {
			System.out.println("���̵� Ȥ�� ��й�ȣ�� �ùٸ��� �ʽ��ϴ�.");
		}
		
		//4. ������ �����̳� ����
		container.close();
	}
}
