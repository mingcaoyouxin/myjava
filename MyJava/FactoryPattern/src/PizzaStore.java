/**
 * Created by pc on 15-5-22.
 */
public abstract class PizzaStore {

    Pizza orderPizza(String type){

        //orderPizza调用createPizza()取得比萨对象，但究竟取得哪一种比萨；这不是orderPizza方法所能决定的，而是由顾客决定到哪一家风味的比萨定决定的
        Pizza pizza=createPizza(type);

        pizza.prepare();//准备（擀面皮、加上佐料，例如芝士）
        pizza.bake();//烘烤
        pizza.cut();//切片
        pizza.box();//装盒
        return pizza;
    }

    //这里从工厂方法里面取出来，写一个抽象方法，由具体的加盟店来实现，来决定怎么制造比萨
    //相当于一个工厂方法，工厂方法用来处理对象的创建，并将这样的行为封装在子类中。
    //这样，客户程序中关于超类的代码就和子类对象创建代码解耦了
    abstract Pizza createPizza(String item);

}
