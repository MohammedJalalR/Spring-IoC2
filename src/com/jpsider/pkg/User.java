package com.jpsider.pkg;

public class User {
	
	private String Username;
	private int Userid;
    private Address HomeAddress;
    private Address WorkAddress;
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public int getUserid() {
		return Userid;
	}
	@Override
	public String toString() {
		return "User [Username=" + Username + ", Userid=" + Userid + ", HomeAddress=" + HomeAddress + ", WorkAddress="
				+ WorkAddress + "]";
	}
	public void setUserid(int userid) {
		Userid = userid;
	}
	public Address getHomeAddress() {
		return HomeAddress;
	}
	public void setHomeAddress(Address homeAddress) {
		HomeAddress = homeAddress;
	}
	public Address getWorkAddress() {
		return WorkAddress;
	}
	public void setWorkAddress(Address workAddress) {
		WorkAddress = workAddress;
	}
    

}
