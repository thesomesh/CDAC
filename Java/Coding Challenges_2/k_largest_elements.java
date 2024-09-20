//Write a Java program to find the k largest elements in a given array. Elements in the array can be in any order

import java.util.Scanner;

public class k_largest_elements{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[6];

        System.out.println("Enter 6 array values:");

        // Input array values
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter value for index " + i + ": ");
            numbers[i] = sc.nextInt();
        }

        float sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

       
        float avg = sum / numbers.length;

        System.out.println("Average is: " + avg);

        System.out.println("Number greater than average:");
        for(int number:numbers){
            if(number>avg){
                System.out.println(number);
            }
    }
}
}