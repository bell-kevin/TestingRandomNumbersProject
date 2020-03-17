package testingrandomnumbers;

/******************************************************************************
* TestingRandomNumbers.java 
* Programmer: @author jcboyd
* Version: 1.0
* Course: SDEV 2210
* This program generates a random number within a range and exists only to 
* practice unit testing
******************************************************************************/

import java.util.*; //Scanner, Random

public class TestingRandomNumbers {

    public static int getRN(int min, int max) {
        Random rng = new Random();
        int answer = rng.nextInt((max - min) + 1) + min;
        return answer;
    } //end getRN
    
    public static void main(String[] args) {

        System.out.println("Proj 7: Testing Random Numbers by JC Boyd\n");
        
        Scanner stdIn = new Scanner(System.in);
        int min, max, answer;
        
        System.out.print("Enter minimum random number: ");
        min = Integer.parseInt(stdIn.nextLine());
        System.out.print("Enter maximum random number: ");
        max = Integer.parseInt(stdIn.nextLine());
        
        System.out.printf("The random number is: %d\n", getRN(min, max));
    } //end main
    
} //end class TestingRandomNumbers
