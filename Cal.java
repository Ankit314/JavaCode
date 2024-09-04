import java.util.Scanner;

public class Cal {
    public static void main(String[] args) {
        int n1,n2,ch,cal;
        System.out.println("Enter Two Number :");
        Scanner s=new Scanner(System.in);
        n1=s.nextInt();
        n2=s.nextInt();
        System.out.println("Enter Tour Choice 1--Add , 2--Sub, 3--Mul, 4--Div, 5--Mod :");
        ch=s.nextInt();
        if (ch==1){
            cal=n1+n2;
            System.out.println("Sum="+cal);
        } else if (ch==2) {
            cal=n1-n2;
            System.out.println("Sub="+cal);
        } else if (ch==3) {
            cal=n1*n2;

            System.out.println("MULTIPLICATION="+cal);

        } else if (ch==4) {
            cal=n1/n2;
            System.out.println("DIVISION="+cal);

        } else if (ch==5) {
            cal=n1%n2;
            System.out.println("MODULATION ="+cal);

        }
        else {

            System.out.println("Wrong Choice !");
        }


    }
}
