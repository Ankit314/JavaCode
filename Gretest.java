import java.util.Scanner;

public class Gretest {
    public static void main(String[] args) {
        int a,b,c;
        System.out.println("Enter three Number");
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();
        if (a>b){
            if (a>c){
                System.out.println("Number is Gretest :"+a);

            }
            else {
                System.out.println("Number is Gretest :"+c);
            }

        }
        else {
            if (b>c){
                System.out.println("Number is Gretest :"+b);

            }
            else {
                System.out.println("Number is Gretest :"+c);
            }
        }
    }
}
