package com.ibm.training.DaoImpl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ibm.training.models.Login;
import com.ibm.training.models.Movie;
import com.ibm.training.models.Theatre;

@Repository
public class AdminDaoImpl {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	public void movieInsert(Movie mv) {
	jdbcTemplate.update("insert into movie values (?,?,?,?)", mv.getM_id(),
			mv.getM_name(),mv.getM_date(),mv.getM_time());
			
	}
	public void theatreInsert(Theatre t) {
		jdbcTemplate.update("insert into theatre(t_id,t_name,seat_id,m_id) values (?,?,?,?)", t.getT_id(),t.getT_name(),t.getSeat_id(),t.getM_id());}
	public void movieDelete(String id) {
		jdbcTemplate.update("delete from movie where m_id=?",id);
	} 
	public void deleteTheatre(String id) {
		jdbcTemplate.update("delete from theatre where t_id=?",id);
		System.out.println("theatre is deleted");
	
	}
	public Collection<Movie> getAllMovies(){
		return jdbcTemplate.query("select * from movie", 
		new BeanPropertyRowMapper<Movie>(Movie.class));
	}
	public Collection<Theatre> getAllTheatre(){
		return jdbcTemplate.query("select * from theatre",new BeanPropertyRowMapper<Theatre>
		(Theatre.class));
		}
	public void UpdateMovie(Movie m) {
	 jdbcTemplate.update("update movie set m_name=?,"
	 		+ "m_date=?,m_time=? where m_id=?",m.getM_name(),m.getM_date(),m.getM_time(),m.getM_id());
	}
	public void  updateTheatre(Theatre th) {
		jdbcTemplate.update("update theatre set t_name=?, seat_id=? where t_id=? ",th.getT_name(), th.getSeat_id(),
				th.getT_id());
	}  
public Login loginAdmin(Login loginA) {
	System.out.println("hiii"+ loginA.getName());
    
	try {
		loginA = jdbcTemplate.queryForObject("select * from login where id=?,password=?", 
				new BeanPropertyRowMapper<Login>(Login.class));
		
	}
	catch(Exception e) {
		return null;
	}
		return loginA;
}
}