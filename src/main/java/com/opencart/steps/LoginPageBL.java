package com.opencart.steps;

import com.opencart.pages.LoginPage;
import com.opencart.pages.SuccessLoginPage;
import com.opencart.util.RandomEmailUtil;
import org.testng.Assert;

public class LoginPageBL {

    private LoginPage loginPage;
    SuccessLoginPage successLoginPage;

    public LoginPageBL() {
        loginPage = new LoginPage();
    }

    public LoginPageBL loginUser() {
        inputEmail(RandomEmailUtil.email);
        inputPassword(ForgottenPageBL.newPassword);
        clickOnLoginButton();

        successLoginPage = new SuccessLoginPage();
        return this;
    }

    public ForgottenPageBL clickOnForgottenPassword() {
        loginPage.getForgottenPasswordButton().click();
        return new ForgottenPageBL();
    }

    private void inputEmail(String email) {
        loginPage.getEmailInput().clear();
        loginPage.getEmailInput().sendKeys(email);
    }

    private void inputPassword(String password) {
        loginPage.getPasswordInput().clear();
        loginPage.getPasswordInput().sendKeys(password);
    }

    private void clickOnLoginButton() {
        loginPage.getLoginButton().click();
    }

    public void verifyUserLogin() {
        String expectedMessage = "My Account";
        Assert.assertEquals(successLoginPage.getMyAccountTitle().getText(), expectedMessage, "Incorrect page title");
    }
}
