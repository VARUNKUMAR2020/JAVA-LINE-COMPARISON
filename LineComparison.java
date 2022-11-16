package com.linecomparison;

import java.util.*;;

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");

        // Scanner class for getting the inputs
        Scanner input = new Scanner(System.in);

        // Displaying message for entering the number:
        System.out.println("Enter the first co-ordinate");

        // inputs are stored in the variables
        int X1 = input.nextInt();
        int Y1 = input.nextInt();

        // Displaying message for entering the number:
        System.out.println("Enter the second co-ordinate");

        // inputs are stored in the variables
        int X2 = input.nextInt();
        int Y2 = input.nextInt();

        System.out.println("The first co-ordinate is (" + X1 + "," + Y1 + ") ");
        System.out.println("The second co-ordinate is (" + X2 + "," + Y2 + ") ");
        double length;

        // Formula for calculating the lenght of the co-ordinates:
        int a = (X2 - X1) * (X2 - X1);
        int b = (Y2 - Y1) * (Y2 - Y1);
        length = Math.sqrt(a + b);
        System.out.println("length of the line is " + length);
    }
}
