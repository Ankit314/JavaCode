import java.util.Scanner;

public class Evil_OdiousNumber {
    public static void main(String[] args) {
        int num;
        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number :");
        num=sc.nextInt();
        while (num!=0){
            if (num%2==1){
                count++;
            }
            num/=2;
        }
        if (count%2==0){
            System.out.println("Evil Number");
        }
        else {
            System.out.println("Odious Number");
        }
    }
}
