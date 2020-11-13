package com.opencart.steps;


import com.opencart.pages.FeaturedPage;

public class FeaturedPageBL {
    private FeaturedPage featuredPage;

    public FeaturedPageBL(){
        featuredPage = new FeaturedPage();
    }

    public FeaturedPageBL clickOnMacBookCartButton(){
        featuredPage.getMacBookCartButton().click();
        return this;
    }
    public FeaturedPageBL clickOnIPhoneCartButton(){
        featuredPage.getIPhoneCartButton().click();
        return this;
    }

    public AppleCinema30PageBL clickOnAppleCinema30CartButton(){
        featuredPage.getAppleCinema30CartButton().click();
        return new AppleCinema30PageBL();
    }
}