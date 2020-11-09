package com.cognixia.jump.coreJava.clinicProject;

import java.util.ArrayList;
import java.util.List;

public class CareWorker extends HealthCareWorker {

	private String name;
	private Patient patient;
	Patient[] patients = new Patient[12];
	
	public CareWorker() {
		super();
		name = "";
		patient = null;
	}
	
	public CareWorker(String name) {
		super();
		this.name = name;
	}
	
	public CareWorker(String name, Patient patient) {
		super();
		this.name = name;
		this.patient = patient;
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public Patient getPatient() {
		return patient;
	}

	@Override
	public void addPatient(Patient patient) {
		this.patient = patient;
	}
	
	public String isPatientSick(Patient patient) {
		if(patient.isSick() == true) {
			return "is sick";
		} else {
			return "is not sick";
		}
	}
	
	public String runTests(Patient[] patients){
		String patientInfo = "Here is a list Doctor: \n";
		if(patients == null) {
			throw new NullPointerException();
		} else {
			
			for(int i = 0; i < patients.length; i++) {
				if(patients[i].isSick()) {
					String nurseAssessment = isPatientSick(patients[i]);
					patientInfo += patients[i].getName() 
							+ " " + nurseAssessment + "\n";
				} 
				
			}
			
			return patientInfo;
		}
		
	}

	@Override
	public String toString() {
		
		return "My name is " + name + 
			   "My patients info is as follows: \n" 
				+ patient.toString() + "\n";
	}
	
	

}
