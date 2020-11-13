package com.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AppleCinema30Page extends BasePage {

    @FindBy(id = "input-option208")
    WebElement inputText;

    @FindBy(id = "input-option209")
    WebElement inputTextArea;

    @FindBy(xpath = "//*[@id='form-upload']/input")
    WebElement uploadFileButton;

    @FindBy(xpath = "//*[@id='button-upload222']")
    WebElement uplButton;

    @FindBy(id = "input-option219")
    WebElement dateButton;

    @FindBy(id = "input-option221")
    WebElement timeButton;

    @FindBy(id = "input-option220")
    WebElement dateAndTimeButton;

    @FindBy(id = "input-quantity")
    WebElement quantityButton;

    @FindBy(id = "button-cart")
    WebElement addToCartButton;


    public WebElement getSizeRadioButton(int value) {
        return driver.findElement(By.xpath("//*[@type='radio' and @value= '" + value + "']"));
    }

    public WebElement getCheckboxButton(int value) {
        return driver.findElement(By.xpath("//*[@type='checkbox' and @value= '" + value + "']"));
    }


    public Select getColourSelectButton() {
        return new Select(driver.findElement(By.id("input-option217")));
    }

    public WebElement getInputText() {
        return inputText;
    }

    public WebElement getInputTextArea() {
        return inputTextArea;
    }

    public WebElement getUploadFileButton() {
        return uploadFileButton;
    }

    public WebElement getDateButton() {
        return dateButton;
    }

    public WebElement getTimeButton() {
        return timeButton;
    }

    public WebElement getDateAndTimeButton() {
        return dateAndTimeButton;
    }

    public WebElement getQuantityButton() {
        return quantityButton;
    }

    public WebElement getAddToCartButton() {
        return addToCartButton;
    }

    public WebElement getUplButton() {
        return uplButton;
    }


}
