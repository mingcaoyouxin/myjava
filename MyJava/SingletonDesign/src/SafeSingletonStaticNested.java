/**
 * Created by dh on 15-4-25.
 *  使用内部静态类的单例模式
 */
public class SafeSingletonStaticNested {

   private static class SingletonHolder{
       private final static SafeSingletonStaticNested INSTANCE=new SafeSingletonStaticNested();
   }

    private SafeSingletonStaticNested(){}

    //静态方法
    public static final SafeSingletonStaticNested getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
