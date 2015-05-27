/**
 * Created by pc on 15-5-18.
 * 综合咖啡，一种饮料
 */
public class HouseBlend extends Beverage {
    public HouseBlend(){
        description="HouseBlend";
    }

    @Override
    public double cost() {
        return .89;
    }
}
