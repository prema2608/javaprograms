package com.bridgelabz.util;

import java.util.ArrayList;
import java.util.List;

public class ApointmentDetails 
{
	private String doctorName;
	List<PatientDetails> applist = new ArrayList<PatientDetails>();
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public List<PatientDetails> getApplist() {
		return applist;
	}
	public void setApplist(List<PatientDetails> applist) {
		this.applist = applist;
	}
	

}
