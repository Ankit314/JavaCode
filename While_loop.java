import java.util.Scanner;

public class While_loop {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter Value for Condition :");
        Scanner obj=new Scanner(System.in);
        n=obj.nextInt();
        while (n<=10){
            System.out.println("Number :"+n);
            n++;
        }
    }
}
