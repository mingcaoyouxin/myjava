/**
 * Created by pc on 15-5-18.
 * 调料类,也就是装饰者类，首先必须让CondimentDecorator能够取代Beverage，所以将condimentDecorator扩展自Beverage
 */
public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
