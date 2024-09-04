import java.util.Scanner;

public class fact {
    public static void main(String[] args) {
        int n,factorial=1;
        System.out.println("Enter a Number");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        for (int i=1;i<=n;i++){
            factorial=factorial*i;
        }
        System.out.println("Factorial :"+factorial);
    }
}
