//Q2. Positive or Negative number

import java.util.Scanner;


public class Q2{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int num = sc.nextInt();

        if(num % 2 == 0){
        System.out.println("Number "+ num +" is even ");  
        }
        else{
            System.out.println("Number "+ num +" is odd ");  
        }
       
    }  
}