package com.zipcodewilmington.scientific_calculator;

import org.junit.Assert;
import org.junit.Test;

public class CoreFeaturesTest {

    @Test
    public void addTest(){
        //Given
        int a = 5;
        int b = 4;
        int expected = 9;

        //When
        int actual = CoreFeatures.add(a, b);

        //Then
        Assert.assertEquals(expected, actual);
    }
}
