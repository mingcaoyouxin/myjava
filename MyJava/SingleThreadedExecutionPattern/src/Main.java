/**
 * Created by pc on 15-4-29.
 * 创建1个门，并操作3个人不断地穿越门
 */
public class Main {
    public static void main(String[] args) {
        Gate gate=new Gate();//创建1个门
        new UserThread(gate,"Alice","Alaska").start();
        new UserThread(gate,"Bobby","Brazil").start();
        new UserThread(gate,"Chris","Canada").start();
    }
}
