package Q2;
import LabQ3.MyMethod;

public class WeeklySaleDataShihChen {
    private double[] sale;
    public WeeklySaleDataShihChen(){}//Default constructor
    //Assigns value to sale
    public WeeklySaleDataShihChen(double[] sale){
        this.sale = sale;
    }
    //Returns the average of the sales
    public double getAverageSale() {
        double avg = 0;
        for(int i = 0; i < sale.length; i++){
            avg += sale[i];
        }
        return avg/sale.length;
    }
    public double getHighestSale(){
        double top = sale[0];
        for(int i = 0; i < sale.length; i++){
            if(top < sale[i])
                top = sale[i];
        }
        return top;
    }
    //Returns the lowest sale by comparing each value in the array
    public double getLowestSale(){
        double bot = sale[0];
        for(int i = 0; i < sale.length; i++){
            if(bot > sale[i])
                bot = sale[i];
        }
        return bot;
    }
    //Returns the highest sale by comparing each value in the array
    public void displaySaleData(){
        System.out.print("[");
        for (int i = 0; i < sale.length; i++){
            System.out.print(sale[i]);
            System.out.print(", ");
        }
        System.out.print("\b\b]");
    }
    //Returns the standard deviation of the values
    public double getStandardDeviation() {
        double sum =0;
        for(int i = 0; i < sale.length; i++){
            sum += MyMethod.myPow(sale[i]-getAverageSale(),2);
        }
        return Math.sqrt(sum/sale.length);
    }
}
