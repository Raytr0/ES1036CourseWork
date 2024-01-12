package Q2;

import LabQ3.MyMethod;

public class RightCircularCone extends Geometric3DObject implements VolumeOf3DObjectsInterface{
    public RightCircularCone(){};//Empty constructor
    public RightCircularCone(double r, double h){
        super(r, h);
    }//Constructor to assign values
    public double getArea(){
        return Math.round(MyMethod.PI * getR() * (getR() + Math.sqrt(Math.pow(getH(),2)+Math.pow(getR(),2)))*100.0)/100.0;
    }//Calculates the area and returns it
    public double getVolume(){
        return Math.round(((MyMethod.PI*Math.pow(getR(),2)*getH())/3)*100.0)/100.0;
    }//Calculates the volume
    public String toString(){
        return "Given: Radius = " + Math.round(getR()*100.0)/100.0 +" cm, Height = " + Math.round(getH()*100.0)/100.0 + " cm";
    }//Overwrites the toString method
}
