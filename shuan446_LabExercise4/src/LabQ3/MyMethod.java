/*
Name: Shih Chen Huang
Date: March 9, 2023
Student Number: 251282167
Description: This program contains methods that preform arithmetic calculations
*/
package LabQ3;

public class MyMethod {
    final public static double PI = 3.141592653589793;//Initialises PI value
    public static double myPow(double x, int y){
        double xTemp = 1;//Initialises double variable
        if(y>0) {
            for (int i = 0; i < y; i++) {
                xTemp = xTemp * x;
            }
            return xTemp;
        }
        //Checks for positive number and runs loop until limit is reached
        if(y<0){
            for(int i = 0; i < Math.abs(y); i++){
                xTemp = xTemp * x;
            }
            return 1/xTemp;
        }
        //Checks for negative number and runs loop until limit is reached
        else
            return 1;
        //returns one since only other possible input would result in 1. num^0 = 1
    }
    public static double myFactorial(int n){
        double nTemp = n;
        if(n == 0)
            return 1;
        else{
            for (int i = 1; i < n; i++){
            nTemp *= i;
            }
        }
        return nTemp;
        //Returns 1 if factorial is 0, otherwise runs for loop until limit is reached and returns the calculated value
    }
    public static double mySin(double x){
        double sinTemp = 0;
        for(int i = 0; i < 20; i++) {
        sinTemp += myPow(-1,i)/myFactorial(2*i+1)*myPow(x,2*i+1);
        }
        return sinTemp;
    }
    //Runs through for loop 20 times and returns the solution using sine in degrees
    public static double myCos(double x){
        double cosTemp = 0;
        for(int i = 0; i < 20; i++) {
            cosTemp += myPow(-1,i)/myFactorial(2*i)*myPow(x,2*i);
        }
        return cosTemp;
    }
    //Runs through for loop 20 times and returns the solution using cos in degrees
    public static double myDegreeToRadian(double degree){
        return degree*PI/180;
    }
    public static char myToLowerCase(char c){
        if(c>=65 && c<=90){
            c += 32;
            return c;
        }
        //Checks for valid range of characters that are in uppercase, then adds 32 to change ASCII value to lowercase and returns the character
        else{
            return c;
        }
        //Returns all other inputs that are not in range
    }
    public static void myHeader(int labNum, int questionNum, String description){
        System.out.println("****************************************************\n" +
                "Full Name: Shih Chen Huang.\n"+
                "Lab Exercise: " + labNum + ", Question: " + questionNum + "\n"+
                "Program Description: " + description +"\n"+
                "*****************************************************");
    }
    //Prints out name, lab number, question number, and description
    public static void myFooter(int questionNumber){
        System.out.println("*** Signing off from Question " + questionNumber + " – Shih Chen ***");
    }
    //Prints out ending note
}
