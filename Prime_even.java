import java.util.Scanner;

public class Prime_even {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter a Number :");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        for (int i=0;i<=n;i=i+2){
            System.out.println(i);
        }
    }
}
