/**
 * Created by dh on 15-4-25.
 * 线程安全的单例模式。
 * 存在问题：任何时候只能一个线程调用getInstance()方法，但是它并不高效。
 * 因为同步操作只需要在第一次调用时才被需要，即第一次创建单例实例对象时。
 */
public class SafeSingletonLazy {
    private static SafeSingletonLazy instance=null;
    public static synchronized SafeSingletonLazy getInstance()
    {
        if(instance==null)
            instance=new SafeSingletonLazy();
        return instance;
    }
}
