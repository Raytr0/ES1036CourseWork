/*******************************************
 Shih Chen Huang
 251282167
 Feb 16, 2023
 The following code consists of getter and setter methods for CircleInfoShihChen class.
 *********************************************/
package Q1;

public class Circle {
    public double radius;//Initialises radius variable
    public void setRadius(double rad){
        radius = rad;
    }
    //Sets radius equal to input rad
    public double getRadius(){
        return radius;
    }
    //returns radius value
    public double getArea(){
        return Math.PI * Math.pow(radius,2);
    }
    //uses radius variable to calculate area and returns it
    public double getDiameter(){
        return radius*2;
    }
    //uses radius variable to get diameter and returns it.
    public double getCircumference(){
        return 2*Math.PI*radius;
    }
    //returns calculated circumference
}
