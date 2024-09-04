import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
        int sub1,sub2,sub3,sub4,sub5,total;
        float  average;
        System.out.println("Enter Five Subject Marks :");
        Scanner s=new Scanner(System.in);
        sub1=s.nextInt();
        sub2=s.nextInt();
        sub3=s.nextInt();
        sub4=s.nextInt();
        sub5=s.nextInt();
        total=sub1+sub2+sub3+sub4+sub5;
        System.out.println("Total Marks :"+total);
        average=(float) total/5;
        System.out.println("Average :"+average);
    }



}
