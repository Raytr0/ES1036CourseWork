/*******************************************
 Shih Chen Huang
 251282167
 Feb 16, 2023
 The following code prints out the student information of the user and 2 additional student's information.
 *********************************************/
package Q2;
import Q1.CircleInfoShihChen;

public class StudentDemoClassShihChen {
    public static void main(String[] args){
        Q1.CircleInfoShihChen.myHeader(2,2,"Prints out student information.");
        //Prints out name, lab number, question number, and description
        Student student = new Student();
        //declares new student reference
        System.out.printf("Here is my information:\n" +
                "=======================\n" +
                "I am %s\n" +
                "Student Number: %d\n" +
                "Email address: %s\n" +
                "Age: %d\n"+
                "\n", student.getName(), student.getStudentNumber(), student.getEmailAddress(), student.getAge());
        //prints out default student information
        Student student1 = new Student(250221375,"Addie","Slowgrave");
        Student student2 = new Student(250309716,"Talia", "Hanscom");
        //declares 2 new student references
        System.out.println("Here is the info on other students:");
        System.out.printf("==========================\n" +
                "Number%4sName\n" +
                "========= ================\n" +
                "%d %s\n" +
                "%d %s\n" +
                "==========================\n", "",student1.getStudentNumber(),student1.getName(),student2.getStudentNumber(),student2.getName());
        //prints the student information of two students
        Q1.CircleInfoShihChen.myFooter(2);
        //prints ending statement
    }
}
