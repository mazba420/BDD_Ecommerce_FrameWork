package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

   private WebDriver driver ;

    /**
     * By locator of Log in page==> OR = Object repo
     */
    final   private By emailId = By.id("email");
    final   private By pwd = By.id("passwd");
    final   private By signIn = By.id("SubmitLogin");
    final   private By forgotPasswordLink = By.xpath("//a[text()='Forgot your password?']");

    /**
     * Constructor of the page class
     */
   public LoginPage(WebDriver driver){
       this.driver =driver ;
    }

    /**
     * page Actions : Features (behaviour) of the page the form of method
     */

    public String getLoginPageTitle(){
       return driver.getTitle();
    }

    public boolean isForgotPasswordLinkExist(){
      return driver.findElement(forgotPasswordLink).isDisplayed();
    }


    public void enterUserName(String username){
       driver.findElement(emailId).sendKeys(username);
    }

    public void enterPassword(String password){
        driver.findElement(pwd).sendKeys(password);
    }
    public void clickOnLogInButton(){
        driver.findElement(signIn).click();
    }


}
