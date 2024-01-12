package Q1;
import LabQ3.MyMethod;

public class DemoCourseGradeShihChen {
    public static void main(String[] args){
        MyMethod.myHeader(4,1,"Calculates the individual grades and final course grade of student.");
        CourseAndInstructor cInfo = new CourseAndInstructor("Programming Fundamentals", "Quazi", "Rahman", "TEB263");
        StudentInfo sInfo = new StudentInfo("Shih Chen", "Huang", 251282167, cInfo);
        System.out.print("Student " + sInfo);
        //Prints out the student, instructor, and course information.
        System.out.println("=============================================");
        System.out.println("    Score Card (Based on the rounded Score)");
        System.out.println("=============================================");
        double[] labG = {15.0, 15.0, 15.0, 15.0, 15.0, 15.0, 15.0};
        GradeActivity avgLabG = new GradeActivity(labG,15);
        //Calculates lab average
        System.out.println("Lab Grade: " + avgLabG);
        double[] quizG = {20,19.34,19.17};
        GradeActivity avgQuizG = new GradeActivity(quizG,20);
        //Calculates quiz average
        System.out.println("Quiz Grade: " + avgQuizG);
        GradeActivity midtermG = new GradeActivity(19.625,25);
        //Calculates midterm grade
        System.out.println("Midterm Grade: " + midtermG);
        GradeActivity finalG = new GradeActivity(38,40);
        //Calculates final grade
        System.out.println("Final Grade: " + finalG);
        //Assigns grade values, calculates the letter corresponding to the score, and prints it out
        System.out.println("============================================================");
        double[] finalScore = {finalG.getScore(), avgLabG.getScore(), midtermG.getScore(), avgQuizG.getScore()};
        GradeActivity courseG = new GradeActivity(finalScore,100);
        System.out.println("Course Grade: " + courseG);
        //Prints out the final course grade after adding all previous grades
        System.out.println("============================================================");
        GradeActivity avgBonusG = new GradeActivity(5,5);
        System.out.println("Average Bonus Grade: " + avgBonusG);
        GradeActivity reportedFinalG = new GradeActivity(courseG.getScore()+ avgBonusG.getScore(),100);
        System.out.println("Average Bonus Grade: " + reportedFinalG);
        //Prints out the reported final grade after adding the bonus marks
        System.out.println("==========================================================================\n");
        MyMethod.myFooter(1);

    }
}
