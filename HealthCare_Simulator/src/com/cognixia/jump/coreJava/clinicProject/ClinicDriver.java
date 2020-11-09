package com.cognixia.jump.coreJava.clinicProject;

import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;

public class ClinicDriver {

	public static Scanner input = new Scanner(System.in);
	
	public static Patient patient0 = new Patient("Andrew", 6.1, 200.2, "A", true);
	public static Patient patient1 = new Patient("Amanda", 10.9, 900.5, "B", true);
	public static Patient patient2 = new Patient("Andrico", 3.9, 102.2, "AB", true);
	public static Patient patient3 = new Patient("Allahondro", 5.9, 150.6, "O", true);
	
	public static Patient patient4 = new Patient("Ben", 5.9, 160.6, "A", false);
	public static Patient patient5 = new Patient("Benjy", 6.9, 170.6, "B", false);
	public static Patient patient6 = new Patient("Bernard", 7.9, 950.6, "AB", false);
	public static Patient patient7 = new Patient("Billiam", 8.9, 450.6, "O", false);
	
	public static Patient patient8 = new Patient("Carl", 3.9, 150.6, "A", false);
	public static Patient patient9 = new Patient("Cornelious", 1.9, 150.6, "B", false);
	public static Patient patient10 = new Patient("Cramper", 2.9, 150.6, "AB", false);
	public static Patient patient11= new Patient("Chrisjerald", 4.9, 150.6, "O", false);
	
	
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to the clinic program, which program would you like to run?");
		System.out.println("Alpha or Bravo");
		
		String program = input.nextLine();

		// Fred's Clinic Program
		if(program.equalsIgnoreCase("Alpha")) {
			
			alpha();
			
		}
		
		// Class Required Program
		else if(program.equalsIgnoreCase("bravo")) {
			
			bravo();
			
		}
		else {
			System.out.println("Invalid input, please choose alpha or bravo");
		}
	}
	
	
	// Fred's Clinic program
	public static void alpha() {
		List<Patient> patientList = new ArrayList<Patient>();
		patientList.add(patient0);
		patientList.add(patient1);
		patientList.add(patient2);
		patientList.add(patient3);
		
		try {
			HealthWorker healthWorker = new HealthWorker("Amy", patientList);
			System.out.println("Welcome Dr. Who, my name is " + healthWorker.getName());
			
			System.out.println("Would you like to know who is in the waiting room?");
			String response1 = input.nextLine();
			
			if(response1.equalsIgnoreCase("Yes")) {
				System.out.println("The following patients are in the waiting room: ");
				System.out.println(healthWorker.getWaitingList());
			} else {
				System.out.println("Okay that's fine");
			}
			
			System.out.println("Would you like to know how many patients are sick?");
			String response2 = input.nextLine();
			
			if(response2.equalsIgnoreCase("Yes")) {
				System.out.println("The following patients are sick: ");
				System.out.println(healthWorker.getSickList(patientList));
			} else {
				System.out.println("Okay that's fine");
			}
			
			System.out.println("Would you like for me to treat the patients?");
			String response3 = input.nextLine();
			
			if(response3.equalsIgnoreCase("Yes")) {
				System.out.println("The following patients have been treated: ");
				System.out.println(healthWorker.treatSickPatients(patientList));
			} else {
				System.out.println("Okay that's fine");
			}
			
			
		} catch(Exception e) {
			System.out.println("Exception found: " + e);
		}
		
		finally {
			input.close();
		}
	}
	
	
	// In class clinic program
	public static void bravo() {
		try {
			// Make sure all patients are not sick
			Patient[] waitingRoomPatients = new Patient[12];
			
			CareWorker healthWorker = new CareWorker("Amy");
			
			for(int i = 0; i < waitingRoomPatients.length; i++) {
				@SuppressWarnings("deprecation")
				Integer number = new Integer(i);
				String name = number.toString();
				waitingRoomPatients[i] = new Patient(name);
			}
			waitingRoomPatients[7].setSick(true);
			waitingRoomPatients[11].setSick(true);
			
			System.out.println("Welcome to the Clinic Dr WhoCares. My Name is " + healthWorker.getName());
			System.out.println("Would you like to know how many patients are in the waiting room?");
			String response1 = input.nextLine();
			if(response1.equalsIgnoreCase("Yes")) {
				System.out.println("We currently have " + waitingRoomPatients.length + " in the waiting room: ");
			} else {
				System.out.println("Okay that's fine");
			}
			
			System.out.println("Would you like me to run tests on the clinic patients?");
			String response2 = input.nextLine();
			if(response2.equalsIgnoreCase("Yes")) {
				System.out.println(healthWorker.runTests(waitingRoomPatients));
			}
			
			System.out.println("Well, it's time for my break, good luck with your patients.  Bye!!");
			
		}
		catch(Exception e) {
			System.out.println("Exception found at: " + e);
		}
		
		finally {
			input.close();
		}
	}

}
