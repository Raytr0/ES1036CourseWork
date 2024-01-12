package Q2;

public abstract class Geometric3DObject {
    //New private double variables
    private double r;
    private double h;
    protected Geometric3DObject(){}
    protected Geometric3DObject(double r, double h){
        this.r = r;
        this.h = h;
    }//Assigns values to variables
    public double getR(){
        return r;
    }//Returns r value
    public double getH(){
        return h;
    }//Returns the h value
    public abstract double getArea();//Gets area from other implemented methods
    public String toString(){
        return "Given: Radius = " + r + " cm, Height = " + h + "cm";
    }
    //Overwrites the toString method

}
