package home;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class TestHome extends CommonAPI {

    @Test
    public void test1() {
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iPhone", Keys.ENTER);
        driver.findElement(By.cssSelector(".nav-input")).click();


    }
}
