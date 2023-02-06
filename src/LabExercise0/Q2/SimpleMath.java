/*******************************************
 Shih Chen Huang
 251282167
 Jan 23, 2023
 The following code takes user input in terms of Celsius and converts the value to Fahrenheit,
 then prints out the result.
 *********************************************/
package LabExercise0.Q2;//Indicating that this is from the package Q1.

import java.util.Scanner;

public class SimpleMath {//Creating a class SimpleMath.

    public static void main(String args[]) {//Creating a method main(), which is the entry point.
        System.out.println("Hello again! This is Shih Chen Huang.\n" +
                "Student Number: 251282167\n" +
                "Date: Jan 23, 2023\n" +
                "-----------------------------------\n" +
                "Let’s do some simple mathematical calculations.\n" +
                "converting a temperature from Celsius scale to Fahrenheit\n" +
                "Scale...");/*Introduces the name, student number, and date of creation,
                            then indicates the purpose of this program*/
        double c = 0, f = 0;//Declares two double type variables, c for Celsius, f for Fahrenheit.
        Scanner input = new Scanner(System.in);//Prepares a Scanner type reference to accept input from user.
        System.out.println("Enter temperature in Celsius: ");//Prompts the user to enter a number.
        c = input.nextDouble();//Accepts the value from the user and assigns it to c.
        f = ((9 * c) / 5) + 32;//Calculates the number inputted into Fahrenheit using conversion formula.
        System.out.println(c + " degree Celsius is " + f + " degree Fahrenheit!");//Prints out the equivalent Celsius to Fahrenheit values.
        System.out.println("Question 2 is successfully done!");//Prints a concluding statement to the program.
    }
}
