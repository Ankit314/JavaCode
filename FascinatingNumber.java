import java.util.Scanner;

public class FascinatingNumber {
    static boolean isFascing(int n){
        String strNum=""+n+(n*2)+(n*3);
        int concateNumber=Integer.parseInt(strNum);
        int freq[]=new int[11];
        for (int i=0;i<strNum.length();i++){
            int digit=strNum.charAt(i)-'0';
            freq[digit]++;
        }
        for (int i=1;i<=9;i++){
            if (freq[i]!=1)
                return false;
        }
        return true;
    }


    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a 3 digit number: ");
        int num=sc.nextInt();
        if (isFascing(num)){
            System.out.println(num+" is a Fascinating Number");
        }
        else {
            System.out.println(num+" Is NOT a Fascinating Number");
        }
    }
}
