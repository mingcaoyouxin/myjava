/**
 * Created by pc on 14-12-1.
 */
public class TestOverride {
    public static void main(String []args){
        Father father = new Son();
        Son son = new Son();
        father.show(son); //show:Son:father
        father.display(son); //display:Father:father
    }
}
class Father{
    void show(Father father){
        System.out.println("show:Father:father");
    }
    static void display(Father father){
        System.out.println("display:Father:father");
    }
}
class Son extends Father{
    void show(Father father){
        System.out.println("show:Son:father");
    }
    void show(Son son){
        System.out.println("show:Son:son");
    }
    static void display(Father father){
        System.out.println("display:Son:father");
    }
}

