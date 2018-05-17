package com.ibm.training.DaoImpl;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ibm.training.models.Booking;
import com.ibm.training.models.Login;
import com.ibm.training.models.Movie;
import com.ibm.training.models.Theatre;

@Repository
public class UserDaoImpl {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void signupUser(Login login) {
	jdbcTemplate.update("insert into login values (?,?,?,?,?,?)", 
			login.getId(),login.getName(),login.getPassword(),login.getRole()
			,login.getPh_no(),login.getEmail());
	}
	public Login loginUser(Login login) {
		
		login = jdbcTemplate.queryForObject("select *from login where id=?,password=?", 
				new BeanPropertyRowMapper<Login>(Login.class));
		return login;
		
		
	}
	public Collection<Movie> getAllMovies(){
		return jdbcTemplate.query("select * from movie", 
		new BeanPropertyRowMapper<Movie>(Movie.class));
	}
	public List<Theatre> findTheatrebyid(String id){
		
		return jdbcTemplate.query("select * from theatre where m_id= ?", 
				new BeanPropertyRowMapper<Theatre>(Theatre.class),id);
	
	}
	public void bookTickets(Booking bk) {
		jdbcTemplate.update("insert into booking(tt_id) values(?)",bk.getTt_id());
	}
}

