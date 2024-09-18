//Q14 Armstrong number


import java.util.Scanner;

public class Q14{

    public static void main(String[] args) {


            Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int remainder, cu = 0;
        int temp = number;
      
        while (temp != 0)
        {
            remainder = temp% 10;
            cu += Math.pow(remainder, 3); 
            temp/= 10;

        }

        if(cu == number){
            System.out.println(number + " is an Armstrong number.");
        }
        else{
            System.out.println(number + " is not an Armstrong number.");
        } 
    }
}