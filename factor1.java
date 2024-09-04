import java.util.Scanner;

public class factor1 {
    public static void main(String[] args) {
        int n,fact;
        System.out.println("Enter Any Number :");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        for (int i=1;i<=n;i++){
            if (n%i==0){
                System.out.println(i+" ");
            }
        }
    }
}
