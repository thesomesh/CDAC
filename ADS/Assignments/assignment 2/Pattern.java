import java.util.Scanner;

public class Pattern {
    public static void pattern(int rows) {
        if (rows <= 0) {
            return;
        }
        pattern(rows - 1);
        for (int i = 0; i < rows; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter Number of lines to print Pattern(*) ");
        int n = s.nextInt();
        pattern(n);
        s.close();
    }
}
