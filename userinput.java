import java.util.Scanner;

class userinput {
     public static void main(String[] args) {
         int a,b,sum,mul;
         Scanner obj=new Scanner(System.in);
         System.out.println("Enter 1st number");
         a= obj.nextInt();
         System.out.println("Enter 2nt number :");
         b= obj.nextInt();
         sum=a+b;
         System.out.println("sum of number :"+sum);
         mul=a*b;
         System.out.println("Multiplication :"+mul);


     }
}
