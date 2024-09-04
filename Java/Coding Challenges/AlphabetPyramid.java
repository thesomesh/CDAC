//program to print a hollow pyramid pattern using asterisks (*) and spaces

/*  A
   BCD
  EFGHI
 JKLMNOP
QRSTUVWXYZ
 */


public class AlphabetPyramid {
    public static void main(String[] args) {
        char letter = 'A'; 
        int rows = 5; 

        for (int i = 1; i <= rows; i++) {
          
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }

         
            for (int k = 1; k <= (2 * i - 1); k++) {
                if (letter <= 'Z') {
                    System.out.print(letter);
                    letter++;
                } else {
                    break; 
                }
            }
            System.out.println();
        }
    }
}
