import java.util.Scanner;

public class TrimorphicNumber {
    public static void main(String[] args) {
        boolean flag=true;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        int cube=n*n*n;
        while (n!=0){
            if (n%10!=cube%10){
                flag=false;
                break;
            }
            n/=10;
            cube/=10;
        }
        if (flag){
            System.out.println("Number is a Trimorphic number");
        }
        else {
            System.out.println("Number is NOT a Trimorphic number ");
        }
    }
}
