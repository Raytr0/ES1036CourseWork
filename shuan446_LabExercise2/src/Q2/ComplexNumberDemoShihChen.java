/*
Name: Shih Chen Huang
Date: March 1, 2023
Student Number: 251282167
Description: This program preforms arithmetic calculations using real and imaginary numbers
*/
package Q2;

import java.util.Scanner;
import Q1.StudentGradesByShihChen;

public class ComplexNumberDemoShihChen {
    public static Scanner input = new Scanner(System.in); //initialises a new scanner
    public static int counter = 0;//initialises variable counter with value 0
    public static void main(String[] args) {
        Q1.StudentGradesByShihChen.myHeader(2,2,"This program takes user input and calculates complex numbers");//Header text
        ComplexNumber x = new ComplexNumber();
        x = dataEntry();
        ComplexNumber y = new ComplexNumber();
        y = dataEntry();
        //initialises new ComplexNumber type variable and uses that to assign new data to the newly called variables

        System.out.println("You have entered the following two complex numbers x and y:");
        System.out.print("x = ");
        x.displayRecForm();
        //Displays the equation of x
        System.out.println();
        System.out.print("y = ");
        y.displayRecForm();
        //Displays the equation of y
        ComplexNumber addRes = complexAdder(x,y);//initialises new ComplexNumber type variable and assigns addition value of x and y
        ComplexNumber mulRes = complexMultiplier(x,y);//initialises new ComplexNumber type variable and assigns multiplication value of x and y
        System.out.println();//spacer
        System.out.println();//spacer
        System.out.println("Here are the results of the arithmetic operation:");
        System.out.print("x + y = ");
        addRes.displayRecForm();//displays the addition results
        System.out.printf(", Magnitude: %.2f, Angle %.2f degrees\n", addRes.getMagnitude(), addRes.getAngle());
        //displays the magnitude and angle of the addRes

        System.out.print("x * y = ");
        mulRes.displayRecForm();//displays the multiplication results
        System.out.printf(", Magnitude: %.2f, Angle %.2f degrees\n", mulRes.getMagnitude(), mulRes.getAngle());
        //displays the magnitude and angle of the mulRes
        System.out.println();//spacer
        Q1.StudentGradesByShihChen.myFooter(2);//ending text
    }
    public static ComplexNumber dataEntry(){
        counter++;//increments counter by 1
        System.out.println("Complex number " + counter + " data......");
        System.out.print("Enter the real term: ");//prompts user input
        double realNum = input.nextDouble();//accepts user input
        System.out.print("Enter the imaginary term: ");//prompts user input
        double imagNum = input.nextDouble();//accepts user input
        System.out.println();//spacer
        return new ComplexNumber(realNum,imagNum);//returns the calculated value
    }//Accepts user input and assigns the new values

    public static ComplexNumber complexAdder (ComplexNumber x, ComplexNumber y){
        ComplexNumber compAdd = new ComplexNumber(x.getReal()+y.getReal(), x.getImaginary()+y.getImaginary());
        return compAdd;
    }//Preforms addition to the provided arguments and returns the value

    public static ComplexNumber complexMultiplier (ComplexNumber x, ComplexNumber y){
        ComplexNumber compMulti = new ComplexNumber(x.getReal()*y.getReal()-x.getImaginary()*y.getImaginary(),x.getImaginary()*y.getReal()+x.getReal()*y.getImaginary());
        return compMulti;
    }//Preforms multiplication to the provided arguments and returns the value
}
