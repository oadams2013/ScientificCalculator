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

        Console.println("Welcome to our calculator!");
        while (play){
            Console.println(displayNumber + "");

            String operationChoice = Console.getStringInput("Enter desired math operation (ex: add, multiply, ect.)" + "\n" + "or clear to clear number");

            //Can make an array with all operational words. If operationChoice is not a contained word in the array, Error message.

            Integer enteredNumber = Console.getIntegerInput("Enter number");


            //Can make an array with all operational words. If operationChoice is not a contained word in the array, Error message.
            if (operationChoice.equalsIgnoreCase("add")) {
                //displayNumber = CoreFeatures.add(displayNumber, enteredNumber);
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


            Console.println(displayNumber + "");
            //50 if statements for the options.


            //Give option to exit program.
            String exitAnswer = Console.getStringInput("Continue calculating? Enter Y/N");

            if (!exitAnswer.equals("Y") && !exitAnswer.equals("y")) {
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
