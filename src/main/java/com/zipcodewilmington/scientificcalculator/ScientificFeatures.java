package com.zipcodewilmington.scientificcalculator;
import java.util.Scanner;

public class ScientificFeatures {

    public static double radToDeg(double n) {return Math.toDegrees(n);} //converts Radians to Degrees
    public static double degToRad(double n) {return Math.toRadians(n);} //converts Degrees to Radians
    public static double getSin(double n) { return Math.sin(degToRad(n));} //method for sin(x) in degrees
    public static double getCos(double n) { return Math.cos(degToRad(n));} //method for cos(x) in degrees
    public static double getTan(double n){ return Math.tan(degToRad(n));} //method for tan(x) in degrees
    public static double getArcSin(double n) { return Math.asin(n);} // inverse sin(x)
    public static double getArcCos(double n) { return Math.acos(n);} // inverse cos(x)
    public static double getArcTan(double n) { return Math.atan(n);} // inverse tan(x)
    public static double log(double n) { return Math.log(n);} //log of x
    public static double invLog(double n) { return Math.log10(n);}
    public static double getFactorial(double n) {
        double factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }








}

