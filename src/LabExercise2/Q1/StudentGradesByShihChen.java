package LabExercise2.Q1;
import java.util.Scanner;

public class StudentGradesByShihChen {
    public static Scanner input = new Scanner(System.in);
    public static int counter = 0;
    public static void main(String[] args){
        myHeader(2,1,"description");
        Student s1 = new Student();
        System.out.println("Here is my grade info:");
        s1.printInfo();
        System.out.println("Data entry follows..... \n");
        Student s2 = new Student();
        dataEntry(s1);
        dataEntry(s2);
        System.out.println("Here is the detail info..");
        System.out.printf("Name");
        s1.printInfo();
        s2.printInfo();
    }
    public static void dataEntry(Student s){
        counter++;
        System.out.println("Student " + counter + ":");
        System.out.print("Enter Student Number: ");
        int studentNum = input.nextInt();
        System.out.print("Enter Student's Full Name: ");
        input.nextLine();
        String studentName = input.nextLine();
        System.out.print("Enter " + studentName + "'s score: ");
        int studentScore = input.nextInt();
        s.setStudentNumber(studentNum);
        s.setName(studentName);
        s.setScore(studentScore);
    }
    public static int compareGrades(Student s1, Student s2){
        if(s1.getScore()>s2.getScore())
            return 1;
        else if (s2.getScore()>s1.getScore())
            return -1;
        else
            return 0;
    }
    public static void myHeader(int labNum, int questionNum, String description){
        System.out.println("****************************************************\n" +
                "Full Name: Shih Chen Huang.\n"+
                "Lab Exercise: " + labNum + ", Question: " + questionNum + "\n"+
                "Program Description: " + description +".\n"+
                "*****************************************************\n");
    }
    //Prints out name, lab number, question number, and description
    public static void myFooter(int questionNumber){
        System.out.println("*** Signing off from Question " + questionNumber + "– Shih Chen ***");
    }
    //Prints out ending note
}
