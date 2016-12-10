package com.app.service;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.app.dto.DepartmentDTO;

@WebService(name = "DepartmentServieImpl", endpointInterface = "com.app.service.DepartmentServie", serviceName = "DeptService")
public class DepartmentServieImpl implements DepartmentServie {

	private List<DepartmentDTO> departments = new ArrayList<DepartmentDTO>();

	public DepartmentServieImpl() {
		this.departments = departmentist();
	}

	@WebResult(name = "DepartmentDTO")
	@WebMethod(operationName = "getDepartment")
	@Override
	public DepartmentDTO getDepartment(@WebParam(name = "departmentId") Integer id) {
		System.out.println("getDepartment() - start");
		for (DepartmentDTO dto : departments) {
			if (dto.getId().equals(id)) {
				System.out.println("getDepartment() - end");
				return dto;
			}
		}
		System.out.println("getDepartment() - end");
		return null;
	}

	@WebMethod(operationName = "addDepartment")
	@Override
	public boolean addDepartment(DepartmentDTO dto) {
		if (dto != null) {
			departments.add(dto);
			return true;
		}
		return false;
	}

	@WebMethod(exclude = true)
	List<DepartmentDTO> departmentist() {
		List<DepartmentDTO> departments = new ArrayList<DepartmentDTO>();

		return departments;
	}
}
