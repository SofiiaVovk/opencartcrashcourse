package com.opencart.pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    @Getter
    @FindBy(xpath = ".//*[contains(@href, 'account/forgotten')]")
    private WebElement forgottenPasswordButton;
}
