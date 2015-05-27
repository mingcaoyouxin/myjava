/**
 * Created by pc on 15-5-22.
 */
public interface PizzaIngredientFactory {
    public Dough createDough();//面团
    public Sauce createSauce();//酱料
    public Cheese createCheese();//芝士
    public Veggies[] createVeggies();//蔬菜
    public Pepperoni createPepperoni();//香料
    public Clams createClam();//海鲜佐料
}
