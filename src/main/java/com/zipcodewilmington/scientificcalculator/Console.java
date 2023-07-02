package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class Console {

    public static void print(String output, Object... args) {
        System.out.printf(output, args);
    }

    public static void println(String output, Object... args) {
        print(output + "\n", args);
    }

    public static String getStringInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        return scanner.nextLine();
    }

    public static Integer getIntegerInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);

        Integer userInput = scanner.nextInt();
        return userInput;

    }

    public static Double getDoubleInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);


        Double userInput = scanner.nextDouble();
        return userInput;

    }

    public static String MathOptions(){
        return "Add, Subtract, Multiply, Divide, Clear, Sq, SqRt" + "\n" +
            "factorial, log, Sin, Cos, Tan, invLog, ArcTan" + "\n" +
                "ArcSin, DegtoRad, RadtoDeg, ArcCos, Options";
    }

    public static String introArt(){
        return "|  _________________  |" + "\n" +
                "| | JO           0. | |"+ "\n" +
                "| |_________________| |"+ "\n" +
                "|  ___ ___ ___   ___  |"+ "\n" +
                "| | 7 | 8 | 9 | | + | |"+ "\n" +
                "| |___|___|___| |___| |"+ "\n" +
                "| | 4 | 5 | 6 | | - | |"+ "\n" +
                "| |___|___|___| |___| |"+ "\n" +
                "| | 1 | 2 | 3 | | x | |"+ "\n" +
                "| |___|___|___| |___| |"+ "\n" +
                "| | . | 0 | = | | / | |"+ "\n" +
                "| |___|___|___| |___| |"+ "\n" +
                "|_____________________|";
    }

    public static String calculatorWord(){
        return "|     CALCULATOR      |" + "\n" +
                "|_____________________|";
    }


}

