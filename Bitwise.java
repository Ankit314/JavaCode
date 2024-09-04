import java.util.Scanner;

public class Bitwise {
    public static void main(String[] args) {
        int a,b;
        System.out.println("Enter Two Number :");
        Scanner obj=new Scanner(System.in);
        a=obj.nextInt();
        b=obj.nextInt();
        System.out.println("Bitwise AND :"+(a&b));
        System.out.println("Bitwise OR :"+(a|b));
        System.out.println("Bitwise XOR :"+(a^b));
        System.out.println("Bitwise Compliment :"+(~a));

    }
}
