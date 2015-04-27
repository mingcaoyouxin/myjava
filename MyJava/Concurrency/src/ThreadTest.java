/**
 * Created by pc on 15-4-27.
 */
public class ThreadTest implements Runnable{

    @Override
    public void run() {
        synchronized(this) {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + " synchronized loop " + i);
            }
        }
    }
    public static void main(String[] args) {
        ThreadTest test = new ThreadTest();
        Thread ta = new Thread(test, "A");
        Thread tb = new Thread(test, "B");
        ta.start();
        tb.start();
    }
}
