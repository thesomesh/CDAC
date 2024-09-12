import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        int[] array = new int[5];

        System.out.println("Default values of the array:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element at index " + i + ": " + array[i]);
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 integers to update the array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter value for index " + i + ": ");
            array[i] = sc.nextInt();
        }

        System.out.println("\nUpdated values of the array:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element at index " + i + ": " + array[i]);
        }

        sc.close();
    }
}

    
     
  
    
    
