package com.ibm.crud.dao;

import java.util.List;

import com.ibm.crud.pojo.Teachers;

public interface TeachersDao {
	
	public int add(Teachers t);
    public int update(Teachers t);
    public int delete(int t_id);
	public List<Teachers> getAllTeachers();
}
 
   
     

