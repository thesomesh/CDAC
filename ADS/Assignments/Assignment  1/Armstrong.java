import java.util.Scanner;

class Armstrong {
    
    // Recursive function to calculate the sum of the cubes of the digits
    static int isArmstrong(int n, int temp) {
        if (n == 0) {
            return temp;
        }
        temp = (int)Math.pow(n % 10, 3) + temp;
        return isArmstrong(n / 10, temp);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt(); // Input number
        
        if (num == isArmstrong(num, 0)) {
            System.out.println("true");  // It's an Armstrong number
        } else {
            System.out.println("false"); // It's not an Armstrong number
        }
        
        sc.close(); // Close the scanner to prevent resource leak
    }
}
