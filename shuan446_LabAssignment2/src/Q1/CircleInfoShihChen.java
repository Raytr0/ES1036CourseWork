/*******************************************
 Shih Chen Huang
 251282167
 Feb 16, 2023
 The following code obtains a radius input and prints out circle related calculations.
 *********************************************/
package Q1;
import java.util.Scanner;

public class CircleInfoShihChen {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);//declares scanner
        myHeader(2, 1, "Prints out all the details of a circle given a radius input by the user.");
        //calls myHeader method with parameters
        Circle round = new Circle();
        //declares new circle reference
        System.out.print("Enter the radius: ");
        //prompts user to input radius
        round.setRadius(input.nextDouble());
        //accepts user input
        System.out.println();
        //empty line for formatting
        System.out.printf("Circle info: \nRadius: %.3f cm \nArea: %.3f sq-cm\nDiameter: %.3f cm\nCircumference: %.3f cm\n"
        , round.getRadius(), round.getArea(), round.getDiameter(), round.getCircumference());
        //prints out radius, area, diameter, and circumference
        myFooter(1);
        //calls myFooter method with given arguments
    }
    public static void myHeader(int labNum, int questionNum, String description){
        System.out.println("****************************************************\n" +
                "Full Name: Shih Chen Huang.\n"+
                "Lab Assignment: " + labNum + ", Question: " + questionNum + "\n"+
                "Program Description: " + description +".\n"+
                "*****************************************************");
    }
    //Prints out name, lab number, question number, and description
    public static void myFooter(int questionNumber){
        System.out.println("*** Signing off from Question " + questionNumber + "– Shih Chen ***");
    }
    //prints out ending note
}
