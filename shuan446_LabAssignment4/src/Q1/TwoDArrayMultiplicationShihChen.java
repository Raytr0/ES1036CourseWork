package Q1;
import LabQ3.MyMethod;

import java.util.Scanner;

public class TwoDArrayMultiplicationShihChen {
    //Randomly assigns a value of 2 to 5 and fills up the array
    public static void populate2DArrays(int[][] ma){
        for(int i = 0; i < ma.length; i++){
            for(int j = 0; j < ma[i].length; j++){
                ma[i][j] = (int)(Math.random()*4 + 2);//Generates random number between 2-5 and assigns accordingly
            }
        }
    }
    //Prints out the array with proper formatting
    public static void display2DArrays(int[][] ma){
        for(int i = 0; i < ma.length; i++){
            System.out.print("\t");
            for(int j = 0; j < ma[i].length; j++){
                System.out.printf("%3d",ma[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
    //Does arithmetic calculations to multiply the two arrays
    public static int[][] multiplyArrays(int[][] a, int[][] b){
        int[][] result = new int[a.length][b[0].length];
        for(int i = 0; i < result.length; i++){
            for(int j = 0; j < result[i].length; j++){
                for(int k = 0; k < b.length; k++){
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return result;
    }

    public static void main(String[] args){
        MyMethod.myHeader(4,1,"Array multiplication");//Calls myHeader
        Scanner input = new Scanner(System.in);//new Scanner
        //Prompts user to input row size and array size for two arrays
        System.out.println("Multiplying two 2D arrays:");
        System.out.println("Enter array1 info:");
        System.out.print("\tEnter row-size: ");
        int r1 = input.nextInt();
        System.out.print("\tEnter column-size: ");
        int c1 = input.nextInt();
        System.out.println("Enter array2 info:");
        System.out.print("\tEnter row-size: ");
        int r2 = input.nextInt();
        //Checks if row size for array2 is equal to column size for array1
        while (r2 != c1){
            System.out.println("\tRow size of the 2nd matrix has to be equal to the column size of first matrix!");
            System.out.print("\tEnter again: ");
            r2 = input.nextInt();
        }
        System.out.print("\tEnter column-size: ");
        int c2 = input.nextInt();
        System.out.println();
        //Initializes two new arrays
        int[][] arr1 = new int[r1][c1];
        int[][] arr2 = new int[r2][c2];
        //Fills up the arrays with called method
        populate2DArrays(arr1);
        populate2DArrays(arr2);
        //Prints out array1
        System.out.println("Elements of Array 1, Size[" + r1 + " x " + c1 + "]:");
        display2DArrays(arr1);
        //Prints out array2
        System.out.println("Elements of Array 2, Size[" + r2 + " x " + c2 + "]:");
        display2DArrays(arr2);
        //Displays the result of multiplying two arrays
        System.out.println("Multiplying two arrays [Array 1 x Array 2]..");
        int[][] result = multiplyArrays(arr1,arr2);
        System.out.println("The resultant size is: [" + r1 + " x " + c2 + "].");
        System.out.println("The elements are...");
        display2DArrays(result);
        MyMethod.myFooter(1);//Ending statement
    }
}
