import java.util.Scanner;

public class Q7 {

    int[] arry;  
    

    public Q7(int size) {
        arry = new int[size]; 
    }

   
    public void acceptRecord() {
        Scanner sc = new Scanner(System.in);
       
        for (int i = 0; i < arry.length; i++) {
            System.out.print("index " + (i + 1) + ": ");
            arry[i] = sc.nextInt();
        }
    }

    
    public void printRecord() {
        System.out.println("the array is :");
        for (int record : arry) {
            System.out.print(record + " " );
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        
        Q7 sk = new Q7(size);

       
        sk.acceptRecord();
        sk.printRecord();
    }
}
