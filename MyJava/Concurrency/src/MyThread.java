/**
 * Created by pc on 15-4-28.
 * 注意Thread类本身也实现了Runnable接口，Thread类又不是abstract的，因此它也必须重写run方法，只不过run方法体是空的
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i=0;i<10000;i++){
            System.out.println("Nice"+i);
        }

    }
}
