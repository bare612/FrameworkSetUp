package common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class CommonAPI {

    public WebDriver driver = null;


    @Parameters({"url"})
    @BeforeMethod
    public void setUp(String url) {
        System.setProperty("webdriver.chrome.driver", "/Users/abdibare/Documents/intelliJ2019/seleniumproject1/browserdriver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        /*driver.get("http://www.amazon.com");*/
        driver.get(url);
    }

    @AfterMethod
    public void cleanup() {
        driver.close();
    }

    public void clickOnElement(String locator) {
    try {
        driver.findElement(By.cssSelector(locator)).click();
    }catch (Exception ex) {
    try {
        driver.findElement(By.className(locator)).click();
    }catch(Exception ex2) {
    try {
        driver.findElement(By.id(locator)).click();

    }catch(Exception ex3) {
    try {
        driver.findElement(By.xpath(locator)).click();

    }catch(Exception ex4) {

    }

    }
    }
    }
    }

    }