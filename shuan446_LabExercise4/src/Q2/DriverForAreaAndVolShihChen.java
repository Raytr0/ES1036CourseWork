package Q2;

import LabQ3.MyMethod;

import java.util.Scanner;

public class DriverForAreaAndVolShihChen {
    public static void populateArrays(Geometric3DObject[] x, int y) {
        if (y == 1) {
            for (int i = 0; i < x.length; i++) {
                double r = 2 + Math.random();
                double h = 4 + Math.random() * 3;
                x[i] = new RightCylinder(r, h);
            }
        }//Assigns randomly calculated values to RightCylinder
        else if (y == 2) {
            for (int i = 0; i < x.length; i++) {
                double r = 2 + Math.random();
                double h = 4 + Math.random() * 3;
                x[i] = new RightCircularCone(r, h);
            }
        }//Assigns randomly calculated values to RightCircularCone
    }
    public static void printArrays(Geometric3DObject[] x, int y){
        if (y == 1) {
            for (int i = 0; i < x.length; i++) {
                System.out.println("Cylinder " + (i+1) + ": \n-------------\n" + x[i].toString());
                System.out.println("Cone's volume: " + ((VolumeOf3DObjectsInterface)x[i]).getVolume() + "  cubic cm");
                System.out.println("Cylinder's surface area: " + x[i].getArea() + " sq. cm\n");
            }
        }//Prints out all calculated fields for each Cylinder
        else if (y == 2) {
                for (int i = 0; i < x.length; i++) {
                    System.out.println("Cone " + (i+1) + ": \n-------------\n" + x[i].toString());
                    System.out.println("Cone's volume: " + ((VolumeOf3DObjectsInterface)x[i]).getVolume() + "  cubic cm");
                    System.out.println("Cone's surface area: " + x[i].getArea() + " sq. cm\n");
            }
        }//Prints out all calculated fields for each Cone
    }
    public static double maxVolume(Geometric3DObject[] x){
        double max = 0;
        for (int i = 0; i < x.length; i++) {
            if(max < ((VolumeOf3DObjectsInterface)x[i]).getVolume())
                max = ((VolumeOf3DObjectsInterface)x[i]).getVolume();
        }
        return max;
    }//Finds the max Volume of Cone or Cylinder and returns the value
    public static void main(String[] args){
        MyMethod.myHeader(4,2,"Calculates cylinders and cones.");
        Scanner input = new Scanner(System.in);
        System.out.print("How many Cylindrical objects you need to measure: ");
        int cy = input.nextInt();//Prompts user to enter number of cylinders
        Geometric3DObject[] cylinder = new RightCylinder[cy];//New array for cylinders
        populateArrays(cylinder, 1);//Calls method to assign values
        printArrays(cylinder,1);//Prints out results
        System.out.println("The cylinder with the maximum volume is " + maxVolume(cylinder) + " cubic cm");//Prints out highest volume of all cylinders
        System.out.println("=====================================================");
        System.out.print("How many Conical objects you need to measure: ");
        int cn = input.nextInt();//Prompts user to enter number of cones
        Geometric3DObject[] cone = new RightCircularCone[cn];//New array for cones
        populateArrays(cone, 2);//Calls method to assign values
        printArrays(cone,2);//Prints out results
        System.out.println("The cone with the maximum volume is " + maxVolume(cone) + " cubic cm\n");//Prints out highest volume of all cones
        MyMethod.myFooter(2);
    }
}
