import java.util.Scanner;

public class Weckend {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter Code Of Day :");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        switch (n){
            case 1:
                System.out.println("Monday ");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday ");
                break;
            case 5:
                System.out.println("Friday ");
                break;
            case 6:
                System.out.println("Saturday");
            case 7:
                System.out.println("Sunday");
            default:
                System.out.println("Wrong Choice ");

        }
    }
}
