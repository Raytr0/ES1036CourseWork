package Q1;

public class GradeActivity {
    //New empty variables
    private double[] grade;
    private double score;
    private int outOf;
    private double percentScore;
    public GradeActivity(){}//Empty default constructor
    public GradeActivity(double score, int outOf){
        this.outOf = outOf;
        this.score = score;
    }//Assigns values
    public GradeActivity(double[] grade, int outOf){
        this.outOf = outOf;
        this.grade = grade;
        double sum = 0;
        //Assigns values
        for(int i = 0; i< grade.length; i++){
            sum+= grade[i];
        }//Adds all grades up
        if(outOf == 100)
            score = sum;
        else
            score = sum/ grade.length;
        //Checks for score conditions
    }
    public double getScore() {
        return score;
    }//Returns score
    public String getLetterGrade(){
        percentScore = score/outOf*100;
        if(Math.round(percentScore) >=90) return "A+";
        else if(Math.round(percentScore) >=80) return "A";
        else if(Math.round(percentScore) >=70) return "B";
        else if(Math.round(percentScore) >=60) return "C";
        else if(Math.round(percentScore) >=50) return "D";
        else return "F";
    }//Checks for the letter corresponding to the score
    @Override
    public String toString() {
        //The arguments of String.format() is written in the same way as the arguments of printf()
        return String.format("%.2f (out of %d), Letter Grade: %s [%d%%]", score,outOf, getLetterGrade(),Math.round(percentScore));
    }//Overwrites toString method with given information
}