/**
 * Created by pc on 15-4-28.
 * 这里与ObjectOrCode的区别在于，这里将同步代码块的锁的对象引用由this改为了Sync.Class,实现了全局锁的效果。
 * static synchronized方法:static方法可以直接类名加方法名调用，方法中无法使用this，所以它锁的不是this，而是类的Class对象，所以，static synchronized方法也相当于全局锁，相当于锁住了代码段。
 * synchronized实例方法使用this去做线程的共享互斥，synchronized类方法使用该类的类对象的锁定去做线程的对象互斥
 */
public class OneObjectOrCodeFinal {
    public static void main(String[] args) {
        for(int i=0;i<3;i++)
        {
            MyThread2 thread=new MyThread2();
            thread.start();//启动三个线程
        }
    }
}
class Sync1{
    public void test(){
        synchronized (Sync1.class){
            System.out.println("test开始");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("test结束");
        }
    }
}
class MyThread2 extends  Thread{

    @Override
    public void run(){
        Sync1 sync1=new Sync1();
        sync1.test();
    }
}
