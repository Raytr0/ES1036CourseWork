/*******************************************
 Shih Chen Huang
 251282167
 Jan 29, 2023
 The following code takes user inputted height and radius, then returns the calculated
 volume of a cone.
 *********************************************/
package LabAssignment1.Q1;

import java.util.Scanner;

public class ConeVolume {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);//declares new scanner
        System.out.println("****************************************************\n" +
                "Full Name: Shih Chen Huang\n" +
                "Student Number:251282167\n" +
                "Date:2023/01/28\n" +
                "Brief description of the task: Asks the user to input a height and radius,\n" +
                "then calculates the volume of the cone with the given parameters\n" +
                "then prints out the resulting number and restates the numbers provided by the user\n" +
                "*****************************************************");// Prints out basic information of creator and purpose of program.
        System.out.print("Please enter the height of a cone: ");//prompts user to enter a height
        double height = input.nextDouble();//stores the user inputted value to height
        System.out.print("Please enter the radius of the cone: ");//prompts the user to enter a radius
        double radius = input.nextDouble();//stores the user inputted value to radius
        double volume = (Math.PI*Math.pow(radius, 2)*height)/3;//calculates volume of cone and stores it
        System.out.println();//blank println for formatting
        //prints out the radius, height, and volume to 2 decimal points
        System.out.printf("The volume of a cone with radius %.2f cm and height %.2f cm is: %.2f cubic cm\n", radius, height, volume);
        System.out.println("*****************************************************");//prints out line of * for formatting
    }
}
