import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        int num;
        int i,p,r;
        int sum=0;
        int save_num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number :");
        num= sc.nextInt();
        save_num=num;
        while (num!=0){

            i=1;
            p=1;
            r=num%10;
            while (i<=r){
                p=p*i;
                i++;
            }
            sum=sum+p;
            num=num/10;

        }
        if (sum==save_num){

            System.out.println(save_num+"   is a Strong Number");
        }
        else {
            System.out.println(save_num+"   is Not a Strong number");
        }
    }
}
