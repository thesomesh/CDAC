package A3;

import java.util.Scanner;

 class cfv {
    double investment_amount, annualInterestRate, numberOfCompounds, years;
        
    public void acceptRecord() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the initial amount to be invest : ");
        investment_amount = sc.nextDouble();

        System.out.print("Enter annual interest rate (%): ");
        annualInterestRate = sc.nextDouble();

        System.out.print("Enter number of times interest is compounded per year: ");
        numberOfCompounds = sc.nextDouble();

        System.out.print("Enter investment duration (years): ");
        years = sc.nextDouble();
    }
    
        public double calculateFutureValue() {
       
           return investment_amount * Math.pow(1 + (annualInterestRate / numberOfCompounds / 100), numberOfCompounds * years);
    }


     
        public void printRecord(){
            double futureValue = calculateFutureValue();
            double totalInterest = futureValue - investment_amount;
            System.out.println(" your future value wil be  : rs  " + calculateFutureValue());
            System.out.println("you will earn interest amount : rs "+ totalInterest);
    }
    
 }

 public class Compound_Interest_Calculator {
       public static void main(String[] args) {
        cfv calc = new cfv();
        calc.acceptRecord();
        calc.printRecord();
    }
   




}
