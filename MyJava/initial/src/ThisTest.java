/**
 * Created by huoweiguang on 14-11-26.
 */
public class ThisTest {
   String name="James";
    public ThisTest(String name) {
        //成员变量因为与形参同名，被屏蔽，因此需要使用This关键字
        this.name=name;
    }

    public static void main(String[] args) {
        ThisTest test1= new ThisTest("Hao!");
        ThisTest test2= new ThisTest("Guang!");
        test1.getName();//Hao! Hao!Hui Hao!
        test2.getName();//Guang! Guang!Hui Guang!

    }
    public void getName(){
        System.out.println(this.name);
        f();
    }
    public void f(){
        //成员变量被局部变量屏蔽
        String  name="Hui";
        name=this.name+name;
        System.out.println(name);
        System.out.println(this.name);
    }
}

