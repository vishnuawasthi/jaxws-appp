package com.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import sun.security.action.GetLongAction;

import com.app.dto.UserDetails;

public class EmployeeDAOImpl implements EmployeeDAO {

	@Override
	public UserDetails getUser(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addUser(UserDetails user) {
		String sql = "INSERT INTO EMPLOYEE VALUES (?,?,?,?)";
		PreparedStatement stmt = null;
		Connection con = null;
		boolean isSuccess =false;
		try {
			con = DatabaseConnectionUtils.getInstance();
			stmt = con.prepareStatement(sql);
			stmt.setInt(0, user.getId());
			stmt.setString(1, user.getFirstName());
			stmt.setString(2, user.getLastName());
			stmt.setString(3, user.getEmail());
			isSuccess = stmt.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (null != con) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

		return isSuccess;
	}

	@Override
	public boolean delete(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public UserDetails[] getUsers() {
		// TODO Auto-generated method stub
		return null;
	}

}
