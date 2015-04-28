/**
 * Created by pc on 15-4-28.
 * 这里对类型信息加锁，而不是对对象加锁
 *
 */
public class OneObjectOrCodeStatic {
    public static void main(String[] args) {
        for(int i=0;i<3;i++){
            MyThread2 thread=new MyThread2();
            thread.start();//启动三个线程
        }
    }
}
class Sync2{
    public static void test(){
        synchronized (Sync2.class){
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
class MyThread3 extends  Thread{

    @Override
    public void run(){
        Sync2 sync2=new Sync2();
        sync2.test();
    }
}

