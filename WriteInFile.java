import java.io.FileWriter;
import java.io.IOException;

public class WriteInFile {

    public static void main(String[] args) {
        try {
            FileWriter f=new FileWriter("C:\\Users\\Ankit\\Desktop\\LC.txt");
            try {
                f.write("java programing is the best language........");
            }
            finally {
                f.close();
            }
            System.out.println("Succesfully wrote data in file..........");


        } catch (Exception e) {
            throw new RuntimeException(e);
//            System.out.println(e);
        }
    }
}
