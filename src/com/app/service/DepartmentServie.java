package com.app.service;

import javax.jws.WebService;

import com.app.dto.DepartmentDTO;

@WebService(name="DepartmentServie")
public interface DepartmentServie {

	DepartmentDTO getDepartment( Integer id);
	
	boolean addDepartment(DepartmentDTO dto);
}
