package com.cognixia.jump.coreJava.clinicProject;

public class Patient {

	// Attributes
	private String name;
	private double height;
	private double weight;
	private String bloodType;
	private boolean isSick;
	// Constructor
	public Patient () {
		name = "";
		height = 0.0;
		weight = 0.0;
		bloodType = "";
		isSick = false;
	}
	
	public Patient(String name) {
		this.name = name;
		height = 0.0;
		weight = 0.0;
		bloodType = "";
		isSick = false;
	}
	
	// Constructor for Class Assignment
	public Patient(String name, boolean isSick) {
		this.name = name;
		this.isSick = isSick;
	}
	
	
	// Constructor Overloading
	public Patient (String name, double height, double weight,
			String bloodType, boolean isSick) {
		
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.bloodType = bloodType;
		this.isSick = isSick;
		
	}
	// Methods
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getBloodType() {
		return bloodType;
	}
	public void setBloodType(String bloodType) throws Exception{
		
		String message = "Invalid Blood Type";
		Exception e = new Exception(message);
		
		switch (bloodType) {
			case "O":
				this.bloodType = bloodType;
				break;
			case "A":
				this.bloodType = bloodType;
				break;
			case "B":
				this.bloodType = bloodType;
				break;
			case "AB":
				this.bloodType = bloodType;
			default:
				throw e;
		}
	}
	public boolean isSick() {
		return isSick;
	}
	public void setSick(boolean isSick) {
		this.isSick = isSick;
	}
	
	@Override
	public String toString() {
		return	  "\nName: "+ name 
				+ "\nHeight: " + height
				+ "\nWeight: " + weight 
				+ "\nBloodType: " + bloodType
				+ "\nSick: " + isSick
				+ "\n";
	}
	
}
