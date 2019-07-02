Feature: Login

  In order to login to the http://newtours.demoaut.com/ website
  As a user
  I have to register first and login successful with multiple test data

  Rules:
  - Only registered users can do the login
  - Test the login functionality with multiple test data with parameterization in Data Table
 

  To Do:
  - is the password field masked?
`									
 
    

  
 Scenario: Testing with multiples test data using data table - positive case
  Given user is on the login homepage
 
     When user enters below credentails and clicks sign in
      |username |password |
      |invalidUN|invalidPW|
      |validUN  |validPW  |
      |selenium |selenium |
	Then the expected behavior could be like this