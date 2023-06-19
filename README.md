# SeleniumAssignmentOnMessengerFB
In this assignment , I have done automation testing using Selenium on #messenger.com & facebook.com. The operations done are:

User creation
Validating and Verifying
Creating multiple users
Update User Details
Delete user details
Valid or Invalid user credentials using Data Provider
Assertions
Allure results

*Steps:
Create a maven project
Add dependencies to pom.xml file
Build the project
Create json files in src/main/resources for LoginData and ValidData
Create a java class in src/main/java/pages as Homepage which has all the neccessary locators and functions
Create multiple java classes in src/test/java and name them accordingly
Write required testcases for each class
Run each java class to do the specific operation on facebook.com
One can change the testcases and userLoginCredentials by changing it in their specific java classes

*Steps for Allure report
Download allure in your system and add it to the system environment
Create testng.xml in .idea
After completely running the above project, run the below maven commands
mvn clean
mvn test
After successfully running mvn test allure-report folder should be created
Go to the source project folder in file explorer
open command prompt by typing cmd in the windows search
type command: allure serve
This opens the allure report of the project

In this project, all the operations, assertions and allure report is present
