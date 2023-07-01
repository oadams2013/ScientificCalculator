package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        MainApplication.run();
    }


    public static void run(){
        Integer displayNumber = 0;
        boolean play = true;

        Console.println(Console.introArt());
        Console.println(Console.calculatorWord());

        Console.println("\n" + "Num: "+ displayNumber + "");

        displayNumber += Console.getIntegerInput("Enter number");

        while (play){

            Console.println("\n" + "Num: "+ displayNumber + "");

            String operationChoice = Console.getStringInput("Enter desired math operation (ex: add, multiply, ect.)" + "\n" + "or clear to clear number");

            //Can make an array with all operational words. If operationChoice is not a contained word in the array, Error message.

            Integer enteredNumber = Console.getIntegerInput("Enter number");


            //Can make an array with all operational words. If operationChoice is not a contained word in the array, Error message.

            //50 if statements for the options.
            if (operationChoice.equalsIgnoreCase("add")) {
//                displayNumber = CoreFeatures.add(displayNumber, enteredNumber);
            }

            if (operationChoice.equalsIgnoreCase("multiply")) {
                //displayNumber = CoreFeatures.multiply(displayNumber, enteredNumber);
            }

            if (operationChoice.equalsIgnoreCase("divide")) {
                //displayNumber = CoreFeatures.divide(displayNumber, enteredNumber);
            }

            if (operationChoice.equalsIgnoreCase("subtract")) {
                //displayNumber = CoreFeatures.subtract(displayNumber, enteredNumber);
            }


            Console.println("\n" + "Num: "+ displayNumber + "");


            //Give option to exit program.
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
