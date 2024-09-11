package A3;
import java.util.Scanner;

 class BMITracker {
    float weight;
    float height;
    float bmi;


    public void acceptRecord() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your weight in kg: ");
        weight = sc.nextFloat();
        System.out.println("Enter height in meters: ");
        height = sc.nextFloat();
    }

    public void calculateBMI() {
        bmi = weight / (height * height);
    }


    public void classifyBMI() {
        if (bmi < 18.5) {
            System.out.println("your BMI is: " +  bmi  + "  you are Underweight");
           
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("your BMI is: " + bmi + "  your weight is normal");
            
        } else if (bmi >= 25 && bmi < 29.9) {
            System.out.println("your BMI is: " + bmi+   "  you are Overweight ");
        } else {
            System.out.println("your BMI is: " +  bmi + "  you are Obese");
        }
    }
    void printRecord() { 
        calculateBMI(); 
        classifyBMI();
    
    }

}

public class  BMI_Tracker{
    public static void main(String[] args) {
      BMITracker bmi=new BMITracker();
       bmi.acceptRecord();
       bmi.printRecord();

      


    }
}
