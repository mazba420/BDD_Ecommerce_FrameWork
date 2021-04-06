Feature: Log in Page Features

Scenario: Log in page title

Given user its on log in page
When users gets the title of the pages
Then page title should be "Login - My Store"


Scenario: Forgot password link

Given user is on log in page
Then forgot password link should bd display


Scenario: Login with correct credentials

Given user on log in page
When user enter username "dec2020secondbatch@gmail.com"
And user enter password "Selenium@12345"
And user click on log in button
Then user get the title of the log in page "My account - My Store"
And page title should be