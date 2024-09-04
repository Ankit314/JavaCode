import java.util.Scanner;

public class increementanddecreement
{
    public static void main(String[] args) {
        int a,b;
        System.out.println("Enter Two number :");
        Scanner obj =new Scanner(System.in);
        a=obj.nextInt();
        b=obj.nextInt();
        System.out.println("Pree increment :"+(++a));
        System.out.println("Pree increment :"+(++b));
        System.out.println(" increment :"+(a));
        System.out.println("Pree increment :"+(a++));
        System.out.println(" increment :"+(b));
        System.out.println("Post increment :"+(b++));
        System.out.println("Pree decrement :"+(--a));
        System.out.println("Pree decrement :"+(--b));
        System.out.println("Post decrement :"+(a--));
        System.out.println("Post decrement :"+(b--));


    }
}
