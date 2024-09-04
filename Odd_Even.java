import java.util.Scanner;

public class Odd_Even {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter a number :");
        Scanner obj=new Scanner(System.in);
        n=obj.nextInt();
        if (n%2==0){
            System.out.println("Number is Even :");
        }
        else {
            System.out.println("Number is Odd :");

        }
    }
}
