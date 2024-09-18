//Q3. Sum of First N Natural numbers

import java.util.Scanner;

public class Q3{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number To get Sum N Natural Num : ");
        int num = sc.nextInt();

        int sum =( num*(num+1)/2);

        System.out.print("Sum of N Natural Num is : "+sum);
       
    }  
}



