package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

   private WebDriver driver ;

    /**
     * By locator of Log in page==> OR = Object repo
     */
    final private By signInButton = By.xpath("//a[normalize-space()='Sign in']");
    final   private By emailId = By.id("email");
    final   private By pwd = By.id("passwd");
    final   private By signIn = By.xpath("//span[normalize-space()='Sign in']");
    final   private By forgotPasswordLink = By.xpath("//a[text()='Forgot your password?']");
//    final   private By signOutButton = By.cssSelector("a[title='Log me out']");

    /**
     * Constructor of the page class
     */
   public LoginPage(WebDriver driver){
       this.driver =driver ;
    }

    /**
     * page Actions : Features (behaviour) of the page the form of method
     */
    public void signInButtonClick(){
        driver.findElement(signInButton).click();
    }

    public String loginPageTitle(){
        return driver.getTitle();
    }

    public boolean signInButtonValidate(){
       return  driver.findElement(signInButton).isDisplayed();
    }

    public String getHomePageTitle(){
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

//    public void clickOnSignOutButton(){
//      driver.findElement(signOutButton).click();
//    }

    public AccountPage doLogin(String un , String pw){
        System.out.println("Log in with "+un +" and "+pw);
        driver.findElement(emailId).sendKeys(un);
        driver.findElement(pwd).sendKeys(pw);
        driver.findElement(signIn).click();

        return new AccountPage(driver);
    }


}
