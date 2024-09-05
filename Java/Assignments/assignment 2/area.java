import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your shape To calculate area -");
        System.out.println("                                    ");
        System.out.println("Enter 1 for Circle");
        System.out.println("Enter 2 for Square");
        System.out.println("Enter 3 for Rectangle");
        System.out.println("Enter 4 for Triangle");
        System.out.println("                                    ");


        int input = sc.nextInt();

        switch (input) {
            case 1:
                System.out.println("Enter radius of the circle: ");
                double rad = sc.nextDouble();
                double area = Math.PI*rad*rad;
                System.out.println("the area of circle is: ");
                System.out.print(area);
                break;

            case 2:
                System.out.print("Enter length of the square: ");
                double len = sc.nextDouble();
                double areasq = len*len;
                System.out.println("the area of the Square is:" );
                System.out.print(areasq);
                break;

            case 3:
                System.out.print("Enter length of the rectangle: ");
                double length = sc.nextDouble();
                System.out.print("Enter breadth of the rectangle: ");
                double breadth = sc.nextDouble();
                double arearec = length*breadth;
                System.out.println("the area of the Square is:" );
                System.out.print(arearec);
                break;

            case 4:
                System.out.print("Enter base of the triangle: ");
                double base = sc.nextDouble();
                System.out.print("Enter height of the triangle: ");
                double height = sc.nextDouble();
                double areatri = 0.5*base*height;
                System.out.println("the area of triangle is:" );
                System.out.print(areatri);
                break;
        
            default: System.out.println("Wrong Input");
                break;
        }
        sc.close();
    }
}
