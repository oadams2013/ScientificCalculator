package com.zipcodewilmington.scientificcalculator;

//import java.util.Scanner; //Not needed if we use from Console.  This is leftover from when I copied my code over from my test project

public class Bee {


    public static void main(String[] args){  //play the intro and start the game
        intro();
        runGame();
    }

    //Super cool intro screen
    public static void intro() {
        System.out.println("        ****  ****");
        System.out.println("      **    **    **        *****    ******   ******   *** **    ******   ******   *****    ******   *****");
        System.out.println("      **      **  **         *   *    *   *    *   *    *  *      *   *    *   *    *   *    *   *    *   *");
        System.out.println("        ************         *   *    *        *        * *       *        *        *   *    *        *   *");
        System.out.println("      ****  **      **       ****     ***      ***      **        ***      ***      *   *    ***      **** ");
        System.out.println("    **  **  **        **     *   *    *        *        * *       *        *        ****     *        * *");
        System.out.println("******  **  **    **  **     *   *    *        *        *  *      *        *        *        *        *  *");
        System.out.println("    **  **  **        **     *   *    *   *    *   *    *   *     *   *    *   *    *        *   *    *   *");
        System.out.println("      ****  **      **      *****    ******   ******   ***  **   ******   ******   ***      ******   ***  **");
        System.out.println("        ************\n");
    }
    public static void runGame(){

        //play sequence of the game.  Will continue until $100 or player hits 'q'
        while(playStatus) {

            if (playerMoney >= 100) {
                System.out.println("Congratulations! You've made your first $100!");
                System.out.println("To 'bee' continued...");
                break;
            }
            status();
            playerOptions();
            inputSelection();
            System.out.println("\n \n \n");
        }
    }
    static boolean playStatus = true;
    static double honeyRate = 1;
    static double playerMoney = 0;
    static int hiveNum = 1;
    static double honey = 0;
    static double workerNum = 0;

    //print the current status of honey, hives, workers, money, etc
    public static void status(){
        System.out.println("Number of hives: " + hiveNum);
        if (workerNum > 0) { System.out.println("Number of workers: " +workerNum);}
        System.out.printf("Current Player Money: $%.2f%n",playerMoney);
        System.out.println("Honey collected per min: " + honeyRate);
        System.out.println("Honey: " + honey);
        System.out.println("*******************************");
    }

    //Print the options available, depending on the player's money
    public static void playerOptions(){
        System.out.print("[Z] Wait   [S]Sell");
        if (playerMoney >= 5) {  System.out.print("   [H] Buy Hive ($5)");}
        if (playerMoney >= 20) { System.out.print("   [W] Hire Worker ($20)");}
        //System.out.print("\nSelect your Option: ");  // Made unnecessary by Console input prompt.  Leaving it in



    }

    // I don't know if this needs to be its own method.  Pulls input option from the Console class
    public static String getPlayerInput(){
        return Console.getStringInput("\nSelect your option: ");
    }

    //What the different options will do when selected
    public static void inputSelection() {
        String input = getPlayerInput();
        if (input.equalsIgnoreCase("z")) {  //Allow time to pass
            incrementTime();
        }
        if (input.equalsIgnoreCase("s")) { //Sell all honey for $$
            playerMoney += honey;
            honey = 0;
        }
        if (input.equalsIgnoreCase("h") && playerMoney >= 5) { //Buy Hive if player can afford
            playerMoney -= 5;
            hiveNum++;
            honeyRate++;
        }
        if (input.equalsIgnoreCase("w") && playerMoney >= 20) { // Hire a worker if the player can afford
            playerMoney -= 20;
            workerNum++;
            honeyRate += 5;
        }
        if (input.equalsIgnoreCase("q")) {  // quit the game at any time
            playStatus = false;
        }
    }


    public static void incrementTime(){
        honey += honeyRate;
    }  //what happens when time passes.  Can elaborate later
}


