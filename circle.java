import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
       final double PI=3.14;
       int raedious;
       double area;
       System.out.println("Enter Radious Of Circle :");
        Scanner s=new Scanner(System.in);
        raedious=s.nextInt();
        area=PI*(raedious*raedious);
        System.out.println("Area Of Circle :"+area);



    }
}
