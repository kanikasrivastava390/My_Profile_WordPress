Feature: Application Login 

	/*This scenario is a background scenario that will run before all other scenarios*/
Background: Home Page Login 
	Given user is on landing page 
	Then user log in into application with username and password 
	
Scenario: Verify title of the page 
	When homepage is navigated 
	Then verify the title of the page 
	And Verify the heading of My Profile page 
	And Verify that My profile is selected by default in the side bar 
	And Verify the name of my profile section 
	And Verify the input boxes and assosciated labels in my profile section 
	
Scenario: Verify that Public display name is autopopulated with username in my 
	profile section. 
	When homepage is navigated 
	Then Verify that Public display name is autopopulated with username in my profile section 
	
Scenario: Verify Hide my Gravatar profile checkbox and message. 
	When homepage is navigated 
	Then Verify Hide my Gravatar profile checkbox and message 
	
Scenario: Verify that save button is disabled when no information is updated in input boxes. 
	When homepage is navigated 
	Then Verify that save button is disabled when no information is updated in input boxes 
	
Scenario: Verify that save button is enabled when information is updated in input boxes and functionality is working fine.
	When homepage is navigated 
	Then Verify that save button is enabled when information is updated in input boxes 
	And On clicking save button is disabled again and updated values are stored in input boxes 
	
Scenario: Verify that there is a section with heading Profile Links. 
	When homepage is navigated 
	Then Verify that there is a section with heading Profile Links 
	
Scenario: Verify that Add link is present in heading Profile Links. 
	When homepage is navigated 
	Then Verify that Add link is present in heading Profile Links 
	
Scenario: Verify the message displayed in section Profile Links irrespective of links present or not 
	When homepage is navigated 
	Then Verify the common message displayed 
	
Scenario: Verify the message displayed in section Profile Links when links are  not present. 
	When homepage is navigated 
	Then Verify the message displayed in section Profile Links when links are not present 
	
Scenario: Verify that urls are added in profile section if user wants to add. 
	When homepage is navigated 
	Then Verify that links are added in profile section if user wants to add 
	
Scenario: Verify that we can view the option to add wordpress site on clicking add. 
	When homepage is navigated 
	Then Verify that we can view the option to add wordpress site on clicking add 
	
Scenario: Verify the message and buttons that will be displayed when we click on add 
	wordpress site and there is no already created WordPress site 
	When homepage is navigated 
	Then Verify the message and buttons that will be displayed when we click on add wordpress site 
	And Verify the functionality of Cancel button 
	And Verify the functionality of Create button 
	
Scenario: Verify the help icon. 
	When homepage is navigated 
	Then Verify the help icon 
	
Scenario: Verify click to change photo icon and assosciated messages 
	Given homepage is navigated 
	Then Verify click to change photo icon and assosciated messages 
