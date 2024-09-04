import java.util.Scanner;



public class Trangle {
    public static void main(String[] args) {
        int a,b,c;
        double sp,area;
        System.out.println("Enter Values For Sides Of Trangle :");
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();
        sp=(a+b+c)/2;
        area=Math.sqrt(sp*(sp-a)*(sp-b)*(sp-c));
        System.out.println("Area Of Trangle :"+area);
        System.out.println("Semi Paramiter   :"+sp);


    }
}
