/**
 * Created by pc on 15-5-18.
 * 低咖啡因咖啡，一种饮料
 */
public class Decaf extends Beverage {
    public Decaf(){
        description="Decaf";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
