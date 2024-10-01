import java.util.*;
class Reverse_Array {
    static void reverse(int[] arr,int n)
    {
        for(int i=0;i<n/2;i++)
        {
            int temp = arr[i];
            arr[i]= arr[n-i-1];
            arr[n-i-1]=temp;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("\nEnter array element: ");
        for(int i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }
        reverse(arr,n);
        System.out.print("\nReversed Array: ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
