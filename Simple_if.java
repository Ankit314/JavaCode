import java.util.Scanner;

public class Simple_if {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter Your Age :");
        Scanner obj = new Scanner(System.in);
        age=obj.nextInt();
        if (age>=18){
            System.out.println("You are Eligibal for Drive :");
        }
        else{
            System.out.println("You are Not eligibal");
        }
    }
}
