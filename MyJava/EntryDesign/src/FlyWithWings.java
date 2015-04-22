/**
 * Created by pc on 15-4-22.
 * 接口的实现类，不能让每个鸭子来实现接口，因为更改接口就需要更改每个鸭子类
 */
public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        //实现接口的飞行行为
    }
}
