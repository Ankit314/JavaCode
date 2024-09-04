import java.util.Scanner;

public class AdditionMethod {
    public static void main(String[] args) {
        Scanner sac=new Scanner(System.in);
        System.out.println("Enter a Number ");
        int a= sac.nextInt();
        System.out.println("Enter a Number");
        int b=sac.nextInt();
        int s=add(a,b);
        System.out.println("Sum is "+s);
    }
    public static int add(int n1,int n2){
        int sum=n1+n2;
        return sum;
    }
}
