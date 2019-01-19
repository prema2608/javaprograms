package com.bridgelabz.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

public class CliniqueManagmnt 
{
	public static List<PatientDetails> patientlist = new ArrayList<PatientDetails>();
	public static List<DoctorDetails> doctorlist = new ArrayList<DoctorDetails>();
	public static List<ApointmentDetails> appointmntlist = new ArrayList<ApointmentDetails>();
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
			System.out.println("1. To search Doctor By Name  2.By Availability  3.By Specilization");
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
				System.out.println("Searching by Avalability");
				List<DoctorDetails> doctoravalb = Searching.searchByAvailability();
				if (!doctoravalb.isEmpty())
					System.out.println("Doctor is present");
				else
					System.out.println("Doctor is not present");
			}break;
			case 3:
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
				PatientDetails patientnum = Searching.searchByPnum();
				if (patientnum!=null)
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
	public static void displayDoctor(List<DoctorDetails> doctorlist)
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
	
	//taking appointments

	public static void takeAppointment() throws IOException {
		String string = OopsUtility.readFile(Appointmentsfile);
		try {
			appointmntlist = OopsUtility.userReadValue(string, ApointmentDetails.class);
			System.out.println("File is not empty");

		} catch (Exception e) {
			System.out.println("File is empty");
		}
		PatientDetails patient = (PatientDetails) Searching.searchByPnum();
		if (patient != null) {
			System.out.println("Patient data already exist!!\nTaking appointment now....");
			appoint(patient);
			String json = OopsUtility.userWriteValueAsString(appointmntlist);
			OopsUtility.writeFile(json, Appointmentsfile);
		} else {
			System.out.println("Patient data doesnot exist\nPlease first add patient detials on to database");
		}
}
	
	
	
	public static void appoint(PatientDetails patient) throws IOException {
		System.out.println("Search doctor by- 1:Name 2:Speciality 3:Availability");
		int choice = OopsUtility.intValue();
		switch (choice) {
		case 1:
			List<DoctorDetails> doctorList = Searching.searchByName();
			displayDoctor(doctorList);
			searchDoc(doctorList, patient);
			break;
		case 2:
			List<DoctorDetails> doctorList1 = Searching.searchBySpecialization();
			displayDoctor(doctorList1);
			searchDoc(doctorList1, patient);
			break;
		case 3:
			List<DoctorDetails> doctorList2 = Searching.searchByAvailability();
			displayDoctor(doctorList2);
			searchDoc(doctorList2, patient);
			break;
		}
	}


	
	public static void searchDoc(List<DoctorDetails> doctorList, PatientDetails patient) {
		System.out.println("Enter id");
		int id = OopsUtility.intValue();
		int flag = 1;
		try {
			for (DoctorDetails doctor : doctorList) {
		if (id == doctor.getdId()) {
		for (ApointmentDetails appointment : appointmntlist) {
				if (doctor.getDname().equals(appointment.getDoctorName())) {
					List<PatientDetails> patientAppointmentList = appointment.getApplist();
				if (patientAppointmentList.size() < 5) {
				for (PatientDetails patient2 : patientAppointmentList) {
				if (patient2.getpId() == patient.getpId()) {
					System.out.println("Appointment already set for today for this doctor cannot set again");
						flag = 0;
								break;
							} else {
								patientAppointmentList.add(patient);
							appointment.setApplist(patientAppointmentList);
								System.out.println("Appointment is set");
					flag = 0;
						break;
									}
						}
							} else {
						System.out.println(
										"Appointment is full !!! Please wait for the next schedule or Select different doctor");
								flag = 0;
							}
							break;
						}
					}
					if (flag == 1) 
					{
						ApointmentDetails appointment2 = new ApointmentDetails();
				List<PatientDetails> patientList1 = new ArrayList<PatientDetails>();
				patientList1.add(patient);
			  appointment2.setDoctorName(doctor.getDname());
				appointment2.setApplist(patientList1);
				appointmntlist.add(appointment2);
				System.out.println("Appointment is set");
				
				}
			}
			}
		} catch (Exception e) {
			System.out.println("Enter the correct id");
		}
	
	}
	
	//famous doctor
	public static void famousDoctor() throws IOException {
		String string = OopsUtility.readFile(Appointmentsfile);
		Map<String, Integer> map = new HashMap<>();
		try {
			appointmntlist = OopsUtility.userReadValue(string, ApointmentDetails.class);
			for (int i = 0; i < appointmntlist.size(); i++) {
				ApointmentDetails appointment = appointmntlist.get(i);
				String doctorName = appointment.getDoctorName();
				Integer numberOfAppointments = appointment.getApplist().size();
				map.put(doctorName, numberOfAppointments);
			}
			int maxValue = Collections.max(map.values());
			for (Entry<String, Integer> entry : map.entrySet()) {
				if (entry.getValue() == maxValue) {
					System.out.println(
							"Famous Doctor Name: " + entry.getKey() + "\nNo of appointments: " + entry.getValue());
				}
			}
		} catch (Exception e) {
			System.out.println("There are no doctors in the Hospital system.");
		}
	}

	public static void famousSpecialist() throws IOException {
		String string = OopsUtility.readFile(Doctorsfile);
		List<String> list = new ArrayList<>();
		try {
			doctorlist = OopsUtility.userReadValue(string, DoctorDetails.class);
			for (DoctorDetails doctor : doctorlist) {
				for (DoctorDetails doctor1 : doctorlist) {
					if (doctor.getdSpecification().equals(doctor1.getdSpecification())) {
						list.add(doctor.getdSpecification());
					}
				}
			}
			int max = 0;
			int curr = 0;
			String currKey = null;
			Set<String> unique = new HashSet<String>(list);
			for (String key : unique) {
				curr = Collections.frequency(list, key);
				if (max < curr) {
					max = curr;
					currKey = key;
				}
			}
			System.out.println(currKey + " is the famous specialization.");
		} catch (Exception e) {
			System.out.println("There are no doctors in the Hospital system.");
		}
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


