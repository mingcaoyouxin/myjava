/**
 * Created by pc on 15-4-28.
 * 调用start方法之后，java执行处理系统就会在背后启动新的线程。再由这个线程调用run方法。调用start方法，会有两个操作
 * 1、启动新的线程
 * 2、调用run方法
 *
 * 执行结果是交替输出good nice因为两个线程Main和新启动的线程是并发的。也就是程序不断的切换所有的操作的线程
 * 并行：如果有1个以上中央处理器的计算机上跑的java执行处理系统，则线程的操作可能是并行而非并发。当1个以上的线程并行操作时，就可以真正同时进行1个以上的处理。
 *
 * 注意：“MyThread的实例”和“线程本身”是两个不同的部分。即使建立了类的实例，也没有启动线程，而且就算线程已经结束，实例也不会立即消失。
 * 程序结束是在所有线程都结束后才结束的。
 */
public class Main {
    public static void main(String[] args) {
        MyThread myThread=new MyThread();//创建类的实例
        myThread.start();//启动该实例对应的线程

        for(int i=0;i<10000;i++){
            System.out.println("Good"+i);
        }
    }
}
