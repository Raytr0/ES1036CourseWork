package LabAssignment2.Q1;
import java.util.Scanner;

public class CircleInfoShihChen {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        myHeader(2, 1, "Prints out all the details of a circle given a radius input by the user.");
        Circle round = new Circle();
        System.out.print("Enter the radius: ");
        round.setRadius(input.nextDouble());
        System.out.println();
        System.out.printf("Circle info: \nRadius: %.3f cm \nArea: %.3f sq-cm\nDiameter: %.3f cm\nCircumference: %.3f cm\n"
        , round.getRadius(), round.getArea(), round.getDiameter(), round.getCircumference());
        myFooter(1);
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
}
