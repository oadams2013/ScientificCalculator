package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {

        MainApplication.run();
    }

    static Double displayNumber = 0.0;

    public static void run() {


        boolean play = true;

        Console.println(Console.introArt());
        Console.println(Console.calculatorWord());

        calcDisplay();
        //Console.println("\n" + "Num: " + displayNumber + "");

        displayNumber += Console.getIntegerInput("Enter number");

        String[] theCoreFeaturesArray = new String[]{"add", "+", "multiply", "mult", "*", "divide", "div", "/", "subtract", "sub", "-", "exponent", "exp"};


        while (play) {

            calcDisplay();
            //Console.println("\n" + "Num: " + displayNumber + "");

            String operationChoice = Console.getStringInput("\n" + "Enter desired operation (ex: add)" + "\n" + "[C] Clear   [O] Option   [Q] Quit");

            if (operationChoice.equalsIgnoreCase("q")) {
                play = false;
            }
            if (operationChoice.equalsIgnoreCase("bee")) {
                Bee.main();
            }

            if (operationChoice.equalsIgnoreCase("o")) { //changed "options" to "o"
                Console.println(Console.MathOptions());
                operationChoice = Console.getStringInput("Enter desired math operation");
            }


            if (operationChoice.equalsIgnoreCase("c")) {
                displayNumber = 0.0;
                calcDisplay();
                displayNumber += Console.getIntegerInput("Enter number");

            }

            for (int i = 0; i < theCoreFeaturesArray.length; i++) {

                if (theCoreFeaturesArray[i].equals(operationChoice)) {

                    Integer enteredNumber = Console.getIntegerInput("Enter number");
                    switch (operationChoice.toLowerCase()) {
                        case "add":
                        case "+":
                            displayNumber = CoreFeatures.add(displayNumber, enteredNumber);
                            break;
                        case "multiply":
                        case "mult":
                        case "*":
                            displayNumber = CoreFeatures.multiply(displayNumber, enteredNumber);
                            break;
                        case "divide":
                        case "div":
                        case "/":
                            if (enteredNumber != 0) {
                                displayNumber = CoreFeatures.division(displayNumber, enteredNumber);
                            } else {
                                Console.println("Error: Cannot divide by 0" + "\n");
                            }
                            break;
                        case "subtract":
                        case "sub":
                        case "-":
                            displayNumber = CoreFeatures.subtract(displayNumber, enteredNumber);
                            break;
                        case "exponent":
                        case "exp":
                            displayNumber = CoreFeatures.exponent(displayNumber, enteredNumber);
                            break;
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
                if (displayNumber != 0) {
                    displayNumber = CoreFeatures.inverse(displayNumber);
                } else {
                    Console.println("\n" + "Error: Inverse by 0 undefined" + "\n");
                }
            }

            // Try Switch Case because it allows for cleaner input options
            switch (operationChoice.toLowerCase()) {

                case "factorial":
                    displayNumber = ScientificFeatures.getFactorial(displayNumber);
                    break;
                case "sin":
                case "sine":
                    displayNumber = ScientificFeatures.getSin(displayNumber);
                    break;
                case "cos":
                case "cosine":
                    displayNumber = ScientificFeatures.getCos(displayNumber);
                    break;
                case "tan":
                case "tangent":
                    displayNumber = ScientificFeatures.getTan(displayNumber);
                    break;
                case "arcsin":
                case "invsin":
                case "inverse sin":
                    displayNumber = ScientificFeatures.getArcSin(displayNumber);
                    break;
                case "arccos":
                case "invcos":
                case "inverse cos":
                    displayNumber = ScientificFeatures.getArcCos(displayNumber);
                    break;
                case "arctan":
                case "invtan":
                case "inverse tan":
                    displayNumber = ScientificFeatures.getArcTan(displayNumber);
                    break;
                case "log":
                    displayNumber = ScientificFeatures.log(displayNumber);
                    break;
                case "invlog":
                    displayNumber = ScientificFeatures.invLog(displayNumber);
                    break;
                case "radtodeg":
                    displayNumber = ScientificFeatures.radToDeg(displayNumber);
                    break;
                case "degtorad":
                    displayNumber = ScientificFeatures.degToRad(displayNumber);
                    break;
                case "invert":
                    displayNumber = CoreFeatures.invert(displayNumber);
                    break;
            }


            // Edited out.  Redundant
            //Console.println("Num: " + displayNumber + "");

            /*
            String exitAnswer = Console.getStringInput("Continue calculating? Enter Y/N");

            if (!exitAnswer.equals("y") && !exitAnswer.equals("Y")) {
                play = false;
            }

             */
        }


    }

    public static void calcDisplay() {
        System.out.println(" ---------------------");
        System.out.println("|   " + String.format("%15.2f", displayNumber) + "   |");
        System.out.println(" ---------------------");
    }
}
