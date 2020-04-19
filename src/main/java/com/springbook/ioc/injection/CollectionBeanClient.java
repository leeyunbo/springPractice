package com.springbook.ioc.injection;

import java.util.List;
import java.util.Map;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CollectionBeanClient {

	public static void main(String[] args) {
		AbstractApplicationContext factory =
				new GenericXmlApplicationContext("applicationContext2.xml");
		
		CollectionBean bean = (CollectionBean) factory.getBean("collectionBean");
		List<String> addressList = bean.getAddressList();
		for(String address : addressList) {
			System.out.println(address);
		}
		
		Map<Integer, String> userList = bean.getUserList();
		for(Integer key : userList.keySet()) {
			System.out.println("key : " + key + " value : " + userList.get(key));
		}
		
		factory.close();
	}
}
