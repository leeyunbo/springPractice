package polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {
	public static void main(String[] args) {
		//1. 설정 파일 로딩하여 컨테이너 구동 
		AbstractApplicationContext factory =
				new GenericXmlApplicationContext("applicationContext.xml");
		
		//2. Spring 컨테이너로부터 필요한 객체를 요청(Lookup)
		TV tv = (TV)factory.getBean("tv"); 
		tv.powerOn(); 
		tv.volumeUp(); 
		tv.volumeDown();
		tv.powerOff();
		
		//3. 컨테이너 종료 
		factory.close(); 
	}
}
