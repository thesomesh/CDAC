//Factorial of a number 
import java.util.*;
public class Q17 {
     public static void main(String []args) {
        Scanner sc=new Scanner(System.in);
      
        
        System.out.println("Enter the number: ");
        int num=sc.nextInt();

        int i=1,fact=1;

        while(i<=num)
        {
            fact=fact*i;
            i++;
        }
        System.out.println("Factorial of the number: "+fact);  
     }   

    }