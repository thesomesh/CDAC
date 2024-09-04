//Java program to print a hollow right triangle pattern using numbers and spaces.

/*  1 
    1 2 
    1   3 
    1     4 
    1 2 3 4 5 

 */

public class rightTriangle {
    public static void main(String[] args) {
        int rows = 5; 

        for (int i = 1; i <= rows; i++) {
            
            for (int j = 1; j <= i; j++) {
              
                if (j == 1 || j == i || i == rows) {
                    System.out.print(j + " ");
                } else {
                    System.out.print("  "); 
                }
            }
            System.out.println(); 
        }
    }
}
