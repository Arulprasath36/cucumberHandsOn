Feature: This feature is for login functionality

Scenario: User logs in with valid username and password
	Given User is on Login page
	And User enters the username as "arulprasath36" and password as "1234"
	And clicks on the login button
	Then user should be getting error message