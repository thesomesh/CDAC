import java.util.Scanner;

class GCD {
   
    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b); 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
  
        System.out.print("Enter number: ");
        int a = sc.nextInt();
        
        System.out.print("Enter number: ");
        int b = sc.nextInt();
        
        
        System.out.println(gcd(a, b));
        
        sc.close(); 
    }
}
