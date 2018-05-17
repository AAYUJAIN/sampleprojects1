package com.ibm.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ibm.crud.daoimpl.TeachersDaoImpl;
import com.ibm.crud.pojo.Teachers;

@Controller
public class TeacherController {
	@Autowired
	TeachersDaoImpl Dao;
	
	@RequestMapping("/view")
	public ModelAndView viewTeachers(){  
        List<Teachers> list=Dao.getAllTeachers();  
         ModelAndView mv= new  ModelAndView();
         mv.setViewName("view");
         mv.addObject("list",list);
        return mv; 
    }  

}
