/**
 * Created by huoweiguang on 14-11-29.
 */
public class ConstructorThis {
    int petalCount = 0;
    String s = "initial value";
    ConstructorThis(int petals) {
        petalCount = petals;
        System.out.println("int args");
    }
    ConstructorThis(String ss) {
        System.out.println("String arg" );
        s = ss;
    }
    ConstructorThis(String s, int petals) {
        //调用int类型参数的构造器
        this(petals);
        this.s = s; // Another use of "this"
        System.out.println("String & int args");
    }
    ConstructorThis() {
        //调用两个参数的构造器
        this("hi", 47);
        System.out.println("default constructor (no args)");
    }
    void printPetalCount() {
        System.out.println("petalCount = " + petalCount + " s = "+ s);
    }
    public static void main(String[] args) {
        ConstructorThis x = new ConstructorThis();
        x.printPetalCount();
    }
}