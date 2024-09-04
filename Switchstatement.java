import java.util.Scanner;

public class Switchstatement {
    public static void main(String[] args) {
        int a,b,ch;
        System.out.println("Enter two Number :");
        Scanner obj=new Scanner(System.in);
        a=obj.nextInt();
        b=obj.nextInt();
        System.out.println("Enter Your Choice : ");
        ch=obj.nextInt();
        switch (ch){
            case 1:
                System.out.println("Sum="+(a+b));
                break;
            case 2:
                System.out.println("SUB="+(a-b));
                break;
            case 3:
                System.out.println("Mul = "+(a*b));
                break;
            case 4:
                System.out.println("DIV = "+(a/b));
                break;
            case 5:
                System.out.println("Mod = "+(a%b));
                break;
            default:
                System.out.println("Wrong Choice !");
        }
    }
}
