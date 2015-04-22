/**
 * Created by pc on 15-4-22.
 */
public abstract class Duck {

    FlyBehavior flyBehavior;//定义两个接口类型，而不是具体的实现类型，每个鸭子对象都会动态地设置这些变量以在运行时引用正确的行为类型
    QuackBehavior quackBehavior;

    public Duck(){

    }

    public abstract void display();

    public void PerformQuack(){
        quackBehavior.quack();//鸭子对象不用亲自处理呱呱叫行为，而是委托给quackBehavior引用的对象
    }

    public void PerformFly(){
        flyBehavior.fly();
    }

    public void swim(){
        System.out.println("All ducks float,even decoys");
    }

    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior=fb;
    }
    public void setQuackBehavior(QuackBehavior qb){
        quackBehavior=qb;
    }
}
