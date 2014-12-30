/**
 * Created by huoweiguang on 14-11-26.
 */
public class ThisTest1 {
    private int number;
    private String username;
    private String password;
    private int x = 100;

    public ThisTest1(int n) {
        number = n;  // 这个还可以写为: this.number=n;
    }
    public ThisTest1(int i, String username, String password) {
        // 成员变量和参数同名,成员变量被屏蔽,用"this.成员变量"的方式访问成员变量.
        this.username = username;
        this.password = password;
    }
    // 默认不带参数的构造方法
    public ThisTest1() {
        this(0, "未知", "空"); // 通过this调用另一个构造方法
    }
    public ThisTest1(String name) {
        this(1, name, "空"); // 通过this调用另一个构造方法
    }
    public static void main(String args[]) {
        ThisTest1 t1 = new ThisTest1();
        ThisTest1 t2 = new ThisTest1("游客");
        t1.outinfo(t1);//0 未知 空
        t2.outinfo(t2);//
    }
    private void outinfo(ThisTest1 t) {
        System.out.println("-----------");
        System.out.println(t.number);
        System.out.println(t.username);
        System.out.println(t.password);
        f(); // 这个可以写为: this.f();
    }
    private void f() {
        // 局部变量与成员变量同名,成员变量被屏蔽,用"this.成员变量"的方式访问成员变量.
        int x;
        x = this.x++;
        System.out.println(x);
        System.out.println(this.x);
    }

    //返回当前实例的引用
    private ThisTest1 getSelf() {
        return this;
    }
}
