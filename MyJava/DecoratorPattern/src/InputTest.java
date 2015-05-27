import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by pc on 15-5-18.
 */
public class InputTest {
    public static void main(String[] args) {
        int c;
        try{
            InputStream in=new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("DecoratorDesign/test.txt")));
            while((c=in.read())>=0){
                System.out.println((char)c);
            }
            in.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
