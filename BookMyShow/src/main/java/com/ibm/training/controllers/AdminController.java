package com.ibm.training.controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ibm.training.models.Login;
import com.ibm.training.models.Movie;
import com.ibm.training.models.Theatre;
import com.ibm.training.service.AdminService;



@Controller
@RequestMapping("/admin1")
public class AdminController {
	@Autowired
	Login login;

	@Autowired
	AdminService aservice;
	@RequestMapping("/insert")
	public Movie insertmovie(@RequestBody Movie movie) {
		aservice.insertMovie(movie);
		return movie;
		
	}
	@RequestMapping("/insert/theatre")
	public Theatre insertTheatre(@RequestBody Theatre t) {
		aservice.theatreIn(t);
		return t;

	} 
	@RequestMapping("/delete/{id}")

	public void deleteMovie(@PathVariable ("id") String id) {
		aservice.movieDel(id);
		System.out.println("Movie deleted");
	} 
	@RequestMapping("/delete/theatre/{id}")
	public void deleteTheatre(@PathVariable ("id") String id) {
		 aservice.deleteTheatre(id);
	} 
	@RequestMapping("/all")
	public Collection<Movie> getAll(){
		return aservice.findAllMovies();
	}  
	@RequestMapping("/theatre/all")
	public Collection<Theatre> getAllTheatre1(){
		return aservice.findAllTheatre();
	}  
	@RequestMapping("/updatemovie")
	public void updatemovie(@RequestBody Movie m) {
		aservice.updatemovie1(m);
		System.out.println("updated");
	}
	@RequestMapping("/update/theatre")
	public Theatre updateth(@RequestBody Theatre t) {
	aservice.updatetheatres(t);
		return t; 
	 }   
	@RequestMapping(value="admin",method=RequestMethod.POST)
	public ModelAndView authenticateUser(@RequestParam("login_id") String login_id,
			@RequestParam("pass") String pass) {
		ModelAndView mv = new ModelAndView();
		login.setId(login_id);
		login.setPassword(pass);
		
		
		login= aservice.loginA(login);
		  if(login_id.equals(login.getId())&& pass.equals(login.getPassword())) {
			mv.setViewName("movietheatre");
			mv.addObject("message",login.getName());
		}
          else {
        	  mv.setViewName("admin");
  			mv.addObject("message","Invalid Credentials");
          }
          return mv;
}
}
