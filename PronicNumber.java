import java.util.Scanner;

public class PronicNumber {
    public static void main(String[] args) {
        int num;
        int n;
        boolean flag=false;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number:");
        num=sc.nextInt();
        for (n=0;n<=num;n++){
            if (n*(n+1)==num){
                flag=true;
                break;
            }
        }
        if (flag){
            System.out.println(num+" is  a pronic Number as it is the product of two consecutive number:"+n+" and "+(n+1));

        }
        else {
            System.out.println(num+" is NOT a pronic Number");
        }
    }
}
