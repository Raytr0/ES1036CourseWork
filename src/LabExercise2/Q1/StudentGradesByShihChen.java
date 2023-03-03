/*
Name: Shih Chen Huang
Date: March 1, 2023
Student Number: 251282167
Description: This program displays student information and user provided student information
*/
package LabExercise2.Q1;
import java.util.Scanner;

public class StudentGradesByShihChen {
    public static Scanner input = new Scanner(System.in); //initialises a new scanner
    public static int counter = 0; //initialises variable counter with value 0
    public static void main(String[] args){
        myHeader(2,1,"Obtains student information and compares grades.");//Header introduction
        Student s1 = new Student();//New student type variable s1
        System.out.println("Here is my grade info:");//Display text
        s1.printInfo();//Prints out student one's information

        System.out.println("\nData entry follows..... \n");//Display text for formatting
        Student s2 = new Student();//New student type variable s2
        dataEntry(s1);//Enters new information for student1
        System.out.println();//spacer
        dataEntry(s2);//Enters new information for student2

        System.out.println("\nHere is the detail info..");
        System.out.printf("%-20s %-20s Score (Letter Grade)\n","Name", "Student Number");
        System.out.println("---------------------------------------------------------------");
        s1.printInfo();
        s2.printInfo();
        System.out.println("---------------------------------------------------------------");
        //Prints out student 1 and student 2's detailed information given the updated inputs.

        if (compareGrades(s1, s2) == 1)
            System.out.println("Note: " + s1.getName() + " scored higher than " + s2.getName());
        else if (compareGrades(s1, s2) == -1)
            System.out.println("Note: " + s2.getName() + " scored higher than " + s1.getName());
        else
            System.out.println("Note: their scores are equal!");
        //Prints out a note based on the difference in score for the two students

        myFooter(1);//Ending text
    }
    public static void dataEntry(Student s){
        counter++;//increments counter by 1
        System.out.println("Student " + counter + ":");
        System.out.print("Enter Student Number: ");//prompts user input
        int studentNum = input.nextInt();//accepts user input
        System.out.print("Enter Student's Full Name: ");//prompts user input
        input.nextLine();//Clears input
        String studentName = input.nextLine();//accepts user input
        System.out.print("Enter " + studentName + "'s score: ");//prompts user input
        int studentScore = input.nextInt();//accepts user input
        s.setStudentNumber(studentNum);//Assigns new value
        s.setName(studentName);//Assigns new value
        s.setScore(studentScore);//Assigns new value
    }//Takes user input and updates the student's information
    public static int compareGrades(Student s1, Student s2){
        if(s1.getScore()>s2.getScore())
            return 1;
        else if (s2.getScore()>s1.getScore())
            return -1;
        else
            return 0;
    }//Checks the difference between the two students
    public static void myHeader(int labNum, int questionNum, String description){
        System.out.println("****************************************************\n" +
                "Full Name: Shih Chen Huang.\n"+
                "Lab Exercise: " + labNum + ", Question: " + questionNum + "\n"+
                "Program Description: " + description +"\n"+
                "*****************************************************\n");
    }
    //Prints out name, lab number, question number, and description
    public static void myFooter(int questionNumber){
        System.out.println("*** Signing off from Question " + questionNumber + "– Shih Chen ***");
    }
    //Prints out ending note
}
