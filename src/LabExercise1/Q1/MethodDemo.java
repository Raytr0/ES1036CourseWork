package LabExercise1.Q1;
import java.util.Scanner;

/*******************************************
 Shih Chen Huang
 251282167
 Feb 06, 2023
 The following code takes user's height and converts it into inches and feet and prints out the results
 *********************************************/
public class MethodDemo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);//initializes scanner
        myHeader(1, 1, "Accepts user input in cm, then converts cm to inches, and inches to feet");//calls myHeader with the given arguments
        System.out.print("Enter your height in cm: ");//prompts user to input height in cm
        double cmHeight = input.nextDouble();//accepts input
        System.out.printf("%.2f cm = %.2f inches\n",cmHeight ,cmToInchConverter(cmHeight));//prints out converted results with calling cmToInchConverter()
        System.out.printf("%.2f inches = %d ft %.2f inches\n", cmToInchConverter(cmHeight), (int)cmToInchConverter(cmHeight)/12, cmToInchConverter(cmHeight)%(double)12);
        //Prints out converted inches to feet using called methods
        System.out.println();//Line formatting
        myFooter(1);//calls myFooter with given argument
    }
    public static void myHeader(int labNum, int questionNum, String description){
        System.out.println("****************************************************\n" +
        "Full Name: Shih Chen Huang.\n"+
        "Lab Exercise: " + labNum + ", Question: " + questionNum + "\n"+
        "Program Description: " + description +".\n"+
        "*****************************************************\n");
    }
    //Prints out name, lab number, question number, and description
    public static void myFooter(int questionNumber){
        System.out.println("*** Signing off from Question " + questionNumber + "– Shih Chen ***");
    }
    //Prints out ending note
    public static double cmToInchConverter(double cm){
        return cm/2.54;
    }
    //returns converted values
}
