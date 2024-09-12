/*3.	Write a program to find the maximum and minimum values in a single-dimensional array of integers.*/


import java.util.Scanner;

public class Q3 {

        static Scanner sc = new Scanner(System.in);


        static void acceptRecord(int[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 integers:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter number for index " + i + ": ");
            arr[i] = sc.nextInt();
        }
        sc.close();
    }

     static void Max(int[] arr) {
        int max = arr[0];  

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];  
            }
        }
        System.out.println("Max Value in the arry is :"+max);
    }

      static void Min(int[] arr) {
        int min = arr[0];  

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];  
            }
        }
        System.out.println("Min Value in the arry is :"+min);
    }

    public static void main(String[] args) {
        int []arr=new int [5];
        Q3.acceptRecord(arr);
        Q3.Max(arr);
        Q3.Min(arr);
        }



}
    

