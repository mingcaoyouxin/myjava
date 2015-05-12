

/**
 * Created by pc on 15-5-12.
 * 在构造函数中注册一个监听器或者启动线程
 * 只有当构造函数返回时，this引用才应该从线程中逸出。构造函数可以将this引用保存到某个地方（如这里的safe局部变量），只要其他线程不会在构造函数完成之前使用它。
 * 当构造好了SafeListener对象（通过构造器构造）之后，我们才启动了监听线程，也就确保了SafeListener对象是构造完成之后再使用的SafeListener对象。
 */
public class SafeListener {
    private final EventListener listener;

    //私有构造方法，不能在外部实例化
    private SafeListener(){

        listener=new EventListener() {
            @Override
            public void onEvent(Event e) {
                doSomething();
            }
        };

    }

    private void doSomething() {

    }
    //公共的工厂方法，用来构造实例
    public static SafeListener newInstance(EventSource source){
        SafeListener safe=new SafeListener();
        source.registerListener(safe.listener);
        return safe;
    }
}

interface EventSource {
    void registerListener(EventListener e);
}

interface EventListener {
    void onEvent(Event e);
}

interface Event {
}
