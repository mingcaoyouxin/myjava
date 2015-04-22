/**
 * Created by pc on 15-4-22.
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.PerformQuack();
        mallard.PerformFly();

        Duck model=new ModelDuck();
        model.PerformFly();//第一次调用performFly()会被委托给FlyBehavior对象（也就是FlyNoWay实例），该对象是在模型鸭构造器中设置的
        model.setFlyBehavior(new FlyRocketPowered());//这会调用继承来的setter方法，把火箭动力飞行的行为设置到模型鸭中。
        model.PerformFly();

    }
}
