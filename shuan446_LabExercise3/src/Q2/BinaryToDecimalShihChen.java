package Q2;
import LabQ3.MyMethod;

public class BinaryToDecimalShihChen {
    private int[] binaryArray;
    public BinaryToDecimalShihChen(){}
    //Empty constructor
    public BinaryToDecimalShihChen(int[] myArray){
        binaryArray = myArray;
    }
    //Constructor that assigns value
    public void displayArray(){
        System.out.print("[");
        for(int i=0; i<binaryArray.length; i++){
            System.out.printf("%d ",binaryArray[i]);
        }
        System.out.println("\b]");
    }//Prints out the array
    public int getDecimalValue(){
        int sum = 0;
        for (int i = 0; i < binaryArray.length; i++)
            sum += binaryArray[i]*MyMethod.myPow(2,binaryArray.length-i-1);
        return sum;
    }//Calculates the decimal value of the array
    public void doubleTheSizeZeroPadding(){
        int[] tempArr = new int[binaryArray.length * 2];//Creates a temp array double the size of original
        System.arraycopy(binaryArray, 0, tempArr, binaryArray.length, binaryArray.length);//Copies the array to the temp array
        binaryArray = tempArr;//Reassigns the temp array values to the original array
    }
    //Doubles the array and adds zeros to the front
    public void shuffleArray(){
        int j; int temp;
        for(int i = 0; i<binaryArray.length; i++) {
            j = (int)(Math.random()*binaryArray.length);
            temp = binaryArray[i];
            binaryArray[i]= binaryArray[j];
            binaryArray[j] = temp;
        }
    }
    //Randomly shuffles the locations of the values of the array
    public int[] reverseArray(){
        int [] reverse = new int[binaryArray.length];
        for(int i=0, j=binaryArray.length-1; i<binaryArray.length; i++, j--)
            reverse[i]=binaryArray[j];
        binaryArray = reverse;
        return binaryArray;
    }
    //Reverses the array
    public void shiftRight(){
        int temp = binaryArray[binaryArray.length-1];
        for(int i = binaryArray.length-1; i>0; i--)
            binaryArray[i]= binaryArray[i-1];
        binaryArray[0]=temp;
    }
    //Shifts all values of the array right by one position.
}
