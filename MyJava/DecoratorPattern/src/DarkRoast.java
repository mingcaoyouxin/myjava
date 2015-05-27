/**
 * Created by pc on 15-5-18.
 * 深焙咖啡，一种饮料
 */
public class DarkRoast extends Beverage {
    public DarkRoast(){
        description="DarkRoast";
    }

    @Override
    public double cost() {
        return .99;
    }
}
