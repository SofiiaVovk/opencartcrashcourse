package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends BasePage{

    @FindBy(xpath = "//*[@id='content']/div[2]/div/table/tbody/tr[4]/td[2]")
    WebElement totalSum;

    @FindBy(css = ".btn-block .form-control")
    WebElement quantityField;

    @FindBy(css = ".btn-block .btn-primary")
    WebElement updateButton;

    @FindBy(css = ".input-group .btn-danger")
    WebElement removeButton;

    @FindBy(css = "#content div:nth-child(8).btn-primary")
    WebElement checkoutButton;

    @FindBy(css = "#content.btn-default")
    WebElement continueShoppingButton;

    public WebElement getQuantityField() {
        return quantityField;
    }

    public WebElement getUpdateButton() {
        return updateButton;
    }

    public WebElement getRemoveButton() {
        return removeButton;
    }

    public WebElement getCheckoutButton() {
        return checkoutButton;
    }

    public WebElement getContinueShoppingButton() {
        return continueShoppingButton;
    }

    public WebElement getTotalSum() {
        return totalSum;
    }
}

