package com.bridgelabz.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.oopsprograms.CliniqueManagmnt;

public class Searching
{
	public static List<DoctorDetails> searchByName() throws IOException {
		String string = OopsUtility.readFile(CliniqueManagmnt.Doctorsfile);
		try {
			CliniqueManagmnt.doctorlist = OopsUtility.userReadValue(string, DoctorDetails.class);
			List<DoctorDetails> list = new ArrayList<>();
			System.out.println("Enter the doctor's name to be searched");
			String name = OopsUtility.stringValue();
			System.out.println(name);
			for ( DoctorDetails doctor : CliniqueManagmnt.doctorlist) {
				if (name.equals(doctor.getDname())) {
					list.add(doctor);
				}
			}
			return list;
		} catch (Exception e) {
			System.out.println("File is empty!");
			return null;
		}

	}


	public static List<DoctorDetails> searchByID() throws IOException {

		String string = OopsUtility.readFile(CliniqueManagmnt.Doctorsfile);
		try {
			CliniqueManagmnt.doctorlist = OopsUtility.userReadValue(string, DoctorDetails.class);
			List<DoctorDetails> list = new ArrayList<>();
			System.out.println("Enter the doctor's ID to be searched");
			long id = OopsUtility.longValue();
			System.out.println();
			for ( DoctorDetails doctor : CliniqueManagmnt.doctorlist) {
				if (id==(doctor.getdId())) {
					list.add(doctor);
				}
			}
			return list;
		} catch (Exception e) {
			System.out.println("File is empty!");
			return null;
		}
	}





	public static List<DoctorDetails> searchByAvailability() throws IOException {

		String string = OopsUtility.readFile(CliniqueManagmnt.Doctorsfile);
		try {
			CliniqueManagmnt.doctorlist = OopsUtility.userReadValue(string, DoctorDetails.class);
			List<DoctorDetails> list = new ArrayList<>();
			System.out.println("Enter when you Want to visit the Doctor(Am/Pm)");
			String available = OopsUtility.stringValue();
			System.out.println();
			for ( DoctorDetails doctor : CliniqueManagmnt.doctorlist) {
				if (available.equals(doctor.getdAvailablty())) {
					list.add(doctor);
				}
			}
			return list;
		} catch (Exception e) {
			System.out.println("File is empty!");
			return null;
		}

	}


	public static List<DoctorDetails> searchBySpecialization() throws IOException {

		String string = OopsUtility.readFile(CliniqueManagmnt.Doctorsfile);
		try {
			CliniqueManagmnt.doctorlist = OopsUtility.userReadValue(string, DoctorDetails.class);
			List<DoctorDetails> list = new ArrayList<>();
			System.out.println("Enter the specialization");
			String specializtn = OopsUtility.stringValue();
			System.out.println();
			for ( DoctorDetails doctor : CliniqueManagmnt.doctorlist) {
				if (specializtn.equals(doctor.getdSpecification())) {
					list.add(doctor);
				}
			}
			return list;
		} catch (Exception e) {
			System.out.println("File is empty!");
			return null;
		}

	}
	/////////////////////////////////////////////////////////////


	//searching patient
	public static List<PatientDetails> searchByPID() throws IOException {

		String string = OopsUtility.readFile(CliniqueManagmnt.patientsfile);
		try {
			CliniqueManagmnt.patientlist = OopsUtility.userReadValue(string, PatientDetails.class);
			List<PatientDetails> list = new ArrayList<>();
			System.out.println("Enter the patient's ID to be searched");
			long id = OopsUtility.longValue();
			System.out.println();
			for ( PatientDetails  patientid: CliniqueManagmnt.patientlist) {
				if (id==(patientid.getpId())) {
					list.add(patientid);
				}
			}
			return list;
		} catch (Exception e) {
			System.out.println("File is empty!");
			return null;
		}

	}


	public static List<PatientDetails> searchByPnum() throws IOException {

		String string = OopsUtility.readFile(CliniqueManagmnt.patientsfile);
		try {
			CliniqueManagmnt.patientlist = OopsUtility.userReadValue(string, PatientDetails.class);
			List<PatientDetails> list = new ArrayList<>();
			System.out.println("Enter the patient's number to be searched");
			long num = OopsUtility.longValue();
			System.out.println();
			for ( PatientDetails  patientnum: CliniqueManagmnt.patientlist) {
				if (num==(patientnum.getpId())) {
					list.add(patientnum);
				}
			}
			return list;
		} catch (Exception e) {
			System.out.println("File is empty!");
			return null;
		}
	}











}



























