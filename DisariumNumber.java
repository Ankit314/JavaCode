import java.util.Scanner;

public class DisariumNumber {
    public static void main(String[] args) {
        int num;
        int temp;
        int sum=0;
        int digit_count=0;
        int pd;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        num=sc.nextInt();
        temp=num;
        while (temp!=0){
            pd=temp%10;
            sum=sum+(int) Math.pow(pd,digit_count);
            temp=temp/10;
            digit_count--;
        }
        if (sum==num){
            System.out.println(num+"is a Disarium Number");
        }
        else {
            System.out.println(num+" is NOT a Disarium Number");
        }
    }
}
