package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SuccessResetPasswordPage extends BasePage {

    @FindBy(xpath = ".//*[@id='account-login']/div[contains(@class, 'alert')]")
    private WebElement successChangePasswordLink;

    public WebElement getSuccessChangePasswordLink() {
        return successChangePasswordLink;
    }
}
