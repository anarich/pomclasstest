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
public class ShoppingCart {
    WebDriver driver;

    public ShoppingCart(WebDriver driver) {
        this.driver = driver;
    }
    
     
    /*@FindBy(xpath = "//*[@id=\"searchInputId\"]")
    private WebElement cookinput;
    
    @FindBy(xpath = "//*[@id=\"typeaheadInputContainer\"]/div/button")
    private WebElement searchBtn;*/
 
   @FindBy(xpath ="//*[@id=\"content\"]/main/article/div[5]/div[4]/div/div[3]/section/div[1]/div[1]/div/ul/li[2]/div/div/div/div/div[2]/div/a[1]/h6" ) 
    private WebElement cookware;

    @FindBy(xpath = "//*[@id=\"GlobalOptions-AddToCart\"]/button/div/p[2]")
    private WebElement addcookware;
    
    
 // @FindBy(xpath = "//*[@id=\"GlobalOptions-AddToCart\"]/button/div/p[2]")
  //  private WebElement clickbtn;
    
    

    public void ShoppingcartApplication()
            throws Exception {
        try {
            driver.get("https://www.jcpenney.com/s?searchTerm=cookware");
            //cookinput.sendKeys(text);
            //searchBtn.click();
            cookware.click();
            addcookware.click();
            //clickbtn.click();
            
            //   LoginPage login = new LoginPage(driver);

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    } 
}
