Feature: Application Login


Background: Home Page Login
Given user is on landing page
When user log in into application with username and password


@Test
Scenario: Verify title of the page
Given homepage is navigated
Then verify the title of the page

@Test
Scenario: Verify  heading of page My Profile page
Given homepage is navigated
Then Verify the heading of My Profile page

@Test
Scenario:  Verify that My profile is selected by default in the side bar.
Given homepage is navigated
Then Verify that My profile is selected by default in the side bar

@Test
Scenario: Verify the name of my profile section
Given homepage is navigated
Then Verify the name of my profile section

@Test
Scenario: Verify the input boxes and assosciated labels in my profile section
Given homepage is navigated
Then Verify the input boxes and assosciated labels in my profile section

@Test
Scenario: Verify that Public display name is autopopulated with username in my profile section.
Given homepage is navigated
Then Verify that Public display name is autopopulated with username in my profile section

@Test
Scenario: Verify Hide my Gravatar profile checkbox and message.
Given homepage is navigated
Then Verify Hide my Gravatar profile checkbox and message

@Test
Scenario: Verify that save button is disabled when no information is updated in input boxes.
Given homepage is navigated
Then Verify that save button is disabled when no information is updated in input boxes

@Test1
Scenario: Verify that save button is enabled when information is updated in input 
boxes and functionality is working fine.
Given homepage is navigated
Then Verify that save button is enabled when information is updated in input boxes
And On clicking save button is disabled again and updated values are stored in input boxes

@Test
Scenario: Verify that there is a section with heading Profile Links.
Given homepage is navigated
Then Verify that there is a section with heading Profile Links

@Test
Scenario: Verify that Add link is present in heading Profile Links.
Given homepage is navigated
Then Verify that Add link is present in heading Profile Links

@Test
Scenario: Verify the message displayed in section Profile Links irrespective of links present or not
Given homepage is navigated
Then Verify the common message displayed


@Test
Scenario: Verify the message displayed in section Profile Links when links are  not present.
Given homepage is navigated
Then Verify the message displayed in section Profile Links when links are not present

@Test
Scenario: Verify that urls are added in profile section if user wants to add.
Given homepage is navigated
Then Verify that links are added in profile section if user wants to add

@Test
Scenario: Verify that we can view the option to add wordpress site on clicking add.
Given homepage is navigated
Then Verify that we can view the option to add wordpress site on clicking add

@Test
Scenario: Verify the message and buttons that will be displayed when we click on add wordpress site and there is no already created WordPress site
Given homepage is navigated
Then Verify the message and buttons that will be displayed when we click on add wordpress site

@Test
Scenario: Verify the help icon.
Given homepage is navigated
Then Verify the help icon


@Test
Scenario: Verify click to change photo icon and assosciated messages
Given homepage is navigated
Then Verify click to change photo icon and assosciated messages
 
 







