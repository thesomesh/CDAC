import java.util.*;


class DiscountCalculator {
	
	float originalPrice;
    float discountRate;
	static Scanner sc = new Scanner(System.in);
    
    public DiscountCalculator(float originalPrice, float discountRate) {
		this.originalPrice = originalPrice;
		this.discountRate = discountRate;
	}

	public float getOriginalPrice() {
		return originalPrice;
	}

	public void setOriginalPrice(float originalPrice) {
		this.originalPrice =  originalPrice;
	}

	public float getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(float discountRate) {
		this.discountRate = discountRate;
	}
    
	public float calculateDiscount () {
		
		return originalPrice * (discountRate / 100);
		
	}
	
	public String toString() {
		
		float discountAmount = calculateDiscount();	
		return "Discount Amount : rs"  + discountAmount + "\n" + "Final Price : rs "+(originalPrice - discountAmount) ; 
        
	}
	
	
}
class Util {
	static Scanner sc = new Scanner(System.in);
	
	DiscountCalculator calc;
	public void acceptRecord() {
			
		System.out.print("Enter original price : rs  ");
		float originalPrice = sc.nextFloat();
		
		System.out.print("Enter discount (%) : ");
		float discountRate = sc.nextFloat();
		
		calc = new DiscountCalculator(originalPrice, discountRate);
		
	}

	public void printRecord() {
		
		System.out.printf(calc.toString());
		
	}
	public int menuList() {
		

		System.out.println("1. Enter details");
		System.out.println("2. Display Final amount");
		System.out.println("3. Exit");
		System.out.print("Enter Choice : ");
		return sc.nextInt();
	}
}

public class discount_getset {

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
