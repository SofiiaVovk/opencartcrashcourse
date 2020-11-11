package com.opencart.steps;

import com.opencart.datamodel.RegisterModel;
import com.opencart.navigation.Navigation;
import com.opencart.pages.ForgottenPasswordPage;
import com.opencart.pages.SuccessResetPasswordPage;
import com.opencart.repository.RegisterModelRepository;
import com.opencart.util.RandomEmailUtil;
import org.testng.Assert;

import java.io.IOException;

public class ForgottenPageBL {

    private ForgottenPasswordPage forgottenPage;
    private SuccessResetPasswordPage successResetPasswordPage;

    public ForgottenPageBL() {
        forgottenPage = new ForgottenPasswordPage();
    }

    public ForgottenPageBL changePasswordWithURL() {
        try {
            RegisterModel registerModel = RegisterModelRepository.getRegisterModel();
            inputEmail(registerModel.getEmail());
            clickOnContinueButton();
            new Navigation().navigateToUrl(RandomEmailUtil.getChangePasswordURL());
            inputNewPassword(registerModel.getPassword());
            clickOnContinueButton();
            successResetPasswordPage = new SuccessResetPasswordPage();
        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }
        return this;
    }

    private void inputNewPassword(String password) {
        forgottenPage.getNewPasswordInput().clear();
        forgottenPage.getNewPasswordInput().sendKeys(password);
        forgottenPage.getNewPasswordConfirmInput().clear();
        forgottenPage.getNewPasswordConfirmInput().sendKeys(password);
    }

    private void inputEmail(String email) {
        forgottenPage.getForgottenEmailInput().clear();
        forgottenPage.getForgottenEmailInput().sendKeys(email);
    }

    private void clickOnContinueButton() {
        forgottenPage.getContinueButton().click();
    }

    public void verifyChangePassword() {
        String expectedMessage = "Success: Your password has been successfully updated.";
        Assert.assertEquals(successResetPasswordPage.getSuccessChangePasswordLink().getText(), expectedMessage, "Incorrect page title");
    }
}
