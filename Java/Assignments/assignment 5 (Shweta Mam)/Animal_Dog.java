package A7;
class Animal {
    private String name;


    public Animal(String name) {
        this.name = name;
    }

   
    public void eat() {
        System.out.println(name + " can eat.");
    }

   
    public void sleep() {
        System.out.println(name + " can sleep.");
    }

    
    public String getName() {
        return name;
    }
}

// Derived class Dog
class Dog extends Animal {

    
    public Dog(String name) {
        super(name); 
    }


    public void bark() {
        System.out.println(getName() + " Can bark.");
    }
}


public class Animal_Dog  {
    public static void main(String[] args) {
       
        Animal animal = new Animal("German shepherd");
        animal.eat();
        animal.sleep();

       

      
        Dog dog = new Dog("Rottweiler");
        dog.eat();   
        dog.sleep(); 
        dog.bark();  
    }
}

