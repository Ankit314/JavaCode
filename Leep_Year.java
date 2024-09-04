import java.util.Scanner;

public class Leep_Year {
    public static void main(String[] args) {
        int year;
        System.out.println("Enter Any Year :");
        Scanner s=new Scanner(System.in);
        year=s.nextInt();
        if (year%100==0 &&year%400==0 || year%100!=0 && year%4==0){
            System.out.println("Leep Year "+year);
        }
        else {
            System.out.println("Not Leep Year :"+year);
        }
    }
}
