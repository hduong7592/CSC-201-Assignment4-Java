/**
 * Hieu Duong
 * CSC 201
 * Assignment 4
 * Problem 4.11:
 * Decimal to hex) Write a program that prompts the user to enter an integer between
 * 0 and 15 and displays its corresponding hex number.
 *
 * 10/13/2017
 *
 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        int input = GetInputValue();
        if(input > -1){
            //Convert input to hex string
            System.out.println("Hex value of input is: "+Integer.toHexString(input).toUpperCase());
        }
    }

    /**
     * Get input method
     * @return
     */
    public static int GetInputValue(){

        Scanner keyboard = new Scanner(System.in);

        String value;
        int input = -1;

        boolean IsNotANumber = true;
        while(IsNotANumber)
        {
            System.out.println("Enter a decimal value (0 to 15): ");
            value = keyboard.next();
            try {
                input = Integer.parseInt(value);
                if(input>-1 && input < 16) {
                    IsNotANumber = false;
                }
                else{
                    System.out.println("Please enter value from 0 to 15 only.");
                    IsNotANumber = true;
                }
            }
            catch (Exception e)
            {
                System.out.println("Value entered is not a number, please enter integer number only");
                IsNotANumber = true;
            }
        }

        return input;
    }
}
