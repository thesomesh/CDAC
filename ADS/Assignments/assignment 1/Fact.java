class f {
    
    static int fact(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * fact(n - 1); 
    }
}

public class Fact {
    public static void main(String[] args) {
        System.out.println(N.fact(5));  // Output: 120
        System.out.println(N.fact(0));  // Output: 1
    }
}
