import java.util.Scanner;

public class Q2 {

        static Scanner sc=new Scanner(System.in);

         static void acceptRecord(int []arr) {

        for(int i=0;i<arr.length;i++) {
        System.out.println("Enter 5 values  of the array." + i );
        arr[i]=sc.nextInt();
        }

        }

        static void printRecord(int []arr) {
        System.out.println("values of the array are: ");
        for(int j=0;j<arr.length;j++) {
        System.out.println(arr[j]);
        }
        }

        public static void main(String[] args) {
        int []arr=new int [5];
        Q2.acceptRecord(arr);
        Q2.printRecord(arr);
        }
}
