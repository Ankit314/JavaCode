import java.util.Scanner;

public class Tax {
    public static void main(String[] args) {
        int Sal;
        double ctc;
        System.out.println("Enter Salary :");
        Scanner s=new Scanner(System.in);
        Sal =s.nextInt();
        if (Sal<=10000){
            System.out.println("No Tax !");
        }
        else if (Sal>10000 && Sal<=100000) {
            ctc=Sal*0.10;
            System.out.println("Your Paybale Tax is 10%:"+ctc);
            
        }
        else {
            ctc=Sal*0.20;
            System.out.println("Your Paybale Tax is 20%:"+ctc);
        }
    }
}
