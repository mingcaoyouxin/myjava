/**
 * Created by dh on 15-4-25.
 * 双重检验锁模式（double checked locking pattern），是一种使用同步块加锁的方法。程序员称其为双重检查锁，
 * 因为会有两次检查 instance == null，一次是在同步块外，一次是在同步块内。
 * 为什么在同步块内还要再检验一次？
 * 因为可能会有多个线程一起进入同步块外的 if，此时假设instance==null，多个线程都会进入if等待进入同步代码快中，
 * 假设线程1先对代码快加锁，创建1个实例，之后释放锁。线程2开始进入同步代码快，如果不判断instance==null的话，也会再创建一个实例
 * 该方法实现的单例模式比对getInsatnce()方法加锁性能高，因为只有在instance==null时候才加锁
 * 该算法的缺点：instance=new SafeSingleDoubleCheck()不是原子操作，JVM做了三件事
 * 1、给 instance 分配内存
 * 2、调用 SafeSingletonDoublecheck 的构造函数来初始化成员变量
 * 3、将instance对象指向分配的内存空间（执行完这步 instance 就为非 null 了）
 */
public class SafeSingletonDoublecheck {
    private static SafeSingletonDoublecheck instance=null;
    public static SafeSingletonDoublecheck getInstance(){
        if(instance==null){
            synchronized (SafeSingletonDoublecheck.class)
            {
                if(instance==null)
                    instance=new SafeSingletonDoublecheck();
            }
        }
        return instance;
    }
}
