/**
 * Created by dh on 15-4-25.
 *  使用内部静态类的单例模式
 */
public class SafeSingletonStaticNested {
    private static class SingletonHolder{
        private static final SafeSingletonStaticNested INSTANCE =new SafeSingletonStaticNested();
    }
    private SafeSingletonStaticNested(){

    }
    public static final SafeSingletonStaticNested getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
