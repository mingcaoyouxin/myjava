/**
 * Created by huoweiguang on 14-11-29.
 */
class A {

}

public class Varargs {
    static void printArray(Object... args) {
        for (Object obj : args) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printArray(new Integer(47), new Float(3.14));
        printArray(47, 3.14F, 11.11);
        printArray("one", "two", "three");
        printArray(new A(), new A(), new A());
        printArray(new Integer[]{1, 2, 3, 4, 5});
        printArray();
    }
}
