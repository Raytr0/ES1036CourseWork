package LabAssignment2.Q1;

public class Circle {
    public double radius;
    public void setRadius(double rad){
        radius = rad;
    }
    public double getRadius(){
        return radius;
    }
    public double getArea(){
        return Math.PI * Math.pow(radius,2);
    }
    public double getDiameter(){
        return radius*2;
    }
    public double getCircumference(){
        return 2*Math.PI*radius;
    }
}
