/**
 * Created by pc on 15-4-22.
 */
public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        //不会飞什么都不做
        System.out.println("I can't fly");
    }
}
