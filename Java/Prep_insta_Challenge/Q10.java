//Q10.Java Program to print Prime numbers in a given range

import java.util.Scanner;

public class Q10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter num1: ");
        int num1 = sc.nextInt();
        
        System.out.print("Enter num2: ");
        int num2 = sc.nextInt();
        
        System.out.println("Prime numbers between two are ");
        
        for (int i = num1; i <= num2; i++) {
            if (isPrime(i)) {
                System.out.print(i+" ");
            }
        }
    }

  
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= n-1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
