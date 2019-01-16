package com.bridgelabz.util;

public class PersonDetails 
{
	private  String Fname;
	private String lname;
	private long phonumbr;
	private AddressDetails addressDetails = new AddressDetails();

	public AddressDetails getAddressDetails() {
		return addressDetails;
	}
	public void setAddressDetails(AddressDetails addressDetails) {
		this.addressDetails = addressDetails;
	}
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public long getPhonumbr() {
		return phonumbr;
	}
	public void setPhonumbr(long phonumbr) {
		this.phonumbr = phonumbr;
	}
	
	

}
