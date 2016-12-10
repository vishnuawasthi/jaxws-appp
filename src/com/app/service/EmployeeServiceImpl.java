package com.app.service;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.app.dto.UserDetails;

@WebService(endpointInterface = "com.app.service.EmployeeService")
public class EmployeeServiceImpl implements EmployeeService {

	private List<UserDetails> users = new ArrayList<UserDetails>();

	public EmployeeServiceImpl() {
		users = usersList();
	}

	@WebMethod
	@Override
	public UserDetails getUser(Integer id) {
		System.out.println("getUser() - start");
		for (UserDetails dto : users) {
			if (dto.getId().equals(id)) {
				return dto;
			}
		}
		System.out.println("getUser() - end");
		return null;
	}

	@WebMethod
	@Override
	public boolean addUser(UserDetails user) {
		System.out.println("addUser() - start");
		if (null != user) {
			users.add(user);
			return true;
		}
		System.out.println("addUser() - end");
		return false;
	}

	@WebMethod
	@Override
	public boolean delete(Integer id) {
		System.out.println("delete() - start");
		for (UserDetails dto : users) {
			if (dto.getId().equals(id)) {
				users.remove(dto);
				return true;
			}
		}
		System.out.println("delete() - end");
		return false;
	}

	@WebMethod
	@Override
	public UserDetails[] getUsers() {
		System.out.println("getUsers() - start");

		System.out.println("getUsers() - end");
		return (UserDetails[]) users.toArray();
	}

	
	@WebMethod(exclude=true)
	private List<UserDetails> usersList() {
		List<UserDetails> list = new ArrayList<UserDetails>();

		UserDetails dto1 = new UserDetails(10, "John", "Deo", "john.deo@gmail.com");
		UserDetails dto2 = new UserDetails(11, "Iric", "Deo", "john.deo@gmail.com");
		UserDetails dto3 = new UserDetails(12, "Rosy", "Deo", "john.deo@gmail.com");
		UserDetails dto4 = new UserDetails(13, "Jenifer", "Deo", "john.deo@gmail.com");

		list.add(dto1);
		list.add(dto2);
		list.add(dto3);
		list.add(dto4);
		return list;
	}

}
