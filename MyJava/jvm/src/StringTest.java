import java.util.LinkedList;
import java.util.Set;

/**
 * Created by huoweiguang on 15-1-2.
 */
public class StringTest {
    public static void main(String[] args) {
//part 1
        String s1 = "i love china";
        String s2 = "i love china";
        System.out.println("result:" + s1 == s2);//true
//part 2
        String s3 = new String("i am Chinese");
        String s4 = new String("i am Chinese");
        System.out.println("result:" + s3 == s4);//false

        String ss = "123456";
        System.out.println("ss = " + ss);//ss = 123456
        ss.replace('1', '0');
        System.out.println("ss = " + ss); //ss = 123456

        String s = new String("1");
        String ss2 = "1";
        s.intern();
        System.out.println(s == ss2);

        String ss3 = new String("1") + new String("1");
        String ss4 = "11";
        s3.intern();
        System.out.println(ss3 == ss4);
    }
}
