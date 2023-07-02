package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {

        MainApplication.run();
    }


    public static void run() {
        Double displayNumber = 0.0;

        boolean play = true;

        Console.println(Console.introArt());
        Console.println(Console.calculatorWord());

        Console.println("\n" + "Num: " + displayNumber + "");

        displayNumber += Console.getIntegerInput("Enter number");

        String[] theCoreFeaturesArray = new String[]{"add", "multiply", "divide", "subtract", "exponent"};


        while (play) {

            Console.println("\n" + "Num: " + displayNumber + "");

            String operationChoice = Console.getStringInput("\n" + "Enter desired operation (ex: add)" + "\n" + "Or enter 'options' for list of operations.");

            if (operationChoice.equalsIgnoreCase("bee")) {
                Bee.main();
            }

            if (operationChoice.equalsIgnoreCase("options")) {
                Console.println(Console.MathOptions());
                operationChoice = Console.getStringInput("Enter desired math operation");
            }


            if (operationChoice.equalsIgnoreCase("clear")) {
                displayNumber = 0.0;
                Console.println(displayNumber + "");

            }

            for (int i = 0; i < theCoreFeaturesArray.length; i++) {

                if (theCoreFeaturesArray[i].equals(operationChoice)) {

                    Integer enteredNumber = Console.getIntegerInput("Enter number");

                    if (operationChoice.equalsIgnoreCase("add")) {
                        displayNumber = CoreFeatures.add(displayNumber, enteredNumber);
                    }


                    if (operationChoice.equalsIgnoreCase("multiply")) {
                        displayNumber = CoreFeatures.multiply(displayNumber, enteredNumber);
                    }

                    if (operationChoice.equalsIgnoreCase("divide")) {
                        if (enteredNumber != 0) {
                            displayNumber = CoreFeatures.division(displayNumber, enteredNumber);
                        } else {
                            Console.println("Error: Cannot divide by 0" + "\n");
                        }
                    }

                    if (operationChoice.equalsIgnoreCase("subtract")) {
                        displayNumber = CoreFeatures.subtract(displayNumber, enteredNumber);
                    }
                    if (operationChoice.equalsIgnoreCase("exponent")) {
                        displayNumber = CoreFeatures.exponent(displayNumber, enteredNumber);
                    }
                }
            }
            if (operationChoice.equalsIgnoreCase("Sq")) {
                displayNumber = CoreFeatures.square(displayNumber);
            }
            if (operationChoice.equalsIgnoreCase("sqrt")) {
                displayNumber = CoreFeatures.squareRoot(displayNumber);
            }
            if (operationChoice.equalsIgnoreCase("inverse")) {
                displayNumber = CoreFeatures.inverse(displayNumber);
            }
            if (operationChoice.equalsIgnoreCase("Factorial")) {
                displayNumber = ScientificFeatures.getFactorial(displayNumber);
            }
            if (operationChoice.equalsIgnoreCase("Sin")) {
                displayNumber = ScientificFeatures.getSin(displayNumber);
            }
            if (operationChoice.equalsIgnoreCase("Cos")) {
                displayNumber = ScientificFeatures.getCos(displayNumber);
            }
            if (operationChoice.equalsIgnoreCase("Tan")) {
                displayNumber = ScientificFeatures.getTan(displayNumber);
            }
            if (operationChoice.equalsIgnoreCase("ArcSin")) {
                displayNumber = ScientificFeatures.getArcSin(displayNumber);
            }
            if (operationChoice.equalsIgnoreCase("ArcCos")) {
                displayNumber = ScientificFeatures.getArcCos(displayNumber);
            }
            if (operationChoice.equalsIgnoreCase("ArcTan")) {
                displayNumber = ScientificFeatures.getArcTan(displayNumber);
            }
            if (operationChoice.equalsIgnoreCase("invLog")) {
                displayNumber = ScientificFeatures.invLog(displayNumber);
            }
            if (operationChoice.equalsIgnoreCase("radToDeg")) {
                displayNumber = ScientificFeatures.radToDeg(displayNumber);
            }
            if (operationChoice.equalsIgnoreCase("log")) {
                displayNumber = ScientificFeatures.log(displayNumber);
            }
            if (operationChoice.equalsIgnoreCase("invert")) {
                displayNumber = CoreFeatures.invert(displayNumber);
            }


            Console.println("Num: " + displayNumber + "");


            String exitAnswer = Console.getStringInput("Continue calculating? Enter Y/N");

            if (!exitAnswer.equals("y") && !exitAnswer.equals("Y")) {
                play = false;
            }
        }


    }
}
