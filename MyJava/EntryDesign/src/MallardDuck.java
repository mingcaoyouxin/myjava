/**
 * Created by pc on 15-4-22.
 * 绿头鸭
 */
public class MallardDuck extends Duck{
    public MallardDuck(){
        //下面这两条语句还有问题，因为又是针对具体实现编程了，因为构建了一个具体的Quack()的实现类,因此不能在构造函数中实例接口
        quackBehavior=new Quack();//呱呱叫，因此基类的performQuack()会调用Quack的quack()
        flyBehavior=new FlyWithWings();
    }
    //重写基类鸭子的外貌
    public void display(){
        System.out.println("I'm a real Mallard duck");
    }
}
