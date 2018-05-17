package com.ibm.training.models;

import java.io.Serializable;




import org.springframework.stereotype.Component;

@SuppressWarnings("serial")
@Component
public class Seat implements Serializable {
	
	private String  seat_id;

	 



	public Seat(String seat_id) {
		super();
		this.seat_id = seat_id;
		
	}

	 
	

	public String getSeat_id() {
		return seat_id;
	}

	public void setSeat_id(String seat_id) {
		this.seat_id = seat_id;
	}

    public Seat() {}
    
}