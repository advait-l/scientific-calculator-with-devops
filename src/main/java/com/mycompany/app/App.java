package com.mycompany.app;

import java.lang.*;
import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        double n1, n2;
        do{
            // Scientific Calculator Terminal-based UI
            System.out.println("-------SCIENTIFIC CALCULATOR-------");
            System.out.println("MENU--");
            System.out.println("Press 1 to calculate SQUARE ROOT");

            // User Entered Option
            int option;
            option = scanner.nextInt();

            switch(option){
                // Square Root Option
                case 1:
                    System.out.print("Enter the number to compute square root of: ");
                    n1 = scanner.nextDouble();
                    System.out.println("Square root of " + n1 + " is " + Math.sqrt(n1) + "\n");
                    break;
                default:
                    System.out.println("Quitting the calculator...");
                    return;
            }
        }
        while(true);
    }
}
