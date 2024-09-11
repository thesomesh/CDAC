package A3;

import java.util.Scanner;

class Discount_Calculator {
    float originalPrice, discountRate ,discountAmount,finalPrice;

    public void acceptRecord() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter original price : rs  ");
        originalPrice = sc.nextFloat();   
        System.out.print("Enter discount (%) : ");
        discountRate = sc.nextFloat();
    }

    public void calculateDiscount() {
        discountAmount = originalPrice * (discountRate / 100);
        finalPrice = originalPrice - discountAmount;
    }

    public void printRecord() {
        System.out.println("discount amount will be : rs  " + discountAmount);
        System.out.println("final price after discount is : rs " +  finalPrice);
    }
}
public class Discount_Calculation{
    public static void main(String[] args) {
        Discount_Calculator calc = new Discount_Calculator();
        
        calc.acceptRecord();
        calc.calculateDiscount();
        calc.printRecord();
    }
}
