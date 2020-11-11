package com.opencart.pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class SuccessLoginPage extends BasePage{

    @FindBy(xpath = ".//*[@id='content']/h2[contains(text(),'My Account')]")
    private WebElement myAccountTitle;
}
