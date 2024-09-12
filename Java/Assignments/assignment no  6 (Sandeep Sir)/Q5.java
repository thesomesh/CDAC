/*5.	Write a program to find the intersection of two single-dimensional arrays. */
import java.util.ArrayList;
import java.util.HashSet;

public class Q5 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 5, 6, 7, 8};

        int[] intersection = findIntersection(array1, array2);

        System.out.println("Intersection of the two arrays:");
        for (int num : intersection) {
            System.out.print(num + " ");
        }
    }

    public static int[] findIntersection(int[] array1, int[] array2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> intersectionSet = new HashSet<>();

       
        for (int num : array1) {
            set1.add(num);
        }

       
        for (int num : array2) {
            if (set1.contains(num)) {
                intersectionSet.add(num);
            }
        }

        
        int[] intersectionArray = new int[intersectionSet.size()];
        int index = 0;
        for (int num : intersectionSet) {
            intersectionArray[index++] = num;
        }

        return intersectionArray;
    }
}
