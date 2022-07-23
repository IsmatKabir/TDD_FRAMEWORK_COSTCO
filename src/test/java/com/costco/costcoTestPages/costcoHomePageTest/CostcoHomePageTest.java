package com.costco.costcoTestPages.costcoHomePageTest;

import com.amazon.pages.HomePage2;
import com.costco.costcoPages.CostcoHomePage;
import configuration.common.WebTestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

    public class CostcoHomePageTest extends WebTestBase {
    CostcoHomePage costcoHomePage;

    @BeforeMethod
    public void getInit() {
        costcoHomePage = PageFactory.initElements(driver, CostcoHomePage.class);
    }
    @Test
    public void verifyBikeInSearchbox() {
        costcoHomePage.checkSearchBoXWithValidProduct("Bike");
    }



}