package com.cognixia.jump.coreJava.clinicProject;

import java.util.ArrayList;
import java.util.List;

public class HealthWorker extends HealthCareWorker{

	// inherited fields
	private String name;
	private Patient patient;
	// unique fields
	private List<Patient> patients;
	
	private Exception e;

	// Constructors
	public HealthWorker () {
		super();
		name = "";
		patient = null;
		patients = new ArrayList<Patient>();
	}
	
	public HealthWorker(String name) {
		super();
		this.name = name;
		patient = null;
		patients = new ArrayList<Patient>();
	}
	
	public HealthWorker(String name, Patient patient) {
		super();
		this.name = name;
		this.patient = patient;
		patients = new ArrayList<Patient>();
	}
	
	public HealthWorker (String name, List<Patient> patients) {
		super();
		this.name = name;
		this.patients = patients;
	}

	// Methods inherited from HealthCareWorker
	
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
		patients.add(patient);
	}
	
	
	// Methods unique to HealthWorker
	public List<Patient> getWaitingList(){
		return patients;
	}

	public List<Patient> runTests(List<Patient> patients) 
			throws NullPointerException{
		
		if (patients == null) {
			throw new NullPointerException();
		} else {
			List <Patient> sickPatients = new ArrayList<Patient>();
			for(Patient patient: patients) {
				if(patient.isSick()) {
					sickPatients.add(patient);
				} 	
			}
			return sickPatients;
		}
	}
	
	public List<String> treatSickPatients (List<Patient> patients)
			throws NullPointerException{
		
		if (patients == null) {
			throw new NullPointerException();
		}
		
		patients = runTests(patients);
		List<String> patientNames = new ArrayList<String>();
		for(Patient patient: patients) {
			if(patients == null) {
				throw new NullPointerException();
			} else {
				if(patient.isSick()) {
					patient.setSick(false);
					patientNames.add(patient.getName());
				} 
			}
		}
		return patientNames;
	}
	
	public List<String> getSickList(List<Patient> patients) {
		
		List<Patient> sickPatients = runTests(patients);
		List<String> patientNames = new ArrayList<String>();
		
		for(Patient patient: sickPatients) {
			patientNames.add(patient.getName());
		}
		return patientNames;
	}

}
