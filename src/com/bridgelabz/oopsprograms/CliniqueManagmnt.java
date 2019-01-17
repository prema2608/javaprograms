package com.bridgelabz.oopsprograms;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

import com.bridgelabz.util.AppointmentDetails;
import com.bridgelabz.util.DoctorDetails;
import com.bridgelabz.util.OopsUtility;
import com.bridgelabz.util.PatientDetails;

public class CliniqueManagmnt 
{
		static List<PatientDetails> patientlist = new ArrayList<PatientDetails>();
		static List<DoctorDetails> doctorlist = new ArrayList<DoctorDetails>();
		List<AppointmentDetails> appointmntlist = new ArrayList<AppointmentDetails>();
      static DoctorDetails doctorsinfo =null;
      static PatientDetails patientsinfo = null;
		
		static String patientsfile = "/home/admin1/Desktop/patients.json";
		static String Doctorsfile ="/home/admin1/Desktop/Doctors.json";
		String Appointmentsfile = "/home/admin1/Desktop/Appointments.json";
		
		public static void addDoctorInfo() throws JsonGenerationException, JsonMappingException, IOException
		{

	        String string = OopsUtility.readFile(Doctorsfile);
	        try {
	        	 doctorlist = OopsUtility.userReadValue(string, DoctorDetails.class);
	            System.out.println("File is not empty!");

	        } catch (Exception e) {
	            System.out.println("File is empty!");

	        }
			doctorsinfo = new DoctorDetails();
            System.out.println("------DoctorDetails-------");
            
			System.out.println("Enter the Doctor's  name ");
			doctorsinfo.setDname(OopsUtility.stringValue());

			System.out.println("Enter the Doctor's  ID ");
			doctorsinfo.setdId(OopsUtility.longValue());

			System.out.println("Enter the Doctor's  Availabitily(Am or Pm) ");
			doctorsinfo.setdAvailablty(OopsUtility.stringValue());

			System.out.println("Enter the Doctor's  Specification ");
			doctorsinfo.setdSpecification(OopsUtility.stringValue());

			doctorlist.add(doctorsinfo);
			System.out.println("-----------------------------------------------------");

			
			String json = OopsUtility.userWriteValueAsString(doctorlist);
	        OopsUtility.writeFile(json, Doctorsfile);
			
		}

		 public static void addPatientInfo() throws JsonGenerationException, JsonMappingException, IOException
		 {
			 patientsinfo = new  PatientDetails();

		        String string = OopsUtility.readFile(patientsfile);
		        try {
		        	 doctorlist = OopsUtility.userReadValue(string, DoctorDetails.class);
		            System.out.println("File is not empty!");

		        } catch (Exception e) {
		            System.out.println("File is empty!");

		        }
			 System.out.println("------patientsDetails-------");
	            
				System.out.println("Enter the patients's  name ");
				patientsinfo.setpName(OopsUtility.stringValue());

				System.out.println("Enter the patient's  ID ");
				patientsinfo.setpId(OopsUtility.longValue());

				System.out.println("Enter the patient's  mobile number ");
				patientsinfo.setMobNum(OopsUtility.longValue());

				System.out.println("Enter the patient's  Age ");
				patientsinfo.setpAge(OopsUtility.intValue());

				doctorlist.add(doctorsinfo);
				String json = OopsUtility.userWriteValueAsString(patientlist);
		        OopsUtility.writeFile(json, patientsfile);
		 }		
				
	}


