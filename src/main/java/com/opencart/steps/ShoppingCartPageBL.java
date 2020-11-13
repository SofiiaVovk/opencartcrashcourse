package com.opencart.steps;


import com.opencart.datamodel.QuantityModel;
import com.opencart.pages.ShoppingCartPage;
import com.opencart.repository.QuantityModelRepository;
import org.testng.Assert;
import java.text.NumberFormat;
import java.util.Locale;

public class ShoppingCartPageBL {
    private ShoppingCartPage shoppingCartPage;

    public ShoppingCartPageBL(){
        shoppingCartPage = new ShoppingCartPage();
    }

    public ShoppingCartPageBL clickOnRemoveButton(){
        shoppingCartPage.getRemoveButton().click();
        return this;
    }

    public ShoppingCartPageBL clickOnUpdateButton(){
        shoppingCartPage.getUpdateButton().click();
        return this;
    }

    public ShoppingCartPageBL inputQuantity(){
        QuantityModel quantityModel = QuantityModelRepository.getQuantityModel();
        shoppingCartPage.getQuantityField().clear();
        shoppingCartPage.getQuantityField().sendKeys(quantityModel.getQuantity());
        return this;
    }

    public void checkIPhoneSumCorrect(){
        String quantity = shoppingCartPage.getQuantityField().getAttribute("value");
        String correctSum = String.valueOf(NumberFormat.getCurrencyInstance(new Locale("en", "US"))
                .format(Double.parseDouble(quantity)*123.20));
        Assert.assertEquals(correctSum,shoppingCartPage.getTotalSum().getText());
    }

    public void checkAppleCinema30SumCorrect(){
        String quantity = shoppingCartPage.getQuantityField().getAttribute("value");
        String correctSum = String.valueOf(NumberFormat.getCurrencyInstance(new Locale("en", "US"))
                .format(Double.parseDouble(quantity)*161.60));
        Assert.assertEquals(correctSum,shoppingCartPage.getTotalSum().getText());
    }
}
