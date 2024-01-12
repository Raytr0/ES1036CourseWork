package Q1;

public class Name {
    private String firstName;
    private String lastName;
    public Name(){}//Empty default constructor
    public Name(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }//Assigns values to variables
    public String toString(){
        return "Name: " + firstName + " " + lastName + "\n";
    }//Overwrites toString method with given information
}
