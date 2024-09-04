import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        int l,b,area;
        System.out.println("Enter Lenghth :");
        Scanner s=new Scanner(System.in);
        l=s.nextInt();
        System.out.println("Enter Values for Wight :");
        b=s.nextInt();
        area=l*b;
        System.out.println("Area of Rectangale :"+area);

    }
}
