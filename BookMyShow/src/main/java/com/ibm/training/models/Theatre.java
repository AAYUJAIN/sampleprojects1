package com.ibm.training.models;

import java.io.Serializable;




import org.springframework.stereotype.Component;

@SuppressWarnings("serial")
@Component

public class Theatre implements Serializable {
    private String tt_id;
	private String t_id;
	private String t_name;
	private String seat_id;
	private String m_id;
	public String getTt_id() {
		return tt_id;
	}
	public void setTt_id(String tt_id) {
		this.tt_id = tt_id;
	}
	public String getT_id() {
		return t_id;
	}
	public void setT_id(String t_id) {
		this.t_id = t_id;
	}
	public String getT_name() {
		return t_name;
	}
	public void setT_name(String t_name) {
		this.t_name = t_name;
	}
	public String getSeat_id() {
		return seat_id;
	}
	public void setSeat_id(String seat_id) {
		this.seat_id = seat_id;
	}
	public String getM_id() {
		return m_id;
	}
	public void setM_id(String m_id) {
		this.m_id = m_id;
	}
	public Theatre(String tt_id, String t_id, String t_name, String seat_id, String m_id) {
		super();
		this.tt_id = tt_id;
		this.t_id = t_id;
		this.t_name = t_name;
		this.seat_id = seat_id;
		this.m_id = m_id;
	}
	
	public Theatre() {}
}
	
	