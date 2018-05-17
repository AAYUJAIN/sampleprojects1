package com.ibm.crud.daoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import com.ibm.crud.pojo.Teachers;

public class Teacher_RowMapper implements RowMapper<Teachers> {

	

	public Teachers mapRow(ResultSet rs, int rowNum) throws SQLException {
		Teachers t = new Teachers();
		t.setT_id(rs.getInt(1));
		t.setT_name(rs.getString(2));
		t.setExpertise(rs.getString(3));
		return t;
	}

}
