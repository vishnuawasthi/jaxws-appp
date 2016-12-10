package com.app.dao;

import com.app.dto.UserDetails;

public interface EmployeeDAO {


	UserDetails getUser(Integer id);

	boolean addUser(UserDetails user);

	boolean delete(Integer id);

	UserDetails[] getUsers();

	
}
