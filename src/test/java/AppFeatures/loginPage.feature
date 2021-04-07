Feature: Log in Page Features

Scenario: Log in page title

Given User is on home page
When  Users gets the title of the home pages and title of home page "My Store"
Then  User click SignIn button and User validate that sign in button there
Then  User land on sign in page and capture title of log in page
And   User Enter Email address "dec2020secondbatch@gmail.com" and password  "Selenium@12345"
Then  User click on Sign in button
Then  User Also Check Forgot your password link
## And   User get the title of the accountPage "My account - My Store"
##And   User click sign out button

