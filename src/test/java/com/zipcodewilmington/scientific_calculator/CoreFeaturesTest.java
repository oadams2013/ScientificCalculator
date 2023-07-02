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
}
