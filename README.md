# java-terminal-healthcare-simulator
Object Oriented Solution that implements a simple Health Clinic. Creates an application to help a new local Doctor.  The Doctor represents the user and the HealthCareWorker represents the simululor.  The Doctors job in this simulator is to get the status of a list or Array of patients and then treat them.

# Design 

Clinic Driver
- This class handles the orchestration and flow of the application.  It also contains the main method.  It runs through the terminal window at which point the user is prompted through the following a list of steps provided below.  
- This class provides two different implementations for running through the clinic through two static methods called alpha() and bravo().
 1) User is welcomed to the clinic program.  They are asked which program they would like to run.  Alpha or Bravo.  If they type "Alpha", they go onto step 2.  If they type "Bravo", they move onto step 8.  If they type something other than "Alpha" or "Bravo", they are reprompted to type "Alpha" or "Bravo" correctly.
 2) User is then welcomed as Dr. Who by a Healthcare worker named Amy. User is then asked if they would like a list of all the names of the patients in the waiting room.  If they type "Yes", they go onto step 3, if they type no, they move onto step 4.
 3) Healthcare worker responds with "okay that's fine" and they move onto step 4.
 4) User is then prompted if they would like to know how many patients are sick.  If they type "Yes", they are presented with the names of the patients that are sick and move onto step 6.  If they type "No", they move onto step 5.
 5) Healthcare worker responds with "okay that's fine" and they move onto step 6.
 6) User is then prompted if they would like the Healthcare worker to treat the patients.  If they type "Yes", the Healthcare worker treats the sick patients and presents the user with a list of the patients they have treated.  If they type "No" the Healthcare worker does nothing except tell the user "Okay, that's fine".  
 7) The program exits
 8) User is welcomed as Dr WhoCares by a Healthcare worker named Amy.  User is then asked if they would like to know how many patients are in the waiting room.  If they type "Yes", they move onto step 9.  If they type "No" they move onto step 10.
 9) User is presented with a number of the total patients in the waiting room. Then move onto step 10.
 10) User is asked if they would like the Healthcare worker to run tests on the patients.  If the user types "Yes", they are presented with a list of patients that are currently sick or not sick.  Then move onto step 11.
 11) Healthcare worker tells user that it's time for her break.  At which point she leaves the doctor to treat the patients and the program ends.
