package com.jpsider.pkg;

public class Address {
	
	private String State;
	private String city;
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getcity() {
		return city;
	}
	@Override
	public String toString() {
		return "Address [State=" + State + ", city=" + city + "]";
	}
	public void setcity(String city) {
		this.city = city;
	}

}
