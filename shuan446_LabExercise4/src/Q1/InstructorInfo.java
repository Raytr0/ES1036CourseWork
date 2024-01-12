package Q1;

public class InstructorInfo extends Name{
    private String officeLocation;
    public InstructorInfo(){}//Empty default constructor
    public InstructorInfo(String fN, String lN, String oL){
        super(fN,lN);
        officeLocation = oL;
    }//Writes values to parent and assigns value to officeLocation
    public String toString(){
        return super.toString() + "Office Location: " + officeLocation;
    }
}//Overwrites toString method with given information
