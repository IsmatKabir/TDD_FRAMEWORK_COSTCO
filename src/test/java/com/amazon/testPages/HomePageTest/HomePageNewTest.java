package com.amazon.testPages.HomePageTest;

import com.amazon.pages.HomePageNew;
import configuration.common.WebTestBase;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import static configuration.common.GlobalReUsableMethods.verifyText;

public class HomePageNewTest extends WebTestBase {

    @Test
    public void verifySearchValidProduct(){
        HomePageNew homePageNew=new HomePageNew();
        homePageNew.searchValidProduct("Hand Sanitizer");
        verifyText(homePageNew.verifySearchedProduct,"\"Hand Sanitizer\"","Product name does not match");
    }


    @Test
    public void verifyPurellAdvancedHandSanitizer() throws InterruptedException {
        HomePageNew homePageNew=new HomePageNew();
        homePageNew.searchValidProduct("Hand Sanitizer");
        verifyText(homePageNew.verifySearchedProduct,"\"Hand Sanitizer\"","Product name does not match");
        homePageNew.selectPurellAdvancedHandSanitizer();



    }





}
