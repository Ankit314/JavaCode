import java.util.Scanner;

public class Possitive__Negative {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter a Number :");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        if (n>0){
            System.out.println("Possitive :");
        }
        else if (n<0)
        {
            System.out.println("Negative :");

        }
        else
        {
            System.out.println("Nither +ve Nor -ve :");
        }
//
    }
}
