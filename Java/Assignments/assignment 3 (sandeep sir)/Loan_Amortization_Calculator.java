
package A3;
import java.util.Scanner;

class LoanAmortizationCalculator  {
    double principal, annualInterestRate, loanTerm;
    double monthlyPayment;

    void acceptRecord(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal amount: ");
        principal = sc.nextDouble();
        System.out.print("Enter annual interest rate (in %): ");
        annualInterestRate = sc.nextDouble();
        System.out.print("Enter loan duration in months: ");
        loanTerm = sc.nextDouble();
    }

    void calculateMonthlyPayment() {
        double monthlyInterestRate = (annualInterestRate / 12) / 100;
        monthlyPayment = principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, loanTerm))   / (Math.pow(1 + monthlyInterestRate, loanTerm) - 1);

    }

    void printRecord() {
        double totalPayment = monthlyPayment * loanTerm;
        System.out.println("Monthly Payment to be paid: ₹" + monthlyPayment);
        System.out.println("Total Amount to be Paid: ₹" + totalPayment);
    }
}

public class Loan_Amortization_Calculator{
    public static void main(String[] args) {
        LoanAmortizationCalculator Calc = new LoanAmortizationCalculator();
        Calc.acceptRecord(); 
        Calc.calculateMonthlyPayment();
        Calc.printRecord();
    }
}
