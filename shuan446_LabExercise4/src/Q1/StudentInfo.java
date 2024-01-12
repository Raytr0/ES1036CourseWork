package Q1;

public class StudentInfo extends Name{
    private int studentNumber;
    private CourseAndInstructor courseInfo;
    public StudentInfo(){}//Empty default constructor
    public StudentInfo(String fN, String lN, int sN, CourseAndInstructor cInfo){
        super(fN, lN);
        studentNumber = sN;
        courseInfo = cInfo;
    }//Writes values to parent and assigns value to studentNumber and courseInfo

    public String toString() {
        return super.toString() + "Student Number: " + studentNumber + "\n" + "Course Name: " + courseInfo + "\n";
    }//Overwrites toString method with given information
}
