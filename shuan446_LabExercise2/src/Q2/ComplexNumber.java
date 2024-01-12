/*
Name: Shih Chen Huang
Date: March 1, 2023
Student Number: 251282167
Description: This program contains methods and fields for ComplexNumberDemoShihChen
*/
package Q2;

public class ComplexNumber {
    private double real;
    private double imaginary;
    //Initialises variables.
    public ComplexNumber(){
        real = 0;
        imaginary = 0;
    }//Assigns 0 value to variables
    public ComplexNumber(double re, double im){
        real = re;
        imaginary = im;
    }//Assigns value to variable from the given arguments
    public double getReal(){
        return real;
    }//Returns real number
    public double getImaginary(){
        return imaginary;
    }//Returns imaginary number
    public double getMagnitude(){
        return Math.sqrt(Math.pow(real,2)+Math.pow(imaginary,2));
    }//Returns the magnitude of the equation
    public double getAngle(){
        return Math.toDegrees(Math.atan2(imaginary,real));
    }//Returns the angle of the equation
    public void displayRecForm(){
        System.out.printf("%.2f", real);

        if (imaginary >= 0)
            System.out.print(" + ");
        else
            System.out.print(" - ");

        System.out.printf("%.2fi", Math.abs(imaginary));
    }//Check imaginary value to format correctly and then prints out the equation
}
