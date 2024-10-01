import java.util.*;

class Palindrome {
    public static boolean p(String s) {
        char[] c = s.toCharArray();
        String s1 = "";
        for (int i = c.length - 1; i >= 0; i--) {
            s1 = s1 + c[i];
        }
        if (s1.equals(s)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String s1 = sc.nextLine();
        System.out.println(p(s1));
    }
}
