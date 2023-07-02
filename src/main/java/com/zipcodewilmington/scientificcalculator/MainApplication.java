package com.zipcodewilmington.scientificcalculator;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {

        MainApplication.run();
    }


    public static void run(){
        Double displayNumber = 0.0;

        boolean play = true;

        Console.println(Console.introArt());
        Console.println(Console.calculatorWord());

        Console.println("\n" + "Num: "+ displayNumber + "");

        displayNumber += Console.getIntegerInput("Enter number");

        String[] theCoreFeaturesArray = new String[]{"add", "multiply", "divide", "subtract"};

        while (play){

            Console.println("\n" + "Num: "+ displayNumber + "");

            String operationChoice = Console.getStringInput("\n" + "Enter desired math operation (ex: add, multiply, ect.)" + "\n" + "or clear to clear number");

            if(operationChoice.equalsIgnoreCase("options")){
                Console.println(Console.MathOptions());
                operationChoice = Console.getStringInput("Enter desired math operation" );}


            if(operationChoice.equalsIgnoreCase("clear")){
                displayNumber = 0.0;Console.println(displayNumber + "");
//                operationChoice = Console.getStringInput("Enter desired math operation" );
            }




            //Can make an array with all operational words. If operationChoice is not a contained word in the array, Error message.

            for (int i = 0; i < theCoreFeaturesArray.length; i++){

                if (theCoreFeaturesArray[i].equals(operationChoice)){

                    Integer enteredNumber = Console.getIntegerInput("Enter number");

            if (operationChoice.equalsIgnoreCase("add")) {displayNumber = CoreFeatures.add(displayNumber, enteredNumber);}


            if (operationChoice.equalsIgnoreCase("multiply")) {
                //displayNumber = CoreFeatures.multiply(displayNumber, enteredNumber);
            }

            if (operationChoice.equalsIgnoreCase("divide")) {
                //displayNumber = CoreFeatures.divide(displayNumber, enteredNumber);
            }

            if (operationChoice.equalsIgnoreCase("subtract")) {
                //displayNumber = CoreFeatures.subtract(displayNumber, enteredNumber);
            }
                }
                }

            if (operationChoice.equalsIgnoreCase("Factorial")){displayNumber = ScientificFeatures.getFactorial(displayNumber);}
            if (operationChoice.equalsIgnoreCase("Sin")){displayNumber = ScientificFeatures.getSin(displayNumber);}
            if (operationChoice.equalsIgnoreCase("Cos")){displayNumber = ScientificFeatures.getCos(displayNumber);}
            if (operationChoice.equalsIgnoreCase("Tan")){displayNumber = ScientificFeatures.getTan(displayNumber);}
            if (operationChoice.equalsIgnoreCase("ArcSin")){displayNumber = ScientificFeatures.getArcSin(displayNumber);}
            if (operationChoice.equalsIgnoreCase("ArcCos")){displayNumber = ScientificFeatures.getArcCos(displayNumber);}
            if (operationChoice.equalsIgnoreCase("ArcTan")){displayNumber = ScientificFeatures.getArcTan(displayNumber);}
            if (operationChoice.equalsIgnoreCase("invLog")){displayNumber = ScientificFeatures.invLog(displayNumber);}
            if (operationChoice.equalsIgnoreCase("radToDeg")){displayNumber = ScientificFeatures.radToDeg(displayNumber);}
            if (operationChoice.equalsIgnoreCase("log")){displayNumber = ScientificFeatures.log(displayNumber);}


            Console.println(displayNumber + "");


            String exitAnswer = Console.getStringInput("Continue calculating? Enter Y/N");

            if (!exitAnswer.equals("y") && !exitAnswer.equals("Y")) {
                play = false;
            }
        }















//        String s = Console.getStringInput("Enter a string");
//        Integer i = Console.getIntegerInput("Enter an integer");
//        Double d = Console.getDoubleInput("Enter a double.");
//
//        Console.println("The user input %s as a string", s);
//        Console.println("The user input %s as a integer", i);
//        Console.println("The user input %s as a d", d);


    }
}
