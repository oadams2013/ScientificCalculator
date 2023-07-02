package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.CoreFeatures;
import com.zipcodewilmington.scientificcalculator.ScientificFeatures;
import org.junit.Assert;
import org.junit.Test;

public class ScientificFeaturesTest {
    @Test
    public void getSinTest(){
        double a = 20;
        double expected =0.3420201433256687 ;

        //When
        double actual = ScientificFeatures.getSin(a);

        //Then
        Assert.assertEquals(expected, actual, 0.01);
    }
    @Test
    public void getCosTest(){
        double a = 20;
        double expected =0.939692620 ;

        //When
        double actual = ScientificFeatures.getCos(a);

        //Then
        Assert.assertEquals(expected, actual, 0.01);
    }
    @Test
    public void getTanTest(){
        double a = 20;
        double expected =0.363970234 ;

        //When
        double actual = ScientificFeatures.getTan(a);

        //Then
        Assert.assertEquals(expected, actual, 0.01);
    }
    @Test
    public void getArcSinTest(){
        double a = .5;
        double expected = .523599;

        //When
        double actual = ScientificFeatures.getArcSin(a);

        //Then
        Assert.assertEquals(expected, actual, 0.01);
    }
    @Test
    public void getArcCosTest(){
        double a = .5;
        double expected =1.047198 ;

        //When
        double actual = ScientificFeatures.getArcCos(a);

        //Then
        Assert.assertEquals(expected, actual, 0.01);
    }
    @Test
    public void getArcTanTest(){
        double a = .5;
        double expected =0.463648 ;

        //When
        double actual = ScientificFeatures.getArcTan(a);

        //Then
        Assert.assertEquals(expected, actual, 0.01);
    }
    @Test
    public void logTest(){
        double a = 6;
        double expected =1.7917594692281 ;

        //When
        double actual = ScientificFeatures.log(a);

        //Then
        Assert.assertEquals(expected, actual, 0.01);
    }
    @Test
    public void invLogTest(){
        double a = 3;
        double expected =.47712125472 ;

        //When
        double actual = ScientificFeatures.invLog(a);

        //Then
        Assert.assertEquals(expected, actual, 0.01);
    }
    @Test
    public void getFactorialTest(){
        double a = 5;
        double expected =120 ;

        //When
        double actual = ScientificFeatures.getFactorial(a);

        //Then
        Assert.assertEquals(expected, actual, 0.01);
    }
    @Test
    public void radToDegTest(){
        double a = 5;
        double expected =286.479 ;

        //When
        double actual = ScientificFeatures.radToDeg(a);

        //Then
        Assert.assertEquals(expected, actual, 0.01);
    }
    @Test
    public void degToRadTest(){
        double a = 45;
        double expected =0.785398 ;

        //When
        double actual = ScientificFeatures.degToRad(a);

        //Then
        Assert.assertEquals(expected, actual, 0.01);
    }





}
