package com.opencart.steps;

import com.opencart.pages.LogoutPage;

public class LogoutPageBL {

    private LogoutPage logoutPage;

    public LogoutPageBL() {
        logoutPage = new LogoutPage();
    }

    public MainPageBL clickContinue() {
        logoutPage.getLogoutButton().click();
        return new MainPageBL();
    }
}
