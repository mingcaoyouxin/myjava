/**
 * Created by pc on 15-4-22.
 * 模型鸭
 */
public class ModelDuck extends Duck{
    public ModelDuck(){
        flyBehavior=new FlyNoWay();//模型鸭是不会飞的
        quackBehavior=new Quack();//呱呱叫
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
