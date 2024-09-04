import java.util.Scanner;

public class Do_While_Loop {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter a Number :");
        Scanner obj=new Scanner(System.in);
        n=obj.nextInt();
        do {
            System.out.println("Number :"+n);
            n++;
        }while (n<=10);
    }
}
