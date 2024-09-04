import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        int n,count=0;
        System.out.println("Enter a Number :");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        while (n>0){
            n=n/10;
            count++;

        }
        System.out.println("Count "+count);
    }
}
