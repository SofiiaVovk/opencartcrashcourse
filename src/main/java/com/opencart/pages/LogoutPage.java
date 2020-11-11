package com.opencart.pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutPage extends BasePage{
    @Getter
    @FindBy(xpath = ".//*[@id='content']/div/div/a")
    private WebElement logoutButton;

}
