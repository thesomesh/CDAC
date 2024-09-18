//Q5. Sum of numbers in a given range

import java.util.Scanner;

public class Q5

    {  
        public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number 1 : ");
        int a= sc.nextInt();

        System.out.print("Enter Number 2: ");
        int b= sc.nextInt();

        int sum = 0;
    
        for (int i = a; i <= b; i++)
            sum = sum + i;
          System.out.println ("The sum is " + sum);
      }
    }
            

