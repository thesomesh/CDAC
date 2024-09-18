//Q15.Armstrong number in a given range


import java.util.Scanner;

public class Q15{

    
    public static boolean isArmstrong(int number) {
        int temp, remainder, result = 0, n = 0;
        temp = number;

        
        while (temp != 0) {
         temp /= 10;
            ++n;
        }

       temp = number;

       
        while (temp != 0) {
            remainder = temp% 10;
            result += Math.pow(remainder, n);
          temp /= 10;
        }

       
        return result == number;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter num1 ");
        int num1 = sc.nextInt();
        System.out.print("Enter num2 ");
        int num2= sc.nextInt();
        System.out.print("Armstrong numbers are : ");
       
       
        for (int i = num1; i <= num2; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}
