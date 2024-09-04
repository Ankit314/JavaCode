import java.util.Scanner;

public class Odd_number {
    public static void main(String[] args) {
        int n,i;
        System.out.println("Enter a Number :");
        Scanner obj=new Scanner(System.in);
        n=obj.nextInt();
        for ( i=1;i<=n;i=i+2){
            System.out.println("Odd Number Is :"+i);
        }
    }
}
