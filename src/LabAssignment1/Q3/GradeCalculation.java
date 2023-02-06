/*******************************************
 Shih Chen Huang
 251282167
 Jan 29, 2023
 The following code takes the grades of the user and calculates the average based on the course weighting.
 *********************************************/
package LabAssignment1.Q3;
import java.util.Scanner;

public class GradeCalculation {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);//declares new Scanner method
        System.out.println("****************************************************\n" +
                "Full Name: Shih Chen Huang\n" +
                "Student Number:251282167\n" +
                "Date:2023/01/28\n" +
                "Brief description of the task: Asks user to input 3 grades, then prints out the average\n" +
                "*****************************************************");// Prints out basic information of creator and purpose of program.
        double GRD1_WGT = 0.2;//initializes first weight of grade
        double GRD2_WGT = 0.3;//initializes second weight of grade
        double GRD3_WGT = 0.5;//initializes third weight of grade
        System.out.println();//blank println for formatting
        System.out.print("Input the first grade: ");//prompts user input their first grade
        int grade1 = input.nextInt();//stores the value of users next input
        System.out.print("Input the second grade: ");//prompts user input their second grade
        int grade2 = input.nextInt();//stores the value of users next input
        System.out.print("Input the third grade: ");//prompts user input their third grade
        int grade3 = input.nextInt();//stores the value of users next input
        //calculates the final grade average with the given grades and weighting
        double FinalGrade = grade1*GRD1_WGT + grade2*GRD2_WGT + grade3*GRD3_WGT;
        System.out.println();//blank println for formatting
        System.out.printf("The course grade is: %.2f\n", FinalGrade);//prints out the final grade to 2 decimal points
        System.out.println("*****************************************************");//prints row of * for formatting
    }
}
