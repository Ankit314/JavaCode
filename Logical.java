import java.util.Scanner;

public class Logical {
    public static void main(String[] args) {
        int a,b,c;
        System.out.println("Enter  Three Number :");
        Scanner obj=new Scanner(System.in);
        a=obj.nextInt();
        b=obj.nextInt();
        c=obj.nextInt();
        System.out.println("True/False :"+((a>b) && (a>c)));
        System.out.println("True/False :"+((a>b) || (a>c)));
        System.out.println("True/False :"+((a<b) && (b>c)));
        System.out.println("True/False :"+((b>a) || (b>c)));
        System.out.println("True/False :"+((c>a) && (c>b)));
        System.out.println("True/False :"+((a>b) || (a>c)));
        System.out.println("True/False :"+((a>b) && (a>c)));
        System.out.println("True/False :"+!(a>b));

    }
}
