package LabAssignment3.LabQ3;

import java.util.Scanner;

public class DemoMyMethodsShihChen {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        MyMethod.myHeader(3,1,"Preforms mathematical calculations depending on user input.");
        System.out.println("Testing Mathematical Functions:");
        char choice;
        while (true){
            System.out.println("\n======MENU=======\n" +
                    "a: Power Function\n" +
                    "b: Factorial Function\n" +
                    "c: Sine Function\n" +
                    "d: Cosine Function\n" +
                    "e: exit\n" +
                    "==================\n");
            System.out.print("Enter your choice: ");
            choice = MyMethod.myToLowerCase(input.next().charAt(0));
            switch (choice){
                case 'a':
                    System.out.println("POWER FUNCTION: Calculating x to the power of y.\n");
                    System.out.print("Enter x: ");
                    double x = input.nextDouble();
                    System.out.print("Enter y: ");
                    int y = input.nextInt();
                    System.out.printf("%.2f^" + y + " = %.2f\n",x , MyMethod.myPow(x,y));
                    break;
                case 'b':
                    System.out.println("FACTORIAL FUNCTION: Calculating factorial(n).\n");
                    System.out.print("Enter n: ");
                    int n = input.nextInt();
                    while(n<0) {
                        System.out.print("n has to be >= 0; enter again: ");
                        n = input.nextInt();
                    }
                    System.out.printf(n + "! = %.2e\n",MyMethod.myFactorial(n));
                    break;
                case 'c':
                    System.out.println("SINE FUNCTION: Calculating sin(k) degree.\n");
                    System.out.print("Enter k in degrees: ");
                    double k = input.nextDouble();
                    System.out.printf("sin("+k+") degree = %.2f\n",MyMethod.mySin(MyMethod.myDegreeToRadian(k)));
                    break;
                case 'd':
                    System.out.println("COSINE FUNCTION: Calculating cos(m) degree.\n");
                    System.out.print("Enter m in degrees: ");
                    double m = input.nextDouble();
                    System.out.printf("cos("+m+") degree = %.2f\n",MyMethod.mySin(MyMethod.myDegreeToRadian(m)));
                    break;
                case 'e':
                    break;
                default:
                    System.out.println("Invalid Choice!");
                    break;

            }
            if(choice == 'e')
                break;
        }
        MyMethod.myFooter(1);

    }

}
