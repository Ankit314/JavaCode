import com.sun.nio.sctp.SctpStandardSocketOptions;

import java.util.Scanner;

public class Ternarioperatr {
    public static void main(String[] args) {
        int a,b,max;
        System.out.println("Enter Two Number :");
        Scanner obj=new Scanner(System.in);
        a=obj.nextInt();
        b=obj.nextInt();

        max=(a>b)?a:b;
        System.out.println("Maximum Number is :"+max);
    }
}
