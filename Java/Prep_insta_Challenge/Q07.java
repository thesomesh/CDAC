//Q7. Greatest of the Three numbers:

import java.util.Scanner;

public class Q07 {
    
 public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter Number 1 : ");
    int num1 = sc.nextInt();

    
    System.out.print("Enter Number 2 : ");
    int num2 = sc.nextInt();
   
    System.out.print("Enter Number 3 : ");
    int num3 = sc.nextInt();


    if(num1>=num2 && num1>=num3 | num2>=num1 && num2>=num3 ){

      System.out.println(num1+" is greater  ");  
    }

    else if(num2>=num1 && num2>=num3){
        System.out.println(num2+" is greater  ");  
    }
     
    else if(num3>=num1 && num3>=num2){
        System.out.println(num3+" is greater  ");  
    }
    
    sc.close();
}  

}
