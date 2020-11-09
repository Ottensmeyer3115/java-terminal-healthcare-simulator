package com.cognixia.jump.coreJava.clinicProject;

import java.util.ArrayList;

public abstract class HealthCareWorker {
	
	private String name;
	private Patient patient;
	
	
	public abstract String getName();
	
	public abstract void setName(String name);
	
	public abstract Patient getPatient();
	
	public abstract void addPatient(Patient patient);
	
}
