import java.util.Scanner;

class vote{
    public static void main(String args[]){

        System.out.println("enter your age");

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

      
        if(age<18){
            System.out.println("You are not elegible for voting ");
        }else{
            System.out.println("You are elegible for voting ");
        }
       
        sc.close();
    }
}