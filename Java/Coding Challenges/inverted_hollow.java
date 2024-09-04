//Java program to print a hollow inverted pyramid pattern using asterisks (*) andspaces.
/*  *********
    *      *
     *    *
      *  *
       *

 */
public class inverted_hollow {
    public static void main(String[] args) {
        int rows = 5; 

        for (int i = rows; i >= 1; i--) {
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }

        
            for (int k = 1; k <= (2 * i - 1); k++) {
                if (k == 1 || k == (2 * i - 1) || i == rows) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
