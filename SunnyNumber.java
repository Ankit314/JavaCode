import java.util.Scanner;

public class SunnyNumber {
    public static void main(String[] args) {
        double x;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        x=Math.sqrt(num+1);
        if ((int)x==x){
            System.out.println(num+" is a Sunny Number");
        }
        else {
            System.out.println(num+" is Not Sunny Number");
        }
    }
}
