import java.util.Scanner;

public class SwapWithoutUsingThirdVariable {
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Value of A:");
        a=sc.nextInt();
        System.out.println("Enter Value of B:");
        b=sc.nextInt();
        System.out.println("\n value of A and B before swapping is A:"+a+"B :"+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("\n value of A and B after swapping is A:"+a+"B:"+b);
    }
}
