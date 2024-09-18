//Q11.Sum of digits of a Number in Java
import java.util.Scanner;


public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a nmber: ");
        int number = sc.nextInt();
        
        
        int sum = 0;
        
        
        while (number != 0) {
            sum += number % 10;  
            number = number / 10;
        
        }

        System.out.println("Sum of digits: " + sum);
        
        sc.close();
    }


}