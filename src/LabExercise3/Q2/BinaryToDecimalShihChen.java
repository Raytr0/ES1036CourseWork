package LabExercise3.Q2;
import LabQ3.MyMethod;

public class BinaryToDecimalShihChen {
    private int[] binaryArray;
    public BinaryToDecimalShihChen(){

    }
    public BinaryToDecimalShihChen(int[] myArray){
        binaryArray = myArray;
    }
    public void displayArray(){
        System.out.print("[");
        for(int i=0; i<binaryArray.length; i++){
            System.out.printf("%d ",binaryArray[i]);
        }
        System.out.println("\b]");
    }
    public int getDecimalValue(){
        int sum = 0;
        for (int i = 0; i < binaryArray.length; i++)
            sum += binaryArray[i]*MyMethod.myPow(2,i);
        return sum;
    }
    public void doubleTheSizeZeroPadding(){
        int[] tempArr = new int[binaryArray.length * 2];
        System.arraycopy(binaryArray, 0, tempArr, 4, binaryArray.length);
        binaryArray = tempArr;
    }
    public void shuffleArray(){
        int j; int temp;
        for(int i = 0; i<binaryArray.length; i++) {
            j = (int)(Math.random()*binaryArray.length);
            temp = binaryArray[i];
            binaryArray[i]= binaryArray[j];
            binaryArray[j] = temp;
        }
    }
    public int[] reverseArray(){
        int [] reverse = new int[binaryArray.length];
        for(int i=0, j=binaryArray.length-1; i<binaryArray.length; i++, j--)
            reverse[i]=binaryArray[j];
        binaryArray = reverse;
        return binaryArray;
    }
    public void shiftRight(){
        int temp = binaryArray[binaryArray.length-1];
        for(int i = binaryArray.length-1; i>0; i--)
            binaryArray[i]= binaryArray[i-1];
        binaryArray[0]=temp;
    }

}
