//Q8.Leap year or not
import java.util.Scanner;


public class Q8{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
 
    System.out.print( "Enter year " );

    int year = sc.nextInt();
 

     if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
      System.out.println (year + " is a Leap Year");
     }
    else {
      System.out.println(year +" Is not a leap year");
    }
    
  }
   

}
