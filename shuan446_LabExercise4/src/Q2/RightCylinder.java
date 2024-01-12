package Q2;

import LabQ3.MyMethod;

public class RightCylinder extends Geometric3DObject implements VolumeOf3DObjectsInterface{
    public RightCylinder(){}//Empty constructor
    public RightCylinder(double r, double h){
        super(r,h);
    }//Constructor assigns values
    public double getArea(){
        return Math.round(2* MyMethod.PI*getR()*(getR()+getH())*100.0)/100.0;
    }//Calculates the area and returns it
    public double getVolume(){return Math.round(Math.PI*Math.pow(getR(),2)*getH()*100.0)/100.0;
    }//Calculates the volume and returns it
    public String toString(){
        return "Given: Radius = " + Math.round(getR()*100.0)/100.0 +" cm, Height = " + Math.round(getH()*100.0)/100.0 + " cm";
    }//Overwrites toString method
}
