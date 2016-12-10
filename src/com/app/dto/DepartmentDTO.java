package com.app.dto;

import java.io.Serializable;

@SuppressWarnings("serial")
public class DepartmentDTO implements Serializable {

	private Integer id;
	private String departmentType;
	private String name;
	private String address;

	public DepartmentDTO() {
	}

	public DepartmentDTO(Integer id, String departmentType, String name, String address) {
		this.id = id;
		this.departmentType = departmentType;
		this.name = name;
		this.address = address;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDepartmentType() {
		return departmentType;
	}

	public void setDepartmentType(String departmentType) {
		this.departmentType = departmentType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
