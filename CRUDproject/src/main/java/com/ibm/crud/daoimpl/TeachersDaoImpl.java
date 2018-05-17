package com.ibm.crud.daoimpl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.ibm.crud.dao.TeachersDao;
import com.ibm.crud.pojo.Teachers;

public class TeachersDaoImpl implements TeachersDao {
	JdbcTemplate template; 

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public int add(Teachers t) {
		 String sql="insert into teachers(t_name,expertise)values(?,?)";		
		return template.update(sql);
	}

	public int update(Teachers t) {
		String sql="update teachers set expertise="+t.getExpertise()+" where t_name="+t.getT_name() ;
		return template.update(sql);
	}

	public List<Teachers> getAllTeachers() {
         return template.query("select * from teachers",new Teacher_RowMapper());
	}

	public int delete(int t_id) {
        String sql ="delete from teachers where t_id="+t_id;

		return template.update(sql);
	}

}
