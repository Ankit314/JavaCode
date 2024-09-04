import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        int a,b,max;
        System.out.println("Enter Two Number");
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        max=a>b?a:b;
        System.out.println("Maximum Number is :"+max);
    }
}
