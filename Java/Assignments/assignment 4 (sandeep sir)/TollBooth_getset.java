import java.util.Scanner;

class TollBoothRevenueManager {
	
       float carRate, truckRate, motorcycleRate;
      int totalcar, totaltruck, totalmotorcycle;
	  public TollBoothRevenueManager(float carRate, float truckRate, float motorcycleRate, int totalcar, int totaltruck, int totalmotorcycle  ) {
		
		this.carRate = carRate;
		this.truckRate = truckRate;
		this.motorcycleRate = motorcycleRate;
		this.totalcar = totalcar;
		this.totaltruck = totaltruck;
		this.totalmotorcycle = totalmotorcycle;
	}
	public double getCarRate() {
		return carRate;
	}
	public void setCarRate(float carRate) {
		this.carRate = carRate;
	}
	public double getTruckRate() {
		return truckRate;
	}
	public void setTruckRate(float truckRate) {
		this.truckRate = truckRate;
	}
	public double getMotorcycleRate() {
		return motorcycleRate;
	}
	public void setMotorcycleRate(float motorcycleRate) {
		this.motorcycleRate = motorcycleRate;
	}
	public int getCarCount() {
		return totalcar;
	}
	public void setCarCount(int totalcar) {
		this.totalcar = totalcar;
	}
	public int getTruckCount() {
		return totaltruck;
	}
	public void setTruckCount(int totaltruck) {
		this.totaltruck = totaltruck;
	}
	public int getMotorcycleCount() {
		return totalmotorcycle;
	}
	public void setMotorcycleCount(int totalmotorcycle) {
		this.totalmotorcycle = totalmotorcycle;
	}
    
    // Calculations
	public double calculateRevenue  () {
		
		 return (carRate * totalcar) + (truckRate * totaltruck) + (motorcycleRate * totalmotorcycle);
		
	}
	
	public String toString() {
		
		
		int totalVehicles = totalcar + totaltruck + totalmotorcycle;		       
		double totalRevenue = calculateRevenue();    
		
		return "Total number of vehicles :" + totalVehicles + "\n" + "Total revenue collected: " + totalRevenue ;                   
        
	}	
}

class Util {
	
	Scanner sc = new Scanner(System.in);
	
	TollBoothRevenueManager tb;
	
	
	public void acceptRecord() {
		
		System.out.print("Toll rate for Car : ");
        double carRate = sc.nextDouble();

        System.out.print("Toll rate for Truck : ");
        double truckRate = sc.nextDouble();

        System.out.print("Toll rate for Motorcycle : ");
        double motorcycleRate = sc.nextDouble();
			
		System.out.print("Enter the number of Cars passed the toll : ");
        int totalcar = sc.nextInt();

        System.out.print("Enter the number of Trucks  passed the toll : ");
        int totaltruck = sc.nextInt();

        // Accepting the number of motorcycles
        System.out.print("Enter the number of Motorcycles  passed the toll : ");
        int totalmotorcycle = sc.nextInt();
		
		tb = new TollBoothRevenueManager(totalmotorcycle, totalmotorcycle, totalmotorcycle, totalcar, totaltruck, totalmotorcycle);
		
	}

	public void printRecord() {
		
		System.out.printf(tb.toString());
		
	}
	public int menuList() {
		
		
		System.out.println("1. Enter details");
		System.out.println("2. Revenue Details ");
		System.out.println("3. Exit");
		System.out.print("Enter Choice : ");
		
		return sc.nextInt();
	}
	
}

public class TollBooth_getset {
	public static void main(String[] args) {
		
		Util util = new Util();
		
		int choice;		
		while((choice = util.menuList()) != 3){
			switch(choice){
				case 1:
					util.acceptRecord();
					break;
				case 2:
					util.printRecord();
					break;
				default:
					System.out.println("Invalid choise.");
					break;
			}
		}
	}
}


