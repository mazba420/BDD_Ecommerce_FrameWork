package stepdefinition;

import com.pages.LoginPage;
import com.qa.factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginPageSteps {

   private LoginPage loginPage = new LoginPage(DriverFactory.getDriver()) ;
   private static String titleOfLogInPage ;

    @Given("user its on log in page")
    public void user_its_on_log_in_page() {
      DriverFactory.getDriver().get("http://automationpractice.com/index.php?controller=authentication&back=my-account");

    }
    @When("users gets the title of the pages")
    public void users_gets_the_title_of_the_pages() {
        titleOfLogInPage = loginPage.getLoginPageTitle();
        System.out.println("Log in page title is ==> "+titleOfLogInPage);
    }

    @Then("page title should be {string}")
    public void page_title_should_be(String expectedTitle) {
        Assert.assertTrue(titleOfLogInPage.contains(expectedTitle));
    }


    @When("forgot password link should bd display")
    public void forgot_password_link_should_bd_display() {

      Assert.assertTrue(loginPage.isForgotPasswordLinkExist());
    }

    @When("user enter username {string}")
    public void user_enter_username(String username) {

      loginPage.enterPassword(username);
    }
    @When("user enter password {string}")
    public void user_enter_password(String password) {

       loginPage.enterPassword(password);
    }
    @When("user click on log in button")
    public void user_click_on_log_in_button() {

       loginPage.clickOnLogInButton();
    }
    @Then("user get the title of the accountPage {string}")
    public void user_get_the_title_of_the_account_page(String accountPageTitle) {

      String titleOfAccountPage =  loginPage.getLoginPageTitle();
        System.out.println("Title of account page : "+titleOfAccountPage);
        Assert.assertTrue(titleOfAccountPage.contains(accountPageTitle));
    }




}
