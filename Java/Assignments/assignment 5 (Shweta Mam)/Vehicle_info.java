package A7;

class Vehicle{
      private String Company; 
      private int year;

    public Vehicle(String Company,int year) {
        this.Company=Company;
        this.year=year;
    }

    public String getCompany() {
        return Company;
    }

    public int getYear() {
        return year;
    }
}


class Car extends Vehicle{
    String model;

    public Car(String Company,int year,String model) {
        super(Company, year);
        this.model=model;   
    }

public String getModel() {
        return model;
    }

    public void displayDetails()
    {
        System.out.println("Company :"+getCompany());
        System.out.println("Manufacturing Year : "+getYear());
        System.out.println("Model Name : "+getModel());
    }
    }
public class Vehicle_info {
public static void main(String[] args) {
        Car c=new Car("TATA",2020,"Safari");
        c.displayDetails();

    }

}
