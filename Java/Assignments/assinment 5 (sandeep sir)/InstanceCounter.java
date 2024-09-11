package A5;

public class InstanceCounter {


     static int instanceCount = 0;
    public InstanceCounter() {
        instanceCount++;
    }

   
    public static int getInstanceCount() {
        return instanceCount;
    }

    public static void main(String[] args) {
        
        InstanceCounter IC1 = new InstanceCounter();
        InstanceCounter IC2 = new InstanceCounter();
        

    
        System.out.println("No of instances created: " + InstanceCounter.getInstanceCount());
    }
}
