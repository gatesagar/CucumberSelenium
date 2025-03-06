Feature: Login to the website2	
	
	Scenario: Successful Login with Valid Credentials 2
	Given User Launch Chrome browser 
	When User click on Log out link 
	Then Page Title should be "Your store. Login" 
	And close browser 