import java.util.Scanner;

public class Methoduserdefine {

        public static void main(String[] args) {
            Scanner sac=new Scanner(System.in);
            System.out.print("Enter The Number ");
            int num= sac.nextInt();
            FindEvenOdd(num);

        }
        public static void FindEvenOdd(int num){
            if (num%2==0){
                System.out.println("Even Number");
            }
            else {
                System.out.println("Odd number");
            }

        }
    }

