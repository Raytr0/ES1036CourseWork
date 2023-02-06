/*******************************************
 Shih Chen Huang
 251282167
 Jan 29, 2023
 The following code takes a 4-digit number from the user and prints out each individual
 number at each digit, and also prints out the RMS of the number.
 *********************************************/
package LabAssignment1.Q2;
import java.util.Scanner;
public class MathBugs {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);//initialises a new Scanner called input
        System.out.println("****************************************************\n" +
                "Full Name: Shih Chen Huang\n" +
                "Student Number: 251282167\n" +
                "Date: 2023/01/28\n" +
                "Brief description of the task: Prompts the user to enter a 4 digit number with no zeros,\n" +
                "then prints each digit in their respective location and returns RMS value.\n"+
                "*****************************************************"); // Prints out basic information of creator and purpose of program.
        System.out.print("Enter a 4-digit number: ");// Prints out instruction to user.
        int number = input.nextInt();// Obtains an integer input and stores as variable.
        int thousandsDigit = number / 1000;//Gets first digit of number and stores it.
        int hundredsDigit =  (number % 1000) / 100;//Gets second digit of number and stores it.
        int tensDigit = ((number % 1000) % 100) / 10;//Gets third digit of number and stores it.
        int onesDigit = ((number % 1000) % 100) % 10;//Gets last digit of number and stores it.
        System.out.println("Thousands Digit: " + thousandsDigit);//prints out thousandsDigit
        System.out.println("Hundreds Digit: " + hundredsDigit);//prints out hundredsDigit
        System.out.println("Tens Digit: " + tensDigit);//prints out tensDigit
        System.out.println("Ones Digit: " + onesDigit);//prints out onesDigit
        //Calculates the RMS of the inputted number and stores it.
        double RMS = Math.sqrt((Math.pow(thousandsDigit, 2) + Math.pow(hundredsDigit, 2) + Math.pow(tensDigit, 2) + Math.pow(onesDigit, 2))/4);
        System.out.printf("The RMS value of the above four digits is: %.2f \n", RMS);//prints out RMS.
        System.out.println("*****************************************************");//prints formatting line
    }
}
