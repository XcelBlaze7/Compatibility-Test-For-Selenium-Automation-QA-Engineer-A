# Compatibility-Test-For-Selenium-Automation-QA-Engineer-A

Q1 - It contains the Test case sheet for Frontend and Backend Requirements.
Q2 - It contains the JabaTalks Automation Project designed using Java and Selenium.
Q3 - It contains the feedback for functional/usability/aesthetics improvement.

Q2_JabaTalks

Please find below the steps to configure and run the Question2-JabaTalks Automation Code - 

1. Import the Q2_JabaTalks Project in your IDE.
2. The required JAR files are present in the Selenium JAR files folder.
  	a. Add the JAR files in the Project_ClassPath.
4. The various drivers to launch web browser are present in the Drivers folder.
5. COnfiguration - I have configured this project through Properties file
	a. Prop.Properties file contains the configuration to execute the code - browser selection, driver location, url.
  	b. Copy the location of drivers from Drivers folder and paste it as a value for 'key=chromeDriverLocation/firefoxDriverLocation/EdgeDriverLocation'.
6. Page Object Model has been implemented in this code.
8. Input data is being read by Excel file which is located in Resources folder with ReadExcel filename.
9. TestNG library is used to run the testcases.
10. To execute the program -> run the TestCases.java from com.JabaTalks.TestCases package or the testng.xml file.
11. The Log report for the execution of code will be generated in the Reports folder.
