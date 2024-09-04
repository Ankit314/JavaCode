import java.util.Scanner;

public class ASCII {
    public static void main(String[] args) {
        char ch;
        System.out.println("Please Enter a Charecter :");
        Scanner s=new Scanner(System.in);
        ch=s.next().charAt(0);
        int a=ch;
        System.out.println("ACSII :"+a);

    }
}
