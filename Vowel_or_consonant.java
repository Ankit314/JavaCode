import java.util.Scanner;

public class Vowel_or_consonant {
    public static void main(String[] args) {
        char ch;
        System.out.println("Plese Enter Charecter :");
        Scanner s=new Scanner(System.in);
        ch=s.next().charAt(0);
        if (ch=='A' || ch=='a' || ch=='E' || ch=='e' || ch=='I' || ch=='i' || ch=='O' || ch=='o' || ch=='U' || ch=='u'){
            System.out.println("Vowel Letter");
        }
         else {
             System.out.println("Consonant");
        }
    }
}
