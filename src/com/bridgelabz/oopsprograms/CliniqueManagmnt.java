package com.bridgelabz.oopsprograms;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

import com.bridgelabz.util.AppointmentDetails;
import com.bridgelabz.util.DoctorDetails;
import com.bridgelabz.util.OopsUtility;
import com.bridgelabz.util.PatientDetails;
import com.bridgelabz.util.Searching;

public class CliniqueManagmnt 
{
	public static List<PatientDetails> patientlist = new ArrayList<PatientDetails>();
	public static List<DoctorDetails> doctorlist = new ArrayList<DoctorDetails>();
	public static List<AppointmentDetails> appointmntlist = new ArrayList<AppointmentDetails>();
	static DoctorDetails doctorsinfo =null;
	static PatientDetails patientsinfo = null;

	public static String patientsfile = "/home/admin1/Desktop/patients.json";
	public static String Doctorsfile ="/home/admin1/Desktop/Doctors.json";
	public static String Appointmentsfile = "/home/admin1/Desktop/Appointments.json";

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

		System.out.println("the Doctor's  ID is set");
		doctorsinfo.setdId(doctorlist.size()+1);

		System.out.println("Enter the Doctor's  name ");
		doctorsinfo.setDname(OopsUtility.stringValue());

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
			patientlist = OopsUtility.userReadValue(string, DoctorDetails.class);
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

		patientlist.add(patientsinfo);
		String json = OopsUtility.userWriteValueAsString(patientlist);
		OopsUtility.writeFile(json, patientsfile);
	}		


	public static void addDetails() throws JsonGenerationException, JsonMappingException, IOException
	{
		System.out.println("press 1 to Add doctor 2.patient");
		System.out.println("Enter the choice");
		int choose = OopsUtility.intValue();
		switch(choose)
		{
		case 1:
		{
			addDoctorInfo();
			System.out.println("Doctor Details Added successfully");
		}break;
		case 2:
		{
			addPatientInfo();
			System.out.println("Patients Details Added successfully");
		}break;
		}

	}

	//Searching
	public static void searchDetails() throws IOException
	{

		System.out.println("Enter 1. To search Doctor  2.To Search Patient");
		int select =OopsUtility.intValue();
		switch(select)
		{

		case 1:
		{
			System.out.println("1. To search Doctor By Name 2.By ID 3.By Availability  4.By Specilization");
			int choice = OopsUtility.intValue();
			System.out.println("Enter your choice");
			switch(choice)
			{
			case 1:
			{

				System.out.println("Searching by name");
				List<DoctorDetails> doctorname = Searching.searchByName();
				if (!doctorname.isEmpty())
					System.out.println("Doctor is present");
				else
					System.out.println("Doctor is not present");	
			}break;

			case 2:  
			{
				System.out.println("Searching by id");
				List<DoctorDetails> doctorid = Searching.searchByID();
				if (!doctorid.isEmpty())
					System.out.println("Doctor is present");
				else
					System.out.println("Doctor is not present");


			}break;
			case 3:
			{
				System.out.println("Searching by Avalability");
				List<DoctorDetails> doctoravalb = Searching.searchByAvailability();
				if (!doctoravalb.isEmpty())
					System.out.println("Doctor is present");
				else
					System.out.println("Doctor is not present");
			}break;
			case 4:
			{
				System.out.println("Searching by Specilization");
				List<DoctorDetails> doctorspec= Searching.searchBySpecialization();
				if (!doctorspec.isEmpty())
					System.out.println("Doctor is present");
				else
					System.out.println("Doctor is not present");

			}break;
			}
		}break;
		case 2:
		{
			System.out.println("press To search patient 1.By ID /n 2.By Phone number");
			int val = OopsUtility.intValue();
			switch(val)
			{
			case 1:
			{
				System.out.println("Searching by id");
				List<PatientDetails> patientid = Searching.searchByPID();
				if (!patientid.isEmpty())
					System.out.println("patient is present");
				else
					System.out.println("patient is not present");
			}break;


			case 2:
			{
				System.out.println("Searching by number");
				List<PatientDetails> patientid = Searching.searchByPnum();
				if (!patientid.isEmpty())
					System.out.println("patient is present");
				else
					System.out.println("patient is not present");

			}break;
			default:break;
			}


		}break;
		default:break;
		}
	}


	//Display Doctor
	public static void displayDoctor()
	{
		for(DoctorDetails doctor:doctorlist)
		{
			System.out.println("-----Doctor Details:-----");
			System.out.println("Doctor Name=" + doctor.getDname());
			System.out.println("Doctor's ID=" + doctor.getdId());
			System.out.println("Doctor's Availability=" + doctor.getdAvailablty());
			System.out.println("Doctor's Specilization=" + doctor.getdSpecification());

		}

	}






	public static void takeAppointment() throws IOException
	{
		System.out.println("Enter the Patients phone number:");


		List<PatientDetails> patientnum = Searching.searchByPnum();

		if (!patientnum.isEmpty())
		{
			
			System.out.println("patients details found..");

		}
		else
		{
			System.out.println("Take Appointment....!!!");	
		}







	}
}


