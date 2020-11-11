package com.opencart.steps;

public class MainPageBL {

    public HeaderPageBL getHeaderPageBL() {
        return new HeaderPageBL();
    }

    public void verifyLogout(MainPageBL mainPageBL) {
        mainPageBL.getHeaderPageBL()
                .clickOnMyAccountButton()
                .checkLoginButton();
    }
}
