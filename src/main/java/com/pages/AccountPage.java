package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class AccountPage {
   private WebDriver driver ;
   private By accountSection = By.xpath("//ul[@class='myaccount-link-list']/li");

    public AccountPage(WebDriver driver) {
        this.driver = driver;
    }


    public int getAccountSectionCount(){
      int total =  driver.findElements(accountSection).size();
        return total ;
    }


    public String getAccountPageTitle(){
        return driver.getTitle();
    }


    public List<String> account_SectionsList(){
        List<String> accountList = new ArrayList<>();

       List<WebElement>  accountHeaderList = driver.findElements(accountSection);
        for (WebElement e : accountHeaderList) {
            String text =e.getText();
            System.out.println(text);
               accountList.add(text);
        }

        return accountList ;
    }

}
