import java.util.Scanner;

public class Natural_Number {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter a Number :");
        Scanner obj=new Scanner(System.in);
        n=obj.nextInt();
        for (int i=1;i<=n;i++){
            System.out.println("Natural Number Is :"+i);
        }
    }
}
