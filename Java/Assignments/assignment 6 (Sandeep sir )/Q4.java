import java.util.Arrays;

public class Q4 {
   
    public static int removeDuplicates(int[] a) {
    int i=0;
    for(int j=1;j<a.length;j++) {
    if(a[i]!=a[j]) {
        i++;
        a[i]=a[j];
    }
    }
    return i+1;
    }
    public static void main(String[] args) {
    int[] a= {1,5,6,7,1,5,6,8,5,10,5};
    System.out.println("array duplicates element  "+ Arrays.toString(a));
    Arrays.sort(a);
    int k=removeDuplicates(a);
    System.out.print("array after removing duplicates element  ");
    for(int i=0;i<k;i++) {
    System.out.print(a[i]+" ");
    }
        }
    
    }  

