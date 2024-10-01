import java.util.Scanner;

public class White_Spaces {
    public static String remove(String str) {
        return str.replaceAll("\\s", "");
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(" ");
        String str = s.nextLine();
        String r = remove(str);
        System.out.println(" " + r);
        s.close();
    }
}
