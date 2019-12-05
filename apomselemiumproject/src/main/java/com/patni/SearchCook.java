/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.patni;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author Anant
 */
public class SearchCook {
    WebDriver driver;
    
    public SearchCook(WebDriver driver) {
        this.driver = driver;
    }

       
    @FindBy(xpath = "//*[@id=\"searchInputId\"]")
    private WebElement cookinput;
    
    @FindBy(xpath = "//*[@id=\"typeaheadInputContainer\"]/div/button")
    private WebElement searchBtn;

   
    public void searchCookware(String text)
            throws Exception {
        try {
            driver.get("https://www.jcpenney.com/");
            cookinput.sendKeys(text);
            searchBtn.click();
            
            //   LoginPage login = new LoginPage(driver);

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
