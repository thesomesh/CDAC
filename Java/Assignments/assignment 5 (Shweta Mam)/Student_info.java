package A7;

class Student {
  
    private String name;
    private String course;
    private int prn;

 
   
    public Student(String name , String course, int prn) {
        this.name = name;
       this.prn=prn;
       this.course=course;
       
    }

  
    public String getName() {
        return name;
    }

  
    public String getCourse() {
        return course;
    }

    public int getprn() {
        return prn;
    }

  
    public void displayDetails() {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
        System.out.println("PRN NO : " + prn);
    }
}


public class Student_info {
    public static void main(String[] args) {
      
        Student student1 = new Student("Somesh","pg DAC ",1250456);

        student1.displayDetails();
    }
}


