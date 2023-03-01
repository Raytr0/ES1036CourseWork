package LabExercise2.Q1;

public class Student {
    private String name;
    private int studentNumber;
    private int score;
    public Student(){
        name = "Shih Chen Huang";
        studentNumber = 251282167;
        score = 100;
    }
    public Student(String nm, int sn, int sc){
        name = nm;
        studentNumber = sn;
        score = sc;
    }
    public void printInfo(){
        System.out.printf("%-20s %-20d %-3d %-2s\n",name, studentNumber, score, getLetterGrade());
    }
    public String getName(){
        return name;
    }
    public int getScore(){
        return score;
    }
    public void setName(String nm){
        name = nm;
    }
    public void setStudentNumber(int sn) {
        studentNumber = sn;
    }
    public void setScore(int sc){
        score=sc;
    }
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
    }
}
