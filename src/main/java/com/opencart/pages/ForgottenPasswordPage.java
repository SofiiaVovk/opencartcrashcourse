package com.opencart.pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class ForgottenPasswordPage extends BasePage {
    @FindBy(id = "input-email")
    private WebElement forgottenEmailInput;

    @FindBy(xpath = "//*[@type='submit']")
    private WebElement continueButton;

    @FindBy(id = "input-password")
    private WebElement newPasswordInput;

    @FindBy(id = "input-confirm")
    private WebElement newPasswordConfirmInput;
}
