/**
 * Created by huoweiguang on 14-11-25.
 */
class  Rock{
    /**
    * 构造器无返回值
    **/
    String s="fieldInit";
    Rock(int i){
        System.out.println("Rock"+i);
        String sCons="consInit";
    }
}
class Tester {
    String s1;
    String s2 = "hello";
    String s3;
    Tester() { s3 = "good-bye"; }
}
public class Constructor {
    public static void main(String []  args){
        for(int i=0;i<10;i++){
            new Rock(i);
        }
        Tester t = new Tester();
        System.out.println("t.s1: " + t.s1);//null
        System.out.println("t.s2: " + t.s2);//hello
        System.out.println("t.s3: " + t.s3);//good-bye
    }
}
