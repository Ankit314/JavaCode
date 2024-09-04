import java.util.Scanner;

public class NESTED_IF_ELSE {
    public static void main(String[] args) {
        int a,b,c;
        System.out.println("Enter Three Number :");
        Scanner obj=new Scanner(System.in);
        a=obj.nextInt();
        b=obj.nextInt();
        c=obj.nextInt();
        if (a>b)
        {

            if (a>c)
            {
                System.out.println(a+" Number is Gretat  ");


            }
            else
            {
                System.out.println(c+" Number is Gretat  ");

            }

        }
        else
        {
            if (b>c)
            {
                System.out.println(b+" Number is Gretat  ");


            }
            else
            {
                System.out.println(c+" Number is Gretat  ");


            }

        }
    }
}
