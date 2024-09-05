
import java.util.Scanner;

class bmi {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = sc.nextLine();

        System.out.println("Enter your weight in kg:");
        float weight = sc.nextFloat();

        System.out.println("enter your height in meters:");
        float height = sc.nextFloat();

        float bmi = weight / (height * height);

        System.out.println("Your BMI is: " + bmi);
        
        if (bmi < 18.5) {
            System.out.println(name + " You are underweight ");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println(name +" You have a healthy weight");
        }else {
            System.out.println(name +" You are overweight" );
        }

        sc.close();
    }
}
