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
public class RemoveCart {
    WebDriver driver;

    public RemoveCart(WebDriver driver) {
        this.driver = driver;
    }
    
     @FindBy(xpath ="//*[@id=\"content\"]/main/article/section[1]/section/span/div/div[1]/div[9]/div/div[1]/div/div/ul/li/div/div/div[2]/div[2]/div[1]/div/div[1]/div[5]/div/div[2]/div/button" ) 
    private WebElement removeitem;

    @FindBy(xpath = "//*[@id=\"content\"]/main/article/section[1]/section/span/div/div[1]/div[9]/div/div[1]/div/div/ul/li/div/div/div[2]/div[2]/div[1]/div/div[1]/div[5]/div/div[2]/div/div/div/div/div[2]/div/button[1]")
    private WebElement yesBtn;
    
    
 // @FindBy(xpath = "//*[@id=\"GlobalOptions-AddToCart\"]/button/div/p[2]")
  //  private WebElement clickbtn;
    
    

    public void removefromCart()
            throws Exception {
        try {
            driver.get("https://www.jcpenney.com/cart");
            
            removeitem.click();
            yesBtn.click();
            //clickbtn.click();
            
            //   LoginPage login = new LoginPage(driver);

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    } 

    }

