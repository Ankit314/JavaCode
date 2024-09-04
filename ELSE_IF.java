import java.util.Scanner;

public class ELSE_IF {
    public static void main(String[] args) {
        int marks;
        System.out.println("Enter marks :");
        Scanner obj =new Scanner(System.in);
        marks=obj.nextInt();
        if (marks>=90){
            System.out.println("Your Grade is A :");
        }
        else if (marks>=80 && marks>=70) {
            System.out.println("Your Grade is B :");
        }
        else if (marks>=60 && marks>=50) {
            System.out.println("Your Grade is C :");
        } else if (marks>=40 && marks>=30) {
            System.out.println("Your Grade is D :");

        }
    }
}
