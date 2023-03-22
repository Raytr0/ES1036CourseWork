package LabExercise3.Q2;
import LabQ3.MyMethod;

public class DemoBinaryToDecimal {
    public static void main(String[] args){
        MyMethod.myHeader(3,2,"Binary to decimal");
        int[] intArray = new int[4];
        for(int i=0; i<intArray.length; i++){
            int randNum=(int)(Math.random()*(2));
            intArray[i]=randNum;
        }
        BinaryToDecimalShihChen firstArray = new BinaryToDecimalShihChen(intArray);
        System.out.print("The 4 bit number: ");
        firstArray.displayArray();
        System.out.printf("The corresponding decimal value is: %d\n", firstArray.getDecimalValue());
        firstArray.doubleTheSizeZeroPadding();
        System.out.print("The 8 bit number, after the size is doubled and zero padded: ");
        firstArray.displayArray();
        System.out.printf("The corresponding decimal value is: %d\n", firstArray.getDecimalValue());
        firstArray.reverseArray();
        System.out.print("The 8 bit number, after reversing the array: ");
        firstArray.displayArray();
        System.out.printf("The corresponding decimal value is: %d\n", firstArray.getDecimalValue());
        BinaryToDecimalShihChen secondArray = firstArray;
        secondArray.shiftRight();
        System.out.print("The 8 bit number, after the shift right operation: ");
        secondArray.displayArray();
        System.out.printf("The corresponding decimal value is: %d\n", secondArray.getDecimalValue());
        secondArray.shuffleArray();
        System.out.print("The 8 bit number, after the shuffling operation: ");
        secondArray.displayArray();
        System.out.printf("The corresponding decimal value is: %d\n", secondArray.getDecimalValue());
        System.out.println();
        MyMethod.myFooter(2);
    }
}
