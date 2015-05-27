/**
 * Created by pc on 15-5-22.
 * 纽约风味的pizza
 */
public class NYPizzaStore extends PizzaStore{

    @Override
    Pizza createPizza(String item) {

        if (item.equals("cheese")) {
            return new NYStyleCheesePizza();
        }
        else if (item.equals("veggie")) {
            return new NYStyleVeggiePizza();
        }
        else if (item.equals("clam")) {
            return new NYStyleClamPizza();
        }
        else if (item.equals("pepperoni")) {
           return new NYStylePepperoniPizza();
        }
        else return null;
    }

}
