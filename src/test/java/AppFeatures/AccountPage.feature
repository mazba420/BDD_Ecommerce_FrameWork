Feature: Account Page Feature

Background:
Given user already login into the application
|username|password|
|dec2020secondbatch@gmail.com|Selenium@12345|


Scenario: Account page title
Given user is on account page



Scenario: Account section count
Given user is on account page
Then user gets account section
|Order history and details |
|My credit slips|
|My addresses|
|My personal information |
|My wishlists|
And account section should be 5