package com.ninjastore.automation.pages;

import com.ninjastore.automation.base.Base;
import com.ninjastore.automation.framework.Elements;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Base.driver,this);
    }


    @FindBy(id = "input-email")
    public static WebElement userName;

    @FindBy(id = "input-password")
    public static WebElement password;

    @FindBy(xpath = "//input[@value='Login']")
    public static WebElement loginBtn;

    @FindBy(css = "div[class$='alert-dismissible']")
    public static WebElement mainWarning;

    @FindBy(linkText = "Forgotten Password")
    public static WebElement forgotPasswordLink;



    public static void logIntoAccount(){
        Elements.TypeText(userName,Base.reader.getUsername());
        Elements.TypeText(password,Base.reader.getPassword());
        Elements.click(loginBtn);
    }


    public static void doLogin(String Username, String Password){
        Elements.TypeText(userName,Username);
        Elements.TypeText(password,Password);
        Elements.click(loginBtn);
    }
}
