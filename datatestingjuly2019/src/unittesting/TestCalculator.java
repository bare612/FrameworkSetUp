package unittesting;

import org.testng.Assert;

public class TestCalculator {

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.addition(100, 200);
        int addResult = cal.addition(100,200);
        Assert.assertEquals(300, addResult);

        int subResult = cal.subtraction(500,400);
        Assert.assertEquals(subResult, 100);

    }
}
