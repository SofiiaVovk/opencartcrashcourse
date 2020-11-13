package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FeaturedPage extends BasePage {

    @FindBy(xpath = ".//*[contains(@href,'product_id=43')]")
    WebElement macBookButton;
    @FindBy(xpath = "//*[@id='content']/div[2]/div[1]/div/div[3]/button[1]")
    WebElement macBookCartButton;

    @FindBy(xpath = ".//*[@id='content']/div[2]/div[2]/div/div[3]/button[1]")
    WebElement iPhoneCartButton;

    @FindBy(xpath = "//*[@id='content']/div[2]/div[3]/div/div[3]/button[1]")
    WebElement appleCinema30CartButton;


    public WebElement getAppleCinema30CartButton() {
        return appleCinema30CartButton;
    }

    public WebElement getIPhoneCartButton() {
        return iPhoneCartButton;
    }

    public WebElement getMacBookButton() {
        return macBookButton;
    }

    public WebElement getMacBookCartButton() {
        return macBookCartButton;
    }
}