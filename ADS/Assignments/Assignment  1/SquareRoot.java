import java.util.Scanner;

public class SquareRoot {

    public static int sqrt(int n){
        if(n == 0 || n ==1){
            return n;
        }
    int s = 1, e = n, result = 0;
    while (s <= e) {
        int mid = (s + e) / 2;
        if (mid * mid == n) {
            return mid;
        }
        if (mid * mid < n) {
            s = mid + 1;
            result = mid;
        } 
        else {
            e = mid - 1;
        }
    }

    return result; 
}
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);\
	
        System.out.print("Enter a number: ");
		
        int number = sc.nextInt();
        int sqrtResult = sqrt(number);
		
        System.out.println(sqrtResult );
        sc.close();
}
}

    
