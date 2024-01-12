/*******************************************
 Shih Chen Huang
 251282167
 Feb 16, 2023
 The following code consists of getter and setter methods for StudentDemoClassShihChen class.
 *********************************************/
package Q2;

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
    //default values are set for Student()
    public Student(int sn, String fName, String lName){
     studentNumber = sn;
     firstName = fName;
     lastName = lName;
     emailAddress = "";
     yearOfBirth = 0;
    }
    //New variables are set with given input
    public int getStudentNumber(){
        return studentNumber;
    }
    //returns student number
    public String getName(){
        return firstName + " " + lastName;
    }
    //adds first and last name to return a full name
    public String getEmailAddress(){
        return emailAddress;
    }
    //returns email address
    public int getAge(){
        return 2023 - yearOfBirth;
    }
    //returns the age of the user by birth year
}
