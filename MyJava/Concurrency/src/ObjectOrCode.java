/**
 * Created by pc on 15-4-28.
 * synchronized锁住的是对象还是代码
 * 由下面的代码可以看出，synchronized(this)（test1方法）以及非static的synchronized方法(test方法)，只能防止多个线程同时执行同一个对象的同步代码段。
 * 对于多个对象，比如下面每个线程创建了1个对象，并不能防止同时执行代码段。
 * synchronized锁住的是括号里的对象，而不是代码。
 * 当synchronized锁住一个对象后，别的线程如果也想拿到这个对象的锁，就必须等待这个线程执行完成释放锁，才能再次给对象加锁，这样才达到线程同步的目的。
 * 即使两个不同的代码段，都要锁同一个对象，那么这两个代码段也不能在多线程环境下同时运行。
 * 所以我们在用synchronized关键字的时候，尽量缩小缩小代码段的范围（减小锁的粒度），能在代码段上加同步就不要在整个方法上加同步。使代码更大程度的并发。原因是基于以上的思想，锁的代码段太长了，别的线程要等很久
 *下面的代码，每个线程中都new了一个Sync类的对象，也就是产生了三个Sync对象，由于不是同一个对象，所以可以多线程同时运行synchronized方法或代码段。
 */
public class ObjectOrCode {
    public static void main(String[] args) {
        for(int i=0;i<3;i++)
        {
            MyThreads thread=new MyThreads();
            thread.start();//启动三个线程
        }
    }
}
class Sync{
    public synchronized void test(){
        System.out.println("test开始");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("test结束");
    }

    public void test1(){
        synchronized (this){
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
class MyThreads extends Thread{

    @Override
    public void run(){
        Sync sync=new Sync();
        sync.test();
    }
}