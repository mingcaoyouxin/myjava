/**
 * Created by pc on 15-5-22.
 */
public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore=new NYPizzaStore();
        Pizza pizza=nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a "+pizza.getName()+"\n");

    }
}
