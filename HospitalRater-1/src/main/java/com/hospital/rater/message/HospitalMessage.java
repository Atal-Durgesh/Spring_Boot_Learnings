package com.hospital.rater.message;

import java.util.HashMap;


public class HospitalMessage {
	
	private HashMap<String,Object> params;
	private String message;
	
	public HospitalMessage() {
		
	}
	
	public HospitalMessage(HashMap<String, Object> params) {
		super();
		this.params = params;
	}
	
	public HospitalMessage(HashMap<String, Object> params, String message) {
		super();
		this.params = params;
		this.message = message;
	}
	
	public HashMap<String, Object> getParams() {
		return params;
	}
	public void setParams(HashMap<String, Object> params) {
		this.params = params;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
	

}
