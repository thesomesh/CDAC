//Write a Java program to find the numbers greater than the average of the numbers of a given array

import java.util.Arrays;
import java.util.Scanner;

public class num_greater {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        int[] numbers = new int[6];


        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter value for index " + i + ": ");
            numbers[i] = sc.nextInt();
        }
        System.out.print("Enter the value of k: ");
        int k = sc.nextInt();

       
        findKLargestElements(numbers, k);
    
    }
          static void findKLargestElements(int[] array, int k) {
        
        Arrays.sort(array);

   
        System.out.println("The " + k + " largest elements are:");
        for (int i = array.length - 1; i >= array.length - k; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
