package LabAssignment2.Q2;
import Q1.CircleInfoShihChen;

public class StudentDemoClassShihChen {
    public static void main(String[] args){
        CircleInfoShihChen.myHeader(2,2,"Prints out student information.");
        Student student = new Student();
        System.out.printf("Here is my information:\n" +
                "=======================\n" +
                "I am %s\n" +
                "Student Number: %d\n" +
                "Email address: %s\n" +
                "Age: %d\n"+
                "\n", student.getName(), student.getStudentNumber(), student.getEmailAddress(), student.getAge());
        Student student1 = new Student(250221375,"Addie","Slowgrave");
        Student student2 = new Student(250309716,"Talia", "Hanscom");
        System.out.println("Here is the info on other students:");
        System.out.printf("==========================\n" +
                "Number%4sName\n" +
                "========= ================\n" +
                "%d %s\n" +
                "%d %s\n" +
                "==========================\n", "",student1.getStudentNumber(),student1.getName(),student2.getStudentNumber(),student2.getName());
        CircleInfoShihChen.myFooter(2);
    }
}
