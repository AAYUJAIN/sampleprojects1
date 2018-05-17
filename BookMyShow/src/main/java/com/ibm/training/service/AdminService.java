package com.ibm.training.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.training.DaoImpl.AdminDaoImpl;
import com.ibm.training.models.Login;
import com.ibm.training.models.Movie;
import com.ibm.training.models.Theatre;

@Service
public class AdminService {

	@Autowired
	AdminDaoImpl adminDaoImpl;
	public void insertMovie(Movie m) {
		adminDaoImpl.movieInsert(m);
	}
	public void theatreIn(Theatre t) {
		adminDaoImpl.theatreInsert(t);
	}
	
	public void movieDel(String id) {
		adminDaoImpl.movieDelete(id);
	} 
	public void deleteTheatre(String id) {
		adminDaoImpl.deleteTheatre(id);
	}  
	
	public Collection<Movie> findAllMovies(){
		return adminDaoImpl.getAllMovies();
	}
	
	public Collection<Theatre> findAllTheatre(){
		return adminDaoImpl.getAllTheatre();	}
	
	public void updatemovie1(Movie m) {
		adminDaoImpl.UpdateMovie(m);
	}
	public void updatetheatres(Theatre t) {
		adminDaoImpl.updateTheatre(t);

	}  
	public Login loginA(Login lo) {
		 return adminDaoImpl.loginAdmin(lo);
		
	}
}
