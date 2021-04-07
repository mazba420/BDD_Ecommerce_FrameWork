package stepdefinition;

import com.pages.LoginPage;
import com.qa.factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginPageSteps {
    final private LoginPage loginPage = new LoginPage(DriverFactory.getDriver()) ;

    @Given("User is on home page")
    public void user_is_on_home_page() {
       DriverFactory.getDriver().get("http://automationpractice.com/index.php");
    }

    @When("Users gets the title of the home pages and title of home page {string}")
    public void users_gets_the_title_of_the_home_pages_and_title_of_home_page(String expectedHomePageTitle) {
        String actualHomePageTitle =  loginPage.getHomePageTitle();
        System.out.println("Home page title ==>"+actualHomePageTitle);
        Assert.assertEquals(actualHomePageTitle,expectedHomePageTitle);
    }

    @Then("User click SignIn button and User validate that sign in button there")
    public void user_click_sign_in_button_and_user_validate_that_sign_in_button_there() {
        loginPage.signInButtonClick();
        boolean buttOnCheck =  loginPage.signInButtonValidate();
        Assert.assertTrue(buttOnCheck);
    }

    @Then("User land on sign in page and capture title of log in page")
    public void user_land_on_sign_in_page_and_capture_title_of_log_in_page() {
       String title =  loginPage.loginPageTitle();
        System.out.println(title);
    }


    @Then("User Enter Email address {string} and password  {string}")
    public void user_enter_email_address_and_password(String userName, String password) {
        loginPage.enterUserName(userName);
        loginPage.enterPassword(password);
    }

    @Then("User click on Sign in button")
    public void user_click_on_sign_in_button() {
       loginPage.signInButtonClick();
    }

    @Then("User Also Check Forgot your password link")
    public void user_also_check_forgot_your_password_link() {
     boolean linkDisplay =  loginPage.isForgotPasswordLinkExist();
     Assert.assertTrue(linkDisplay);
    }

//    @Then("User get the title of the accountPage {string}")
//    public void user_get_the_title_of_the_account_page(String string) {
//
//    }

//    @Then("User click sign out button")
//    public void user_click_sign_out_button() {
//        loginPage.clickOnSignOutButton();
//    }




}
