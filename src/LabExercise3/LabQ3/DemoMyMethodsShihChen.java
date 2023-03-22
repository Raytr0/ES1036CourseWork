/*
Name: Shih Chen Huang
Date: March 9, 2023
Student Number: 251282167
Description: This program demonstrates the arithmetic calculations from MyMethod.java by prompting user inputs and displaying the result
*/
package LabExercise3.LabQ3;

import java.util.Scanner;

public class DemoMyMethodsShihChen {
    public static Scanner input = new Scanner(System.in);//Initialises scanner
    public static void main(String[] args){
        MyMethod.myHeader(3,1,"Preforms mathematical calculations depending on user input.");
        //Prints out header information
        System.out.println("Testing Mathematical Functions:");
        //Describes program
        char choice;//Initialises char variable
        while (true){//True loop
            System.out.println("\n======MENU=======\n" +
                    "a: Power Function\n" +
                    "b: Factorial Function\n" +
                    "c: Sine Function\n" +
                    "d: Cosine Function\n" +
                    "e: exit\n" +
                    "==================\n");//Displays choices to the user
            System.out.print("Enter your choice: ");//Prompts user to enter a choice
            choice = MyMethod.myToLowerCase(input.next().charAt(0));//Obtains user input
            switch (choice){//switch statement for deciding which choice to run
                case 'a':
                    System.out.println("POWER FUNCTION: Calculating x to the power of y.\n");//Describes function
                    System.out.print("Enter x: ");//Prompts user input
                    double x = input.nextDouble();//Accepts user input
                    System.out.print("Enter y: ");//Prompts user input
                    int y = input.nextInt();//Accepts user input
                    System.out.printf("%.2f^" + y + " = %.2f\n",x , MyMethod.myPow(x,y));//Displays solution
                    break;//Exits switch
                case 'b':
                    System.out.println("FACTORIAL FUNCTION: Calculating factorial(n).\n");//Describes function
                    System.out.print("Enter n: ");//Prompts user input
                    int n = input.nextInt();//Accepts user input
                    while(n<0) {
                        System.out.print("n has to be >= 0; enter again: ");//Prompts user input
                        n = input.nextInt();//Accepts user input
                    }
                    System.out.printf(n + "! = %.2e\n",MyMethod.myFactorial(n));//Displays solution
                    break;//Exits switch
                case 'c':
                    System.out.println("SINE FUNCTION: Calculating sin(k) degree.\n");//Describes function
                    System.out.print("Enter k in degrees: ");//Prompts user input
                    double k = input.nextDouble();//Accepts user input
                    System.out.printf("sin("+k+") degree = %.2f\n",MyMethod.mySin(MyMethod.myDegreeToRadian(k)));//Displays solution
                    break;//Exits switch
                case 'd':
                    System.out.println("COSINE FUNCTION: Calculating cos(m) degree.\n");//Describes function
                    System.out.print("Enter m in degrees: ");//Prompts user input
                    double m = input.nextDouble();//Accepts user input
                    System.out.printf("cos("+m+") degree = %.2f\n",MyMethod.mySin(MyMethod.myDegreeToRadian(m)));//Displays solution
                    break;//Exits switch
                case 'e':
                    break;//Exits switch
                default:
                    System.out.println("Invalid Choice!");//Displays invalid input
                    break;//Exits switch

            }
            if(choice == 'e')
                break;//Exits the program
        }
        MyMethod.myFooter(1);//Prints closing statement

    }

}
