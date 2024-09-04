import java.util.Scanner;

public class Fcatorial {
    public static void main(String[] args) {
        long n,fact=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        n=sc.nextInt();
        for (int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of    "+ n +"  is   "+  fact);
    }
}
