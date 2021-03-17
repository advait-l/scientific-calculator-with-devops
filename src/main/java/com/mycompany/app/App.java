package com.mycompany.app;

import java.lang.*;
import java.util.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App 
{
    private static final Logger logger = LogManager.getLogger(App.class);

    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        double n1, n2;
        do{
            logger.info("New User!");

            // Scientific Calculator Terminal-based UI
            System.out.println("-------SCIENTIFIC CALCULATOR-------");
            System.out.println("MENU--");
            System.out.println("Press 1 to calculate SQUARE ROOT");
            System.out.println("Press 2 to calculate FACTORIAL");
            System.out.println("Press 3 to calculate NATURAL LOGARITHM");
            System.out.println("Press 4 to calculate EXPONENT");

            // User Entered Option
            int option;
            option = scanner.nextInt();

            switch(option){
                // Square Root Option
                case 1:
                    System.out.print("Enter the number to compute square root of: ");
                    n1 = scanner.nextDouble();
                    System.out.println("Square root of " + n1 + " is " + sqrt(n1) + "\n");
                    break;

                // Factorial Option
                case 2:
                    System.out.print("Enter the number to compute factorial of: ");
                    int n = scanner.nextInt();
                    System.out.println("Factorial of " + n + " is " + fact(n) + "\n");
                    break;

                // Natural Logarithm Option
                case 3:
                    System.out.print("Enter the number to compute natural logarithm of: ");
                    n1 = scanner.nextDouble();
                    System.out.println("Natural logarithm of " + n1 + " is " + nlog(n1) + "\n");
                    break;

                // Exponent Option
                case 4:
                    System.out.print("Enter the number to compute exponential of: ");
                    n1 = scanner.nextDouble();
                    System.out.print("Enter the exponent: ");
                    n2 = scanner.nextDouble();
                    System.out.println("Exponent of " + n1 + " to the power " + n2 + " is " + exp(n1, n2) + "\n");
                default:
                    System.out.println("Quitting the calculator...");
                    return;
            }
        }
        while(true);
    }

    static double sqrt(double n){
        return Math.sqrt(n);
    }

    static int fact(int n){
        int factorial = 1;
        for(int i = n; i > 0; i--){
            factorial *= i;
        }
        return factorial;
    }

    static double nlog(double n){
        return Math.log(n);
    }

    static double exp(double n1, double n2){
        return Math.pow(n1, n2);
    }
}
