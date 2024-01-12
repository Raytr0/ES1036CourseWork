package Q2;
import LabQ3.MyMethod;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WorkingWithFilesAndArrays {
    public static void main(String[] args) throws IOException {
        File txtFile = new File("C:\\Users\\Ryan.H\\Downloads\\Datafile_LabAssignment4.txt");//Gets file from directory
        Scanner inputFile = new Scanner(txtFile);//Initializes new Scanner
        double[] saleNum = new double[7];//Initializes new double array
        int i = 0;
        //Writes values from file to array
        while (inputFile.hasNext()) {
            saleNum[i] = inputFile.nextDouble();
            i++;
        }
        inputFile.close();
        WeeklySaleDataShihChen info = new WeeklySaleDataShihChen(saleNum);

        //Displays the sales data of the highest, lowest, average, and standard deviation of sales
        System.out.println("Here is this week's sale-data...");
        info.displaySaleData();
        System.out.printf("\nHighest weekly Sale: %.2f\nLowest weekly Sale: %.2f\nAverage weekly Sale: %.2f\nStandard Deviation of Weekly Sale: %.2f\n",
                info.getHighestSale(),info.getLowestSale(),info.getAverageSale(),info.getStandardDeviation());
        System.out.println(".. Updating the file with the above info...");
        System.out.println("Closed the file.....\n");

        FileWriter edit = new FileWriter(txtFile, true);//Opens file and allows for editing
        PrintWriter newFile = new PrintWriter(edit);
        //Writes the given lines to the file and closes it
        newFile.printf("\nHighest weekly Sale: %.2f\nLowest weekly Sale: %.2f\nAverage weekly Sale: %.2f\nStandard Deviation of Weekly Sale: %.2f\n",
                info.getHighestSale(),info.getLowestSale(),info.getAverageSale(),info.getStandardDeviation());
        newFile.print("\nReported by: Shih Chen Huang");
        newFile.close();
        MyMethod.myFooter(2);//Ending note
    }
}
