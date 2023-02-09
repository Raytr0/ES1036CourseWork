package LabExercise1.Q3;

import LabExercise1.Q1.MethodDemo;

import java.util.Scanner;

/*******************************************
 Shih Chen Huang
 251282167
 Feb 06, 2023
 The following code sums up user inputted values and characters, also converts into ASCII and prints out results.
 *********************************************/

public class SumCity {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);//initialises scanner
        MethodDemo.myHeader(1,3,"long desc");
        //Calls myHeader from Q1 with given arguments
        System.out.print("Enter a real number: ");//Prompts user input
        double realOne = input.nextDouble();//Accepts user input
        System.out.print("Enter a second real number: ");//Prompts user input
        double realTwo = input.nextDouble();//Accepts user input
        System.out.printf("The sum of %.2f and %.2f is %.2f\n", realOne, realTwo, sumValues(realOne,realTwo));
        //Prints out sum of realOne and realTwo
        System.out.println();
        //Formatting line
        System.out.print("Enter a character: ");//Prompts user input
        String charOne = input.next();//Accepts user input
        System.out.print("Enter a second character: ");//Prompts user input
        String charTwo = input.next();//Accepts user input
        System.out.println("The sum of r and t is "+sumValues(charOne.charAt(0),charTwo.charAt(0))+", whose equivalent integer value is " + sumValues(charOne,charTwo) + "\n");
        //Prints out ASCII equivalent of the sum of charOne and charTwo and the integer value
        System.out.print("Enter your full name: ");
        input.nextLine();
        String name = input.nextLine();
        System.out.printf("%s \n",sumValues("My name is ", name));
        MethodDemo.myFooter(3);
    }
    public static String sumValues(String str1, String str2){
        return str1+str2;
    }
    //Converts string into ASCII numbers and returns the sum of the two values
    public static double sumValues(double num1, double num2){
        return num1+num2;
    }
    //Returns the sum of the values
    public static char sumValues(char char1, char char2){
        return (char)((int) char1 + (int) char2);
    }
    //Returns the ASCII equivalent of the numbers
}