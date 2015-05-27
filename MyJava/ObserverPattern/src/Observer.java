/**
 * Created by pc on 15-5-21.
 * 观察者接口，所有的气象组件都实现此观察者接口。这样，主题在需要通知观察者时，有了一个共同的接口
 */
public interface Observer {
    //当气象观测值改变时，主题会把这些状态值当做方法的参数，传送给观察者
    //观察者必须实现update方法以实现Observer接口，这样直接把观测值传给观察者中
    public void update(float temp,float humidity,float pressure);

}
