package Q2;
import Q1.MethodDemo;
import java.util.Scanner;

/*******************************************
 Shih Chen Huang
 251282167
 Feb 06, 2023
 The following code simulates a conversation about temperature and takes user input in F and C degrees and converts interchangeably.
 *********************************************/

public class SmallTalk {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        MethodDemo.myHeader(1,2, "Obtains user input and converts between Fahrenheit and Celsius.");
        //Calls myHeader from Q1 with given arguments
        System.out.print("What is the outdoor temperature now? ");//Prompts user input
        double inCelsius = input.nextDouble();//Takes user input
        System.out.printf("\tI know you're used to Fahrenheit scale. %.2f deg-C is %.2f deg-F.\n",inCelsius, celsiusToFahrenheit(inCelsius));
        //Converts celsius to fahrenheit
        System.out.print("I am cold! What is the indoor temperature? ");//Prompts user input
        double outCelsius = input.nextDouble();//Accepts user input
        System.out.printf("\t%.2f deg-C is %.2f deg-F.\n", outCelsius, celsiusToFahrenheit(outCelsius));
        //Converts celsius to fahrenheit
        System.out.println("I see. Would you crank up the temperature?");//Prints dialogue
        System.out.print("\tOk I'll! What temperature should I set the thermostat to? ");
        //Prompts user input
        double newFahrenheit = input.nextDouble();//Accepts user input
        System.out.printf("\tOh, you mean %.2f deg Fahrenheit! Here you go.\n", newFahrenheit);
        //Prints dialogue with input from previous prompt
        System.out.printf("\tBy the way, %.2f deg-F is %.2f deg-C.\n", newFahrenheit, fahrenheitToCelsius(newFahrenheit));
        //Converts celsius to fahrenheit
        System.out.println("Thank you! It is very nice of you.\n");//Prints dialogue
        MethodDemo.myFooter(2);//Calls myFooter from Q1 to sign off
    }
    public static double celsiusToFahrenheit(double celsius){
        return (((celsius*9)/5)+32);//Returns fahrenheit value
    }
    public static double fahrenheitToCelsius(double fahrenheit){
        return (((fahrenheit-32)*5)/9);//Returns celsius value
    }
}
