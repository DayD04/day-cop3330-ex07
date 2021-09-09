package org.example;
import java.util.Scanner;
/**
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 David Day
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.print( "What is the length of the room in feet? " );
        int length = input.nextInt();

        System.out.print("What is the width of the room in feet? ");
        int width = input.nextInt();

        System.out.println("Your entered dimensions are " + length + " feet by " + width + " feet.");
        System.out.println("The area is");
        int area = length * width;
        System.out.println(area + " square feet");
        double meterArea = area * 0.092903;
        System.out.println(meterArea + " square meters");
    }
}
