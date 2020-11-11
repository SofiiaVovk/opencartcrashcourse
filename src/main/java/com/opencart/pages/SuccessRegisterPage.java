package com.opencart.pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class SuccessRegisterPage extends BasePage {

    @FindBy(xpath = ".//*[@id='content']/h1")
    private WebElement successTitle;
}
