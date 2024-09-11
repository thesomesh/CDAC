import java.util.Scanner;

class CompoundInterestCalculator1 {
	
 double principal,annualInterestRate;
 int numberOfCompounds,years;
	
    public CompoundInterestCalculator1(double principal, double annualInterestRate, int numberOfCompounds, int years) {
		
		this.principal = principal;
		this.annualInterestRate = annualInterestRate;
		this.numberOfCompounds = numberOfCompounds;
		this.years = years;
	}

	public double getPrincipal() {
		return principal;
	}

	public void setPrincipal(double principal) {
		this.principal = principal;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public int getNumberOfCompounds() {
		return numberOfCompounds;
	}

	public void setNumberOfCompounds(int numberOfCompounds) {
		this.numberOfCompounds = numberOfCompounds;
	}

	public int getYears() {
		return years;
	}

	public void setYears(int years) {
		this.years = years;
	}
	
    // Calculations
	public double calculateFutureValue() {
				 
        return(principal * Math.pow(1 + (annualInterestRate / 100) / numberOfCompounds, numberOfCompounds * years));
		
	}
	public double totalInterestEarned() {
		
		return(calculateFutureValue() - principal);
	}
	public String toString() {
		
		return "Future Value of Investment :"+ calculateFutureValue() + "\n" 
		+"Total Interest earned : "+totalInterestEarned()+"\n";
				
				
	}
	
    
}

class  Util {
	
	private CompoundInterestCalculator1 cal;
	
	static Scanner sc = new Scanner(System.in);
	public void acceptRecord() {
		
		
		System.out.print("Enter the initial amount to be invest :rs ");
		double principal = sc.nextDouble();
		
		System.out.print("Enter Annual Interest rate(%) : ");
		double annualInterestRate = sc.nextDouble();
		
		System.out.print("Enter number of times the interest is compounded per year");
		int numberOfCompounds = sc.nextInt();
		
		System.out.print("Enter the investment duration : ");
		int years = sc.nextInt();
		
		cal = new CompoundInterestCalculator1( principal, annualInterestRate, numberOfCompounds, years);
		
	}
	
	public void printRecord() {
		
		System.out.printf(cal.toString());
	
	}
	
      public int menuList() {
	System.out.println("1. Enter details:");
	System.out.println("2. Display Detail");
	System.out.println("3. Exit");
	System.out.print("Enter Choice ");
	return sc.nextInt();
		
		
	}
	
}


public class CI_getset {
	

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
					System.out.println("Invalid choice.");
					break;
			}
		}
		
	}
}
