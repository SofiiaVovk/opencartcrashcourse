package com.opencart.pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class SuccessResetPasswordPage extends BasePage {

    @FindBy(xpath = ".//*[@id='account-login']/div[contains(@class, 'alert')]")
    private WebElement successAlert;
}
