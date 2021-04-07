package stepdefinition;

import com.pages.AccountPage;
import com.pages.LoginPage;
import com.qa.factory.DriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class AccountPagesSteps {
    final private LoginPage loginPage = new LoginPage(DriverFactory.getDriver()) ;
    private AccountPage accountPage ;

    @Given("user already login into the application")
    public void user_already_login_into_the_application(DataTable crdtable) {
     List<Map<String, String>> crdList = crdtable.asMaps();
     String username =    crdList.get(0).get("username");
     String password =   crdList.get(0).get("password");

     DriverFactory.getDriver().get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
     accountPage = loginPage.doLogin(username,password);
    }

    @Given("user is on account page")
    public void user_is_on_account_page() {
        String title = accountPage.getAccountPageTitle();
        System.out.println("Account page : "+title);
    }

    @Then("user gets account section")
    public void user_gets_account_section(DataTable sectionTable) {
        List<String> expectedAccountSection = sectionTable.asList();
        System.out.println("expected account section list "+expectedAccountSection);
        List<String> actualAccountSectionList = accountPage.account_SectionsList();
        System.out.println("actual account section list "+actualAccountSectionList);
        Assert.assertTrue(expectedAccountSection.contains(actualAccountSectionList));
    }

    @Then("account section should be {int}")
    public void account_section_should_be(Integer expectedSectionCount) {
        Assert.assertEquals(accountPage.getAccountSectionCount(), (int) expectedSectionCount);
    }
}
