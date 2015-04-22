/**
 * Created by pc on 15-4-22.
 */
public class Duck {

    private FlyBehavior flyBehavior;//定义两个接口类型，而不是具体的实现类型，每个鸭子对象都会动态地设置这些变量以在运行时引用正确的行为类型
    private QuackBehavior quackBehavior;

    //游泳
    public void swim(){

    }

    //样貌
    public void display(){

    }


    public void PerformQuack(){
        quackBehavior.quack();//鸭子对象不用亲自处理呱呱叫行为，而是委托给quackBehavior引用的对象
    }

    public void PerformFly(){
        flyBehavior.fly();
    }

}
