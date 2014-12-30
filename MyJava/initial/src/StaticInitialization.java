/**
 * Created by huoweiguang on 14-11-29.
 */
class Bowl {
    Bowl(int marker) {
        System.out.println("Bowl(" + marker + ")");
    }
    void f1(int marker) {
        System.out.println("f1(" + marker + ")");
    }
}

class Table {
    static Bowl bowl1 = new Bowl(1);//2
    Table() {
        System.out.println("Table()");//4
        bowl2.f1(1);//5
    }
    void f2(int marker) {
        System.out.println("f2(" + marker + ")");//23
    }
    static Bowl bowl2 = new Bowl(2);//3
}

class Cupboard {
    Bowl bowl3 = new Bowl(3);//9 14 19
    static Bowl bowl4 = new Bowl(4);//7
    Cupboard() {
        System.out.println("Cupboard()");//10 15 20
        bowl4.f1(2);//11 16 21
    }
    void f3(int marker) {
        System.out.println("f3(" + marker + ")");//25
    }
    static Bowl bowl5 = new Bowl(5);//8
}

public class StaticInitialization {
    public static void main(String[] args) {
        System.out.println("Creating new Cupboard() in main");//12
        new Cupboard();//13
        System.out.println("Creating new Cupboard() in main");//17
        new Cupboard();//18
        table.f2(1);//22
        cupboard.f3(1);//24
    }
    static Table table = new Table();//1
    static Cupboard cupboard = new Cupboard();//6
} 