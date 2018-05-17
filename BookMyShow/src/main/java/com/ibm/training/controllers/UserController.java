package com.ibm.training.controllers;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ibm.training.models.Booking;
import com.ibm.training.models.Login;
import com.ibm.training.models.Movie;
import com.ibm.training.models.Theatre;
import com.ibm.training.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired

	UserService uservice;

	
	@RequestMapping("/insert")
	
	public Login insertPerson(@RequestBody Login l) {
		 uservice.signUpUser(l);
		 return l;
	

}
	
	@RequestMapping("/all")
 	public Collection<Movie> getAll(){
		return uservice.findAllMovies();
	} 
	@RequestMapping("/fetch/{id}")
	public List <Theatre> getTheatre(@PathVariable ("id") String id) {
		return uservice.getTheatre(id);
	
	} 
	@RequestMapping("/book")
	public void booking(@RequestBody Booking book) {
		uservice.book(book);
	}
}
