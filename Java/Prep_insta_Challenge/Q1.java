//Q1. Positive or Negative number

import java.util.Scanner;

public class Q1{
    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int num = s.nextInt();

        if(num>0){
        System.out.println("Number "+ num +" is postive ");  
        }
        else{
            System.out.println("Number "+ num +" is negative ");  
        }
        s.close();
    } 
   
}

