package com.opencart.pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class LoginPage extends BasePage {
    @FindBy(xpath = ".//*[contains(@href, 'account/forgotten')]")
    private WebElement forgottenPasswordButton;

    @FindBy(id = "input-email")
    private WebElement emailInput;

    @FindBy(id = "input-password")
    private WebElement passwordInput;

    @FindBy(xpath = ".//div[@id='content']//input[@type='submit']")
    private WebElement loginButton;
}
