package home;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestNews extends CommonAPI {

    @Test
    public void test1(){

        driver.findElement(By.name("entertainment")).click();
    }
}
