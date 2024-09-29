import java.util.Scanner;

public class Prime_No {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int no = s.nextInt();
        if (no % 2 == 0) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not prime number");
        }
    }
}
