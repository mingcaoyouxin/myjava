/**
 * Created by dh on 15-4-25.
 * 线程不安全的单例模式
 * 使用了延迟加载模式，但是不适用多线程，存在竞态条件
 */
public class UnsafeSingletonLazy {
    private static UnsafeSingletonLazy instance=null;
    public static UnsafeSingletonLazy getInstance(){
        if(instance==null)
            instance=new UnsafeSingletonLazy();
        return instance;
    }
}
