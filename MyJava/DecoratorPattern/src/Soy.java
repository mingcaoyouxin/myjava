/**
 * Created by pc on 15-5-18.
 * 豆浆，一种配料
 */
public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage){
        this.beverage=beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+",Soy";
    }

    @Override
    public double cost() {
        return .15+beverage.cost();
    }
}
