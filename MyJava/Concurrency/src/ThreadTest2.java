/**
 * Created by pc on 15-4-27.
 */
/**
 * Created by pc on 15-4-27.
 */
public class ThreadTest2 implements Runnable {
    @Override
    public void run() {

    }
    public void synTest(){
        synchronized (this){
            int i=5;
            while (i-->0){
                System.out.println(Thread.currentThread().getName()+":"+i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public void synTest1(){
        synchronized (this){
            int i=5;
            while (i-->0){
                System.out.println(Thread.currentThread().getName()+":"+i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static void main(String[] args) {
        final ThreadTest2 test=new ThreadTest2();
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                test.synTest();
            }
        },"t1");
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                test.synTest1();
            }
        },"t2");
        t1.start();
        t2.start();
    }
}

