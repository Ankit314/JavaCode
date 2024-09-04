import java.io.File;
import java.io.IOException;

public class FileHandling {
    public static void main(String[] args) throws IOException {
        File f=new File("C:\\Users\\Ankit\\Desktop\\LC.txt");
        if (f.createNewFile()){
            System.out.println("File Succesfuly Created...........");


        }
        else {

            System.out.println("File Allready Exisist........");

        }
    }
}
