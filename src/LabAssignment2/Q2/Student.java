package LabAssignment2.Q2;

public class Student {
    private int studentNumber;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private int yearOfBirth;
    public Student(){
    studentNumber = 251282167;
    firstName = "Shih Chen";
    lastName = "Huang";
    emailAddress = "shuan446@uwo.ca";
    yearOfBirth = 2004;
    }
    public Student(int sn, String fName, String lName){
     studentNumber = sn;
     firstName = fName;
     lastName = lName;
     emailAddress = "";
     yearOfBirth = 0;
    }
    public int getStudentNumber(){
        return studentNumber;
    }
    public String getName(){
        return firstName + " " + lastName;
    }
    public String getEmailAddress(){
        return emailAddress;
    }
    public int getAge(){
        return 2023 - yearOfBirth;
    }
}
