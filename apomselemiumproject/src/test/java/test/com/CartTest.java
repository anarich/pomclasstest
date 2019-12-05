/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.com;

import com.patni.RemoveCart;
import com.patni.SearchCook;
import com.patni.ShoppingCart;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

/**
 *
 * @author Anant
 */
//Running test cases in order of method names in ascending order

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class CartTest {
    private static WebDriver driver;
    //private String baseUrl;

    public CartTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
       System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");
         driver = new ChromeDriver(); 
        
    }
        
    @Test 
    public void executeSearchCook() throws Exception {
       SearchCook search = PageFactory.initElements(driver, SearchCook.class);
        Thread.sleep(2000);
//Advisable to use explicit wait to pause the driver.
      search.searchCookware("cookware");
         Thread.sleep(2000);
    }
    
    @Test 
    public void executeShoppingCart() throws Exception {
       ShoppingCart shoppingcart = PageFactory.initElements(driver, ShoppingCart.class);
        Thread.sleep(2000);
//Advisable to use explicit wait to pause the driver.
      shoppingcart.ShoppingcartApplication();
         Thread.sleep(2000);
    }
   
    @Test 
    public void executeShopremoveCart() throws Exception {
      RemoveCart removecart = PageFactory.initElements(driver, RemoveCart.class);
        Thread.sleep(2000);
//Advisable to use explicit wait to pause the driver.
      removecart.removefromCart();
         Thread.sleep(2000);
    }
    
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
