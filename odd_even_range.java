import java.util.Scanner;

public class odd_even_range {
    public static void main(String[] args) {
        int n,sum=0;
        System.out.println("Enter a Number :");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        if (n%2==0)
        {
            for (int i=0;i<=n;i=i+2){
                 sum=sum+i;

            }
            System.out.println("Sum of Even = "+sum);

        }
        else
        {
            for (int i=1;i<=n;i=i+2)
            {
                sum=sum+i;


            }
            System.out.println("Sum of Odd= "+sum);

        }
    }
}
