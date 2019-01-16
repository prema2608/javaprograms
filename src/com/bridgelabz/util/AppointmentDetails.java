package com.bridgelabz.util;

import java.util.ArrayList;
import java.util.List;

public class AppointmentDetails 
{
  private String DoctorName;
  List<PatientDetails> patientlist = new ArrayList<PatientDetails>();
  
public String getDoctorName() {
	return DoctorName;
}
public void setDoctorName(String doctorName) {
	DoctorName = doctorName;
}
public List<PatientDetails> getPatientlist() {
	return patientlist;
}
public void setPatientlist(List<PatientDetails> patientlist) {
	this.patientlist = patientlist;
}
	
	
}
