package A7;

    class Vehicle{
    
        public void startEngine() {
            System.out.println("Vehicle Engine Started");
        }

        public void stopEngine() {
            System.out.println("Vehicle Engine Stopped");
        }
    }

    class Car extends Vehicle{
        public void startEngine() {
            System.out.println("Car Engine Started");
        }

        public void stopEngine() {
            System.out.println("Car Engine Stopped");
        }

    }

    class Motorcycle extends Vehicle{
        public void startEngine() {
            System.out.println("Bike Engine Started");
        }
        public void stopEngine() {
            System.out.println("Bike Engine Stopped");
        }
    }

    public class Vehicle_Engine {
    
        public static void main(String[] args) {
          
            Car Mycar= new Car();

            Mycar.startEngine();
            Mycar.stopEngine();

          Motorcycle Mybike= new Motorcycle();
           Mybike.startEngine();
           Mybike.stopEngine();
     }
    }
     
    
    
    

