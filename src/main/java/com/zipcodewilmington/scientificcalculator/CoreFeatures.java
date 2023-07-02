package com.zipcodewilmington.scientificcalculator;

public class CoreFeatures {

    public static double add(double i, double x) {
        return i + x;
    }

    public static double subtract(double i, double x) {
        return i - x;
    }

    public static double multiply(double i, double x) {
        return i * x;

    }

    public static double division(double i, double x) {
        return i / x;
    }

    public static double square(double i) {
        return i * i;
    }

    public static double squareRoot(double i) {
        return Math.sqrt(i);
    }

    public static double inverse(double x) {
        return 1 / x;
    }

    public static double exponent(double i, double x) {
        return Math.pow(i, x);
    }

    public static double invert(double i){
        if ( i > 0){
            return -i;
        } else {
            return i * -1;
        }
    }
}

