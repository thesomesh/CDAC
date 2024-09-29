import java.util.Scanner;

class Armstrong_No {

    static int isArmstrong(int n, int temp) {
        if (n == 0) {
            return temp;
        }
        temp = (int) Math.pow(n % 10, 3) + temp;
        return isArmstrong(n / 10, temp);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        if (num == isArmstrong(num, 0)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        
        sc.close();
    }
}
