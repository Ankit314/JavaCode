import java.util.Scanner;

public class Number_is_even_or_odd {
    public static void main(String[] args) {
        int x;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an Integer:");
        x=sc.nextInt();
        if (x%2==0){
            System.out.println("Number  is Even :");
        }
        else {
            System.out.println("Number is Odd");
        }
    }
}
