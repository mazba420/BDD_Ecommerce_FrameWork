package testrunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/AppFeatures/AccountPage.feature"} ,
        glue = {"stepdefinition","apphooks"},
        plugin = {"pretty","json:target/cucumber-reports/cucumber.json", "html:target/cucumber-reports/index.html",
                "pretty:target/cucumber-reports/cucumber-pretty.txt","usage:target/cucumber-reports/cucumber-usage.json",
                "junit:target/cucumber-reports/cucumber-results.xml"
        }

)

public class AccountPageRunner {
}
