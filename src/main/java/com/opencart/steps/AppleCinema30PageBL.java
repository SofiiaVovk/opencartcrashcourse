package com.opencart.steps;

import com.opencart.datamodel.AvailableOptionsModel;
import com.opencart.datamodel.QuantityModel;
import com.opencart.pages.AppleCinema30Page;
import com.opencart.pages.ShoppingCartPage;
import com.opencart.repository.AvailableOptionsModelRepository;
import com.opencart.repository.QuantityModelRepository;
import com.opencart.util.DriverUtils;


public class AppleCinema30PageBL {
    private AppleCinema30Page appleCinema30Page;
    private ShoppingCartPage shoppingCartPage;

    public AppleCinema30PageBL(){
        appleCinema30Page = new AppleCinema30Page();
    }

    public AppleCinema30PageBL inputAvailableOptions(){
        AvailableOptionsModel availableOptionsModel =  AvailableOptionsModelRepository.getAvailableOptionsModel();
        QuantityModel quantityModel = QuantityModelRepository.getQuantityModel();
        chooseSizeRadio(6);
        chooseCheckBox(9);
        inputText(availableOptionsModel.getText());
        selectColour(4);
        inputTextArea(availableOptionsModel.getTextArea());
        uploadFile("/home/vadim/Документы/TestTask.txt");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        inputDate(availableOptionsModel.getDate());
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        inputTime(availableOptionsModel.getTime());
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        inputDateAndTime(availableOptionsModel.getDateAndTime());
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        inputQuantity(quantityModel.getQuantity());
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickOnAddToCart();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        shoppingCartPage = new ShoppingCartPage();
        return this;
    }

    private void chooseSizeRadio(int value){
        new DriverUtils().clickOnElementJS(appleCinema30Page.getSizeRadioButton(value));
    }
    private void chooseCheckBox(int value){
        new DriverUtils().clickOnElementJS(appleCinema30Page.getCheckboxButton(value));
    }
    private void inputText(String text){
        appleCinema30Page.getInputText().clear();
        appleCinema30Page.getInputText().sendKeys(text);
    }
    private void selectColour(int value){
        appleCinema30Page.getColourSelectButton().selectByValue(String.valueOf(value));
    }
    private void inputTextArea(String textArea){
        appleCinema30Page.getInputTextArea().clear();
        appleCinema30Page.getInputTextArea().sendKeys(textArea);
    }
    private void uploadFile(String filePath){
        appleCinema30Page.getUploadFileButton().sendKeys(filePath);

    }
    private void inputDate(String date){
        appleCinema30Page.getDateButton().clear();
        appleCinema30Page.getDateButton().sendKeys(date);
    }
    private void inputTime(String time){
        appleCinema30Page.getTimeButton().clear();
        appleCinema30Page.getTimeButton().sendKeys(time);
    }
    private void inputDateAndTime(String dateTime){
        appleCinema30Page.getDateAndTimeButton().clear();
        appleCinema30Page.getDateAndTimeButton().sendKeys(dateTime);
    }
    private void inputQuantity(String quantity){
        appleCinema30Page.getQuantityButton().clear();
        appleCinema30Page.getQuantityButton().sendKeys(quantity);
    }
    private void clickOnAddToCart(){
        appleCinema30Page.getAddToCartButton().click();
    }
}