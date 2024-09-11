
package A3;
import java.util.Scanner;

class TollBoothRevenueManager  {

    float CarRate, truckRate, motorcycleRate, totalRevenue;
    int totalcar, totaltruck, totalmotorcycle;
   
    public void setTollRates() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Car toll rate  : rs ");
        CarRate = sc.nextFloat();

        System.out.print("Enter Truck toll rate : rs");
        truckRate = sc.nextFloat();

        System.out.print("Enter Motorcycle toll rate  : rs ");
        motorcycleRate = sc.nextFloat();
    }
  
    public void acceptRecord() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total Cars that passed toll : ");
        totalcar = sc.nextInt(); 
        System.out.println("Enter total Trucks that passed toll : ");
        totaltruck = sc.nextInt();
        System.out.println("Enter total Motorcycles that passed toll : ");
        totalmotorcycle= sc.nextInt();
    }

    public void calculateRevenue() {
        totalRevenue = (totalcar * CarRate) + (totaltruck * truckRate) + (totalmotorcycle * motorcycleRate);
    }

    public void printRecord() {
        int totalVehicles = totalcar + totaltruck+ totalmotorcycle;
        System.out.println("Total number of vehicles passed: " + totalVehicles);
        System.out.println("Total revenue collected: rs " + totalRevenue);
    }
    
}

public class Toll_Booth{
    public static void main(String[] args) {
        TollBoothRevenueManager tollBooth = new TollBoothRevenueManager();
        tollBooth.setTollRates();
        tollBooth.acceptRecord();
        tollBooth.calculateRevenue();
        tollBooth.printRecord();
    }
}


