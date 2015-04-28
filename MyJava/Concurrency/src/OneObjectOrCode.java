/**
 * Created by pc on 15-4-28.
 * 这个代码三个线程使用的是1个对象，因此只能由某个线程访问同步代码段，其他线程等待
 */
public class OneObjectOrCode {
    public static void main(String[] args) {
        Sync sync=new Sync();
        for(int i=0;i<3;i++)
        {
            MyThread1 thread=new MyThread1(sync);
            thread.start();//启动三个线程
        }
    }
}
class MyThread1 extends Thread{
    private Sync sync;

    public MyThread1(Sync sync){
        this.sync=sync;
    }
    @Override
    public void run(){
        sync.test();
    }
}

