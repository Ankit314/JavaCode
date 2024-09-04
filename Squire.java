import java.util.Scanner;

public class Squire {
    public static void main(String[] args) {
        int side,area;
        System.out.println("Enter Side Values :");
        Scanner s=new Scanner(System.in);
        side=s.nextInt();
        area=side*side;
        System.out.println("Area of sqire :"+area);
    }
}
