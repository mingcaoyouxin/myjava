/**
 * Created by huoweiguang on 14-11-26.
 */
public class PassingThis {
    public static void main(String[] args){
        new Person().eat(new Apple());
    }
}
class Person{
    public void eat(Apple apple){
        //先对苹果剥皮
        Apple peeled=apple.getPeeled();
        System.out.println("Yummy");
    }
}
class Peeler{
    //对苹果剥皮
    static  Apple peel(Apple apple){
        //remove peel
        return  apple;
    }
}
class Apple{
    //得到剥过皮的苹果
    Apple getPeeled(){
        return Peeler.peel(this);
    }
}