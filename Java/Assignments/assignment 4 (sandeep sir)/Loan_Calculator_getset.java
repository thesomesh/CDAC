import java.util.Scanner;

class LoanAmortizationCalculator{
	
	double principal, annualInterestRate, loanTerm;
	
	public LoanAmortizationCalculator(double principal, double annualInterestRate,double loanTerm) {
		this.principal = principal;
		this.annualInterestRate = annualInterestRate;
		this.loanTerm = loanTerm;		
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

	public double getLoanTerm() {
		return loanTerm;
	}

	public void setLoanTerm(int loanTerm) {
		this.loanTerm = loanTerm;
	}
	
	public double calculateMonthlyPayment() {
		
		double monthlyInterestRate = annualInterestRate / 12 / 100;
		
        double numberOfMonths = loanTerm * 12;
        
        double monthlyPayment = principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfMonths)) /
                (Math.pow(1 + monthlyInterestRate, numberOfMonths) - 1);
        
        return monthlyPayment;
		
	}
	public double totalLoanPayment() {
		
		return calculateMonthlyPayment() * loanTerm * 12;
	}
	
	public String toString() {
		
		return "Principal Amount : "+principal+ "\n"+
				"Annual Interest Rate : "+ annualInterestRate + "\n"+
				"Loan term : "+ loanTerm +" years\n"+
				"Monthly payment : "+ calculateMonthlyPayment() +"\n"+
				"Total Payment : "+ totalLoanPayment();
				
	}
	
}

class Util{
	
	private LoanAmortizationCalculator LAC;
	
	Scanner sc = new Scanner(System.in);

	public void acceptRecord() {
		
		System.out.print("Enter Principal Amount: ");
		double principal = sc.nextDouble();
		System.out.print("Enter Annual Interest Rate: ");
		double annualInterestRate = sc.nextDouble();
		System.out.print("Enter loan duration in years: ");
		int loanTerm = sc.nextInt();
		
		LAC = new LoanAmortizationCalculator(principal, annualInterestRate, loanTerm);
		
	}
	public void printRecord() {		
		System.out.println(LAC.toString());
	}
	public int menuList() {
		
		
		System.out.println("1. Enter Loan Details");
		System.out.println("2. Show Loan Amortization");
		System.out.println("3.Exit");
		System.out.print("Enter Choice : ");
		return sc.nextInt();
	}
	
}

public class Loan_Calculator_getset {

	public static void main(String[] args) {
		
		Util  util = new Util();
		
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
