import java.util.Scanner;

public class No_of_N_term_natural_num {
    public static void main(String[] args) {
        int n,sum=0;
        System.out.println("Enter a Number :");
        Scanner obj=new Scanner(System.in);
        n=obj.nextInt();
        for (int i=1;i<=n;i++){
            sum+=i;
        }
        System.out.println("Sum of Number :"+sum);
    }
}
