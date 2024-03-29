Assessment #4
Submission deadline: 9th January 2023 5:00pm MYT via Moodle

Instruction
Below are the coding tasks that you need to complete individually for assessment 4. You should download the IntelliJ project folder as below and unzip it. Then work on the tasks in the project folder.

File
Assessment4.zip
This assessment consists of two parts; Part A which is worth 40% and Part B which is worth 60% . It contains 100 marks in total (which will be converted to 90% to account for readability and development) and has two components.

Part A: Task correctness weighted 40 marks.

Task 1 has 9 marks

Task 2 has 6 marks

Task 3 has 20 marks

Task 4 has 5 marks

Part B: Task correctness weighted 60 marks.

Task 1 has 7 marks

Task 2 has 7 marks

Task 3 has 6 marks

Task 4 has 6 marks

Task 5 has  5 marks

Task 6 has 7 marks

Task 7 has  7 marks

Task 8 has 5 marks

Task 9 has 10 marks

Code readability & documentation has 5 marks.

Code development has 5 marks.

Academic Integrity
Please be reminded of the academic integrity mentioned in Week 01. You should code alone and ask the unit staff for help. Do not post your code in public forums.

Scenario
A TOUR COMPANY WOULD LIKE TO CREATE AN APP TO MANAGE THEIR CUSTOMER'S TOUR IN AUSTRALIA & MALAYSIA. 

YOU ARE REQUIRED TO DESIGN A JAVA CLASS FOR THE APP BASED ON THE SPECIFICATIONS BELOW

************************* PART A ******************************
Task 1 (W8 - 9 marks)
Code the class shell, instance variables and default constructor (ctor) for a vehicle for the customers to choose on their trip. The class should be called Vehicle . A Vehicle instance has the following attributes: 

regoNumber: length of 6 characters (you can assume all rego numbers are exactly 6 characters in length). eg. "1SX6JD" or "WWW345". 

mileage: distance that a vehicle can travel (eg. 400.0 km for a SUV). Maximum will be 900.00 km.

VehicleType: Can be only one of four categories of vehicle which are Sedan, SUV, Van and Minibus. Customer can only choose one of them for their trip.

 The default constructor must utilise appropriate naming conventions, initialised with sensible values and they protect the integrity of the class's instance variables.

Task 2 (W8 - 6 marks)
Code the getter/accessor methods for all the instance variables in task 1.

Task 3 (W8 - 20 marks)
Code the setter/mutator methods for all the instance variables in task 1 and at least one of the methods should return a boolean to indicate the success or failure of the mutation. The code must protect the integrity of the class's instance variables as required and utilise appropriate naming conventions.

Task 4 (W8 - 5 marks)
Code a toString method for the class that outputs as below.


************************* PART B ******************************
Task 1 (W8 - 7 marks)
Code the class shell and instance variables for trip. The class should be called Trip . A Trip instance has the following attributes: 

tripName: length of 1 to 20 characters.

aVehicle: an existing vehicle instance selected for the trip.

currentDate: current date and time

destinationList: a list of planned destinations of the trip stored in ArrayList.

Task 2 (W8 - 7 marks)
Code a non default two-parameter constructor with parameters for tripName  and aVehicle. Instance variables that are not taking parameters must be auto-initialised with sensible default value or object. The constructor must utilise appropriate naming conventions and they protect the integrity of the class's instance variables.

Task 3 (W8 - 6 marks)
Code the getter/accessor methods for the tripName, currentDate and aVehicle instance variables in Part B task 1.

Task 4 (W8 - 6 marks)
Code the setter/mutator methods for the tripName instance variable in  Part B task 1. The code must protect the integrity of the class's instance variable as required and utilise appropriate naming conventions.

Task 5 (W9 - 5 marks)
Code a method called addVehicle that takes a vehicle class instance as parameter. The method should check if the vehicle class instance exist before adding into the aVehicle instance variable and utilise appropriate naming conventions.

Task 6 (W9 - 7 marks)
Code a method called addDestinationByIndex that takes two parameters; destinationLocation as a String and index position as an integer. The code should check if the destinationLocation exist as an argument. If yes, it should add accordingly by the user in the destination list (max 20 destinations can be stored in the ArrayList) and utilise appropriate naming conventions.

eg. a user set Geelong and Mornington Peninsula as destinations. Later on they would like to visit Venus Bay before Mornington Peninsula. Hence, the destination list will become Geelong followed by Venus Bay and Mornington Peninsula in the destination list.

Task 7 (W9 - 7 marks)
Code a method called removeDestinationByIndex that takes a parameter; destinationLocation index as an integer. The code should check if the destinationLocation exists within the Arraylist. If yes, it should be removed accordingly and utilise appropriate naming conventions.

eg. a user set Geelong, Venus Bay and Mornington Peninsula as destinations. Later on they would like to skip Venus Bay to cut short the trip. Hence, the destination list will become Geelong followed by Mornington Peninsula in the destination list.

Task 8 (W8 - 5 marks)
Code a toString method for the class that output as below. The code should utilise appropriate existing methods in the class.


Task 9 (W9 - 10 marks)
Code the main method in a TripDriver class as follows:

Instantiate a Vehicle class instance

Assign information for the vehicle type, rego number and mileage using the Class setter methods.

Instantiate a Trip class instance.

Add three different destination information into the destination list using the appropriate method.

Print the Trip class information to the screen.

Remove one destination from the destination list using appropriate method.

Print the revised Trip class information to the screen.

Code Readability (5 marks)
Overall code submission must be well organised and very easy to follow included but not limited to code indentation, code consistency, effective use of whitespace etc. 

Code Development & Documentation (5 marks)
Overall code submission demonstrates correct method shell, syntax usage and meaningful naming conventions. Code documentations/inline comments are thorough and in detail.

Submission Instruction
Please submit your IntelliJ project folder as a .zip file and submit to via Moodle as below. If you are not sure how to zip your project, please refer to the video here.
