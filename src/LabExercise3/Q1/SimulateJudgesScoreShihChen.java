package LabExercise3.Q1;
import LabQ3.MyMethod;
public class SimulateJudgesScoreShihChen {
    public static void populateArray(double[] anyName){
        double randNum;
        for(int i=0; i<anyName.length; i++){
            randNum=(Math.random()*(3.0)+7.0);
            anyName[i]=randNum;
        }
    }
    public static void displayArray(double[] anyName){
        System.out.print("[");
        for(int i=0; i<anyName.length; i++){
            System.out.printf("%.2f, ",anyName[i]);
        }
        System.out.println("\b\b]");
    }
    public static double finalScore(double[] anyName) {
        double[] copy = new double[anyName.length];
        System.arraycopy(anyName, 0, copy, 0, anyName.length);
        double maxNum = 0;
        int maxPos = 0;
        for (int i = 0; i < anyName.length; i++) {
            if (copy[i] > maxNum) {
                maxNum = copy[i];
                maxPos = i;
            }
        }

        double minNum = copy[0];
        int minPos = 0;
        for (int i = 1; i < anyName.length; i++) {
            if (copy[i] < minNum) {
                minNum = copy[i];
                minPos = i;
            }
        }
        System.out.printf("\tHighest Score: %.2f\n", maxNum);
        System.out.printf("\tLowest Score: %.2f\n", minNum);
        copy[maxPos] = 0;
        copy[minPos] = 0;
        System.out.println("Here are the scores after discarding the highest and the lowest scores: ");
        displayArray(copy);

        double average = 0;
        for (int i= 0; i < anyName.length; i++) {
            if (copy[i] != 0.0)
                average += copy[i];
        }
        return average/3;
    }
    public static void main(String[] args){
        MyMethod.myHeader(3,1,"Simulates judges giving scores then averages them out.");
        double[]contestantArray = new double[5];
        System.out.println("Here are the scores from 5 Judges:");
        populateArray(contestantArray);
        displayArray(contestantArray);
        System.out.printf("The final score: %.2f\n", finalScore(contestantArray));
        System.out.println();
        MyMethod.myFooter(1);
    }
}
