package testingone;

import org.junit.Assert;
import org.junit.Test;

public class TestCalculator {

    @Test
    public void testAddingTwoPositiveWholeNumbers(){
        int num1 = 10;
        int num2 = 15;
        int expectedResult = 25;
        int actualResult = Calculator.add(num1,num2);
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void testAddingTwoNegativeWholeNumbers(){
        int num1 = -2;
        int num2 = -6;
        int expectedResult = -8;
        int actualResult = Calculator.add(num1,num2);
        Assert.assertEquals(expectedResult,actualResult);

    }
    }

