/**
 * 
 */
package com.app.service;

import javax.jws.WebService;

import com.app.dto.UserDetails;

/**
 * @author Dell
 *
 */

@WebService
public interface EmployeeService {

	UserDetails getUser(Integer id);

	boolean addUser(UserDetails user);

	boolean delete(Integer id);

	UserDetails[] getUsers();

}
