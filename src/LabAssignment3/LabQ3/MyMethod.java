package LabAssignment3.LabQ3;

public class MyMethod {
    final public static double PI = 3.141592653589793;
    public static double myPow(double x, int y){
        double xTemp = 1;
        if(y>0) {
            for (int i = 0; i < y; i++) {
                xTemp = xTemp * x;
            }
            return xTemp;
        }
        if(y<0){
            for(int i = 0; i < Math.abs(y); i++){
                xTemp = xTemp * x;
            }
            return 1/xTemp;
        }
        else
            return 1;
    }
    public static double myFactorial(int n){
        double nTemp = n;
        if(n == 0)
            return 1;
        else{
            for (int i = 1; i < n; i++){
            nTemp *= i;
            }
        }
        return nTemp;
    }
    public static double mySin(double x){
        double sinTemp = 0;
        for(int i = 0; i < 20; i++) {
        sinTemp += myPow(-1,i)/myFactorial(2*i+1)*myPow(x,2*i+1);
        }
        return sinTemp;
    }
    public static double myCos(double x){
        double cosTemp = 0;
        for(int i = 0; i < 20; i++) {
            cosTemp += myPow(-1,i)/myFactorial(2*i)*myPow(x,2*i);
        }
        return cosTemp;
    }
    public static double myDegreeToRadian(double degree){
        return degree*PI/180;
    }
    public static char myToLowerCase(char c){
        if(c>=65 && c<=90){
            c += 32;
            return c;
        }
        else{
            return c;
        }
    }
    public static void myHeader(int labNum, int questionNum, String description){
        System.out.println("****************************************************\n" +
                "Full Name: Shih Chen Huang.\n"+
                "Lab Exercise: " + labNum + ", Question: " + questionNum + "\n"+
                "Program Description: " + description +"\n"+
                "*****************************************************\n");
    }
    //Prints out name, lab number, question number, and description
    public static void myFooter(int questionNumber){
        System.out.println("*** Signing off from Question " + questionNumber + " – Shih Chen ***");
    }
    //Prints out ending note
}
