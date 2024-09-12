/*8.Modify the previous assignment to use getter and setter methods instead of acceptRecord and printRecord */

import java.util.Scanner;

public class Q8 {
    
    private int[] records;

    
    public Q8(int size) {
        records = new int[size]; 
    }

   
    public void setRecords(int[] records) {
        if (records.length == this.records.length) {
            this.records = records; // Set the values
        } else {
            System.out.println("Array size mismatch.");
        }
    }

   
    public int[] getRecords() {
        return this.records;

    }    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        Q8 handler = new Q8(5);

        
        int[] inputRecords = new int[5];
        System.out.println("Enter 5 record values:");
        for (int i = 0; i < inputRecords.length; i++) {
            System.out.print("Record " + (i + 1) + ": ");
            inputRecords[i] = scanner.nextInt();
        }

       
        handler.setRecords(inputRecords);

        
        int[] records = handler.getRecords();
        System.out.println("The records are:");
        for (int record : records) {
            System.out.print(record + " ");
        }
        System.out.println(); 
    }
}

