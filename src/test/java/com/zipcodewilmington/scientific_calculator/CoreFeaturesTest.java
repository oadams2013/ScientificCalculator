package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.CoreFeatures;
import org.junit.Assert;
import org.junit.Test;

public class CoreFeaturesTest {

    @Test
    public void addTest(){
        //Given
        double a = 5.0;
        double b = 4.0;
        double expected = 9.0;

        //When
        double actual = CoreFeatures.add(a, b);

        //Then
        Assert.assertEquals(expected, actual, 0.0);
    }
    @Test
    public void subtractTest(){
        //Given
        double a = 5.0;
        double b = 4.0;
        double expected = 1;

        //When
        double actual = CoreFeatures.subtract(a, b);

        //Then
        Assert.assertEquals(expected, actual, 0.0);
    }
    @Test
    public void multiplyTest(){
        //Given
        double a = 5.0;
        double b = 4.0;
        double expected = 20;

        //When
        double actual = CoreFeatures.multiply(a, b);

        //Then
        Assert.assertEquals(expected, actual, 0.0);
    }
    @Test
    public void divisionTest(){
        //Given
        double a = 5.0;
        double b = 2;
        double expected = 2.5;

        //When
        double actual = CoreFeatures.division(a, b);

        //Then
        Assert.assertEquals(expected, actual, 0.0);
    }
    @Test
    public void squareTest(){
        //Given
        double a = 5.0;
        double expected = 25;

        //When
        double actual = CoreFeatures.square(a);

        //Then
        Assert.assertEquals(expected, actual, 0.0);
    }
    @Test
    public void squareRootTest(){
        //Given
        double a = 25;
        double expected = 5;

        //When
        double actual = CoreFeatures.squareRoot(a);

        //Then
        Assert.assertEquals(expected, actual, 0.0);
    }
    @Test
    public void inverseTest(){
        //Given
        double a = 5.0;
        double expected = .20;

        //When
        double actual = CoreFeatures.inverse(a);

        //Then
        Assert.assertEquals(expected, actual, 0.0);
    }
    @Test
    public void exponentTest(){
        //Given
        double a = 2;
        double b = 3;
        double expected = 8;

        //When
        double actual = CoreFeatures.exponent(a, b);

        //Then
        Assert.assertEquals(expected, actual, 0.0);
    }
    @Test
    public void invertTest(){
        //Given
        double a = 5;
        double expected = -5;

        //When
        double actual = CoreFeatures.invert(a);

        //Then
        Assert.assertEquals(expected, actual, 0.0);
    }
    @Test
    public void invertTest2(){
        //Given
        double a = -20;
        double expected = 20;

        //When
        double actual = CoreFeatures.invert(a);

        //Then
        Assert.assertEquals(expected, actual, 0.0);
    }
}
