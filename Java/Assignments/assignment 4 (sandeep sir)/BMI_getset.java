import java.util.Scanner;

class BMITracker{
 float weight, height;
    
	public BMITracker(float weight, float height) {
		this.weight =  weight;
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	
    // Calculations 
	public double calculateBMI() {
		
		double bmi= weight / (height * height);	
		return bmi;
		
	}
	public String classifyBMI(double bmi) {
	
		if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return "Normal weight";
        } else if (bmi >= 25 && bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
	}
	
	public String toString() {
		
		double bmi = calculateBMI(); 
		return String.format("Your BMI is :" + calculateBMI() +"\n"+"BMI Classification : "+ classifyBMI(bmi)) + "\n";
						
	}
	
} 

class Util {
	
	private BMITracker cal;
	static Scanner sc = new Scanner(System.in);
	public void acceptRecord() {
		
		
		System.out.println("Enter your weight in kilograms : ");
	   float weight = sc.nextFloat();
		
		System.out.println("Enter your height in meters : ");
		float height = sc.nextFloat();
		
		cal = new BMITracker(weight, height);
		
	}
	public void printRecord() {

		System.out.printf(cal.toString());
	
	}
	
	public int menuList() {
		
		
		System.out.println("1. Enter your details ");
		System.out.println("2. Display Result");
		System.out.println("3. Exit");
		System.out.print("Enter Choice : ");
		return sc.nextInt();
	}
	
}

public class BMI_getset {

	public static void main(String[] args) {
		
		Util util = new Util();
		
		int choice;		
		while((choice = util.menuList()) != 3){
			switch(choice){
				case 1:
					util.acceptRecord();
					break;
				case 2:
					util.printRecord();
					break;
				default:
					System.out.println("Invalid choice.");
					break;
			}
		}
	}

}
