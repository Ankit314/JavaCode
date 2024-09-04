import java.util.Scanner;

public class voting {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter Your Age :");
        Scanner s = new Scanner(System.in);
        age=s.nextInt();
        if (age>=18){
            System.out.println("You Are For Vote :");
        }
        else {
            System.out.println("Not Eligibal For Vote !");
        }
    }
}