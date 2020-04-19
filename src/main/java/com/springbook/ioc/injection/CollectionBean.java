package com.springbook.ioc.injection;

import java.util.List;
import java.util.Map;

public class CollectionBean {
	private List<String> addressList;
	private Map<Integer,String> userList; 

	public List<String> getAddressList() {
		return addressList;
	}

	public void setAddressList(List<String> addressList) {
		this.addressList = addressList;
	}

	public Map<Integer, String> getUserList() {
		return userList;
	}

	public void setUserList(Map<Integer, String> userList) {
		this.userList = userList;
	} 
	
	
}
