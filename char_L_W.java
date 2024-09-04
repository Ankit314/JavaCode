import java.util.Scanner;

public class char_L_W {
    public static void main(String[] args) {
        char ch,ch2;
        System.out.println("Enter Any Character :");
        Scanner s=new Scanner(System.in);
        ch=s.next().charAt(0);
        if (ch>='A' && ch<='Z')
        {
            ch2=Character.toLowerCase(ch);



        }
        else {
            ch2=Character.toUpperCase(ch);

        }
        System.out.println("Charecter is :"+ch2);
    }
}
