import java.util.Scanner;

public class Charprint {
    public static void main(String[] args) {
        char ch;
        System.out.println("Please Enter Charecter :");
        Scanner s=new Scanner(System.in);
        ch=s.next().charAt(0);
        System.out.println(ch);
    }
}
