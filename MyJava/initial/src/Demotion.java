/**
 * Created by huoweiguang on 14-11-26.
 */
public class Demotion {
    void f1(char x) { System.out.println("f1(char)"); }
    void testDouble() {
        double x = 0;
        System.out.println("double argument:");
        f1((char)x);//强制转换来窄化
    }
    public static void main(String[] args) {
        Demotion p = new Demotion();
        p.testDouble();
    }
} 

