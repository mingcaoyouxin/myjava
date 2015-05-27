/**
 * Created by pc on 15-5-18.
 * 浓缩咖啡,一种饮料
 */
public class Espresso extends Beverage{

    public Espresso(){
        description="Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
