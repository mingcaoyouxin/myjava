/**
 * Created by pc on 15-5-11.
 * 下面的代码中，主线程启动读线程，主线程和读线程都将访问共享变量ready、number。预期输出结果：42。
 * 实际输出结果：不可知，可能死循环，可能为0.因为无法保证主线程写入的ready和number值对于读线程是可见的。
 * 失效数据：当读线程查看ready变量时，可能得到一个已经失效的值。
 *
 */
public class NoVisibility {
    private static boolean ready;
    private static int number;
    private static class ReaderThread extends Thread{
        public void run(){
            while (ready)
                Thread.yield();
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        new ReaderThread().start();
        number=42;
        ready=true;
    }
}
