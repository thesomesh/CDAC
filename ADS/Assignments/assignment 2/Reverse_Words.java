import java.util.*;

class Reverse_Words{
    static void reverse(String[] arr) {
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            String temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sent = sc.nextLine();
        
        String[] arr = sent.split(" ");
        reverse(arr);
        
        String reversedSentence = String.join(" ", arr);
        System.out.println("Reversed Sentence: " + reversedSentence);
    }
}
