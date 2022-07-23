package com.costco.costcoPages;

import configuration.common.WebTestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.costco.costcoPageElement.CostcoHomePageElements.*;
import static configuration.common.GlobalReUsableMethods.*;

public class CostcoHomePage extends WebTestBase {


    @FindBy(xpath = enterSearchProductWebElement)
    public WebElement SearchProductWebElement;
    @FindBy(xpath = searchButtonWebElement)
    public WebElement searchButton;
    @FindBy(xpath = clickOnPriceDropDownList)
    public WebElement clickOnPrice;

    @FindBy(xpath = selectPrice200_500FromDropDownListWebElement)
    public WebElement selectPrice200_500FromDropDownList;
    @FindBy(xpath = verifyBikeTextWebElement)
    public WebElement verifyBikeText;
    @FindBy(xpath = clearTextFromSearchBoxWebElement)
    public WebElement clearTextFromSearchBox;


    public void checkSearchBoXWithValidProduct(String productName) {
        enterValueOnElement(SearchProductWebElement, productName);
        clickOnElement(searchButton);
        clickOnElement(clickOnPrice);
        clickOnElement(selectPrice200_500FromDropDownList);
        verifyText(verifyBikeText,"Bike","text not found");
        clearField(clearTextFromSearchBox);
        navigateBack();
        navigateForward();
        getCurrentUrl();


    }


}
