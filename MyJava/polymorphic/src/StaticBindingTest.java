/**
 * Created by huoweiguang on 14-11-30.
 */
public class StaticBindingTest {
    public void callEat(Animal animal) {
        System.out.println("Animal is eating");
    }

    public void callEat(Dog dog) {
        System.out.println("Dog is eating");
    }

    public static void main(String args[]) {
        Animal a = new Dog();
        StaticBindingTest staticBinding=new StaticBindingTest();
        staticBinding.callEat(a);
    }
}

class Dog extends Animal {

}

class Animal {

}
