package com.opencart.steps;

import com.opencart.datamodel.LoginModel;
import com.opencart.pages.LoginPage;
import com.opencart.repository.LoginModelRepository;

public class LoginPageBL {

    private LoginPage loginPage;

    public LoginPageBL() {
        loginPage = new LoginPage();
    }

    public LoginPageBL loginUser() {
        LoginModel loginModel = LoginModelRepository.getLoginModel();
        return this;
    }

    public ForgottenPageBL clickOnForgottenPassword() {
        loginPage.getForgottenPasswordButton().click();
        return new ForgottenPageBL();
    }
}
