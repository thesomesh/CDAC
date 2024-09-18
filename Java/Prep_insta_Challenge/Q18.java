//Q18.Power of a number 

import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
      
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
      
        System.out.println("Enter power : ");
        int power=sc.nextInt();

    
          int result = (int) Math.pow(num, power);
        
         System.out.println("Power of the number: "+result);  
     }   

}

    
     