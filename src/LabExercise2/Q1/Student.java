/*
Name: Shih Chen Huang
Date: March 1, 2023
Student Number: 251282167
Description: This program contains methods and fields that are used in StudentGradesByShihChen
*/
package LabExercise2.Q1;

public class Student {
    private String name;
    private int studentNumber;
    private int score;
    //Initialises variables.
    public Student(){
        name = "Shih Chen Huang";
        studentNumber = 251282167;
        score = 100;
    }//Assigns values to variables
    public Student(String nm, int sn, int sc){
        name = nm;
        studentNumber = sn;
        score = sc;
    }//Reassigns values to variables with the provided arguments
    public void printInfo(){
        System.out.printf("%-20s %-20d %-3d (Letter Grade: %-2s)\n",name, studentNumber, score, getLetterGrade());
    }//Prints out the student information with given formatting
    public String getName(){
        return name;
    }//Gets name of student
    public int getScore(){
        return score;
    }//Gets score of student
    public void setName(String nm){
        name = nm;
    }//Sets name of student
    public void setStudentNumber(int sn) {
        studentNumber = sn;
    }//Sets student number of student
    public void setScore(int sc){
        score=sc;
    }//Sets score of student
    public String getLetterGrade(){
        if(score>=90)
            return "A+";
        else if (score>=80)
            return "A-";
        else if (score>=70)
            return "B+";
        else if (score>=60)
            return "B-";
        else if (score>=50)
            return "C+";
        else if (score>=40)
            return "C-";
        else if (score>=30)
            return "D";
        else
            return "F";
    }//Checks which letter grade student's score is equivalent to
}
