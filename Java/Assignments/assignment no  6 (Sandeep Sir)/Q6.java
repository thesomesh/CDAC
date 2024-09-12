/*6.Write a program to find the missing number in an array of integers ranging from 1 to N. */
public class Q6 {
    public static void main(String[] args) {
        int[] a= {1,2,3,4,6,7,8,9,10};
        int sum=0;
        int n=a.length+1;
        int sumn=n*(n+1)/2;
        for(int i=0;i<a.length;i++) {
            sum+=a[i];
        }
        System.out.println("missing num is "+(sumn-sum));
            }
        
}
