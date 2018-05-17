package com.ibm.training.service;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.training.DaoImpl.UserDaoImpl;
import com.ibm.training.models.Booking;
import com.ibm.training.models.Login;
import com.ibm.training.models.Movie;
import com.ibm.training.models.Theatre;

@Service
public class UserService {
	@Autowired
	UserDaoImpl userDaoImpl;
	
	public void signUpUser( Login l) {
		userDaoImpl.signupUser(l);
	}
	public Collection<Movie> findAllMovies(){
		return userDaoImpl.getAllMovies();
	}
	public List <Theatre> getTheatre(String mid) {
		return userDaoImpl.findTheatrebyid(mid);
	}
	public void book(Booking b) {
		userDaoImpl.bookTickets(b);
	}
	public Login login(Login l) {
		userDaoImpl.loginUser(l);
		return l;
		
	}
}
