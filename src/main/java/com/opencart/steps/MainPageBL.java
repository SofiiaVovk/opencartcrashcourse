package com.opencart.steps;

public class MainPageBL {

    public HeaderPageBL getHeaderPageBL() {
        return new HeaderPageBL();
    }

    public void verifyLogout() {
        getHeaderPageBL()
                .clickOnMyAccountButton()
                .checkLoginButton();
    }

    public LoginPageBL verifyLoginWithNewPassword() {
        getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnLoginButton()
                .loginUser()
                .verifyUserLogin();
        return new LoginPageBL();
    }
}
