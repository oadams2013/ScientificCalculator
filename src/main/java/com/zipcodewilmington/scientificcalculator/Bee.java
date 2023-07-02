package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

public class Bee {

    public static void main(String[] args){
        intro();
        runGame();
    }


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
    public static void status(){
        System.out.println("Number of hives: " + hiveNum);
        if (workerNum > 0) { System.out.println("Number of workers: " +workerNum);}
        System.out.println(String.format("Current Player Money: $%.2f",playerMoney));
        System.out.println("Honey collected per min: " + honeyRate);
        System.out.println("Honey: " + honey);
        System.out.println("*******************************");
    }

    public static void playerOptions(){
        System.out.print("[Z] Wait   [S]Sell");
        if (playerMoney >= 5) {  System.out.print("   [H] Buy Hive ($5)");}
        if (playerMoney >= 20) { System.out.print("   [W] Hire Worker ($20)");}
        System.out.print("\nSelect your Option: ");



    }
    public static String getPlayerInput(){
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        //in.close();   //when do we close the scanner?
        return input;

    }
    public static void inputSelection() {
        String input = getPlayerInput();
        if (input.equalsIgnoreCase("z")) {
            incrementTime();
        }
        if (input.equalsIgnoreCase("s")) {
            playerMoney += honey;
            honey = 0;
        }
        if (input.equalsIgnoreCase("h") && playerMoney >= 5) {
            playerMoney -= 5;
            hiveNum++;
            honeyRate++;
        }
        if (input.equalsIgnoreCase("w") && playerMoney >= 20) {
            playerMoney -= 20;
            workerNum++;
            honeyRate += 5;
        }
        if (input.equalsIgnoreCase("q")) {
            playStatus = false;
        }
    }


    public static void incrementTime(){
        honey += honeyRate;
    }
}


