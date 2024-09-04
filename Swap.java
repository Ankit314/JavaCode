import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        int a,b;
        System.out.println("Enter Two Number :");
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        System.out.println("Before Swap :"+"a= :"+a+"  b= :"+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After Swap :"+"a= :"+a+"  b= :"+b);
    }
}
