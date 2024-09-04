import java.util.Scanner;

public class AutomorphicNumber {
    public static void main(String[] args) {
        int n,num,sq,r,t;
        boolean equals=false;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number : ");
        n=sc.nextInt();
        num=n;
        sq=n*n;
        t=10;
        System.out.println("\n Square of "+n+"is "+sq);
        while (n>0){
            r=sq%t;
            if (num==r){
                equals=true;
                break;
            }
            n=n/10;
            t=t*10;
        }
        if (equals==true){
            System.out.println(num+" is an Automorphic number");
        }
    }
}
