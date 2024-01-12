package Q2;
import LabQ3.MyMethod;

public class DemoBinaryToDecimal {
    public static void main(String[] args){
        MyMethod.myHeader(3,2,"Converts Binary to Decimal value with other functions.");//Prints header
        int[] intArray = new int[4];//New array of size 4
        for(int i=0; i<intArray.length; i++){
            int randNum=(int)(Math.random()*(2));
            intArray[i]=randNum;
        }
        //Creates a new array and assigns 1's and 0's at random
        BinaryToDecimalShihChen firstArray = new BinaryToDecimalShihChen(intArray);//First BinaryToDecimalYourFirstName type reference variable
        System.out.print("The 4 bit number: ");
        firstArray.displayArray();//Displays array
        System.out.printf("The corresponding decimal value is: %d\n", firstArray.getDecimalValue());
        firstArray.doubleTheSizeZeroPadding();//Doubles the size and adds 0's to the front
        System.out.print("The 8 bit number, after the size is doubled and zero padded: ");
        firstArray.displayArray();//Displays array
        System.out.printf("The corresponding decimal value is: %d\n", firstArray.getDecimalValue());
        firstArray.reverseArray();//Reverses the array
        System.out.print("The 8 bit number, after reversing the array: ");
        firstArray.displayArray();//Displays array
        System.out.printf("The corresponding decimal value is: %d\n", firstArray.getDecimalValue());
        BinaryToDecimalShihChen secondArray = firstArray;//Second BinaryToDecimalYourFirstName type reference with previous array
        secondArray.shiftRight();//Shifts the array to the right
        System.out.print("The 8 bit number, after the shift right operation: ");
        secondArray.displayArray();//Displays array
        System.out.printf("The corresponding decimal value is: %d\n", secondArray.getDecimalValue());
        secondArray.shuffleArray();//Shuffles the array
        System.out.print("The 8 bit number, after the shuffling operation: ");
        secondArray.displayArray();//Displays array
        System.out.printf("The corresponding decimal value is: %d\n", secondArray.getDecimalValue());
        System.out.println();//Spacer
        MyMethod.myFooter(2);//Prints the footer
    }
}
