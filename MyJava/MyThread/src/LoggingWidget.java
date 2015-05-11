/**
 * Created by pc on 15-5-11.
 * 当一个线程请求其它的线程已经占有的锁时，请求线程将被阻塞。然而内部锁是可重进入的，因此线程在试图获得它自己占用的锁是，请求会成功。
 * 重进入意味着请求是基于"每一个线程"，而不是基于"每一次调用"（互斥锁是基于每次调用的）。重进入的实现是通过为每一个锁关联一个请求技术器和一个占有他的线程。
 * 当计数为0时，认为锁是未被占用的。线程请求一个未被占有的锁时候，JVM 将记录锁的占有者，并且将请求计数设置为1。
 * 如果同一个线程再次请求这个锁，计数将递增；每次占用线程退出语句块时，计数器值将递减，直到计数器达到0时候，锁被释放。
 *
 * 重进入方便了锁行为的封装，因此简化了面向对象并发代码的开发。
 *
 * 在例子中，子类覆盖了父类的 synchronized 类型的方法，并调用父类中的方法。如果没有可重入的锁，子类中可能就会产生死锁，
 * 因为 Widget 和 LoggingWidget 中的 dosomething 方法都是 synchronized 类型的，都会在处理前试图获得 Widget 的锁。倘若内部锁不是可重入的，super.doSomething 的调用者就永远无法获得 Widget 的锁。
 * 因为锁已经被占用，导致线程永久的延迟，等待着一个永远无法获得的锁。
 *
 * 同一个线程执行时，不会导致死锁，Java中的 synchronized 本身就是可以重入的（Reentrant）， 不管是 synchronized 方法，还是 synchronized statements。
 * 可重入应该是针对 Lock 的设计级别来讲的，一个好的 Lock 类，线程应当对持有它具有可重入性，而 Java 中的 synchronized 同步块本身就是是可重入的。
 *
 */
public class LoggingWidget extends Widget {

    @Override
    public synchronized void doSomething(){
        System.out.println(toString()+":Calling doSomething");
        super.doSomething();
    }
}
