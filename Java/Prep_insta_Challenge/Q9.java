//Q9.Prime number

import java.util.Scanner;

public class Q9 {
    public static void main(String args[]){

    Scanner sc = new Scanner(System.in) ;

        System.out.println("Enter no ");
         int  n= sc.nextInt();

       boolean isprime=true;
       
    for(int i=2;i<n-1;i++){
     if(n % i==0){
        isprime=false;
    }
    }
       if(isprime==true){
        System.out.println("no is prime");
       }
       else{System.out.println("no is not  prime");

       }
       

    }
    
    }



