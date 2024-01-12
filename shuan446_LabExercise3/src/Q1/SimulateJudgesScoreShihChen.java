package Q1;
import LabQ3.MyMethod;
public class SimulateJudgesScoreShihChen {
    public static void populateArray(double[] anyName){
        double randNum;//initializes randNum
        for(int i=0; i<anyName.length; i++){
            randNum=(Math.random()*(3.0)+7.0);
            anyName[i]=randNum;
        }
        //Randomly generates number from 7 to 10 and assigns accordingly to each array pos
    }
    public static void displayArray(double[] anyName){
        System.out.print("[");//Starting bracket
        for(int i=0; i<anyName.length; i++){
            System.out.printf("%.2f, ",anyName[i]);
        }
        //Prints out each score
        System.out.println("\b\b]");//Ending bracket while removing extra characters/whitespace
    }
    public static double finalScore(double[] anyName) {
        double[] copy = new double[anyName.length];//Initializes new array with same length as anyName
        System.arraycopy(anyName, 0, copy, 0, anyName.length);//Clones anyName array to copy array
        double maxNum = copy[0];
        int maxPos = 0;
        //New variables to find max score and the position
        for (int i = 0; i < anyName.length; i++) {
            if (copy[i] > maxNum) {
                maxNum = copy[i];
                maxPos = i;
            }
        }
        //Finds the maxValue and the position and assigns to the variables

        double minNum = copy[0];
        int minPos = 0;
        //New variables to find min score and the position
        for (int i = 1; i < anyName.length; i++) {
            if (copy[i] < minNum) {
                minNum = copy[i];
                minPos = i;
            }
        }
        //Finds the minValue  and the position and assigns to the variables

        System.out.printf("\tHighest Score: %.2f\n", maxNum);
        System.out.printf("\tLowest Score: %.2f\n", minNum);
        //Prints out the Highest and Lowest score
        copy[maxPos] = 0;
        copy[minPos] = 0;
        //Sets the max and min values to 0
        System.out.println("Here are the scores after discarding the highest and the lowest scores: ");
        displayArray(copy);
        //Displays the updated array

        double average = 0;
        for (int i= 0; i < anyName.length; i++) {
            if (copy[i] != 0.0)
                average += copy[i];
        }
        return average/3;
    }
    //returns the average of the remaining numbers
    public static void main(String[] args){
        MyMethod.myHeader(3,1,"Simulates judges giving scores then averages them out.");//Prints the header
        double[]contestantArray = new double[5];//Creates a empty array of size 5
        System.out.println("Here are the scores from 5 Judges:");
        populateArray(contestantArray);//Assigns values to the array
        displayArray(contestantArray);//Prints the array
        System.out.printf("The final score: %.2f\n", finalScore(contestantArray));//Prints out the final score
        System.out.println();
        MyMethod.myFooter(1);//Prints the footer
    }
}
