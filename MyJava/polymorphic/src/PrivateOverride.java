/**
 * Created by huoweiguang on 14-11-30.
 */
public class PrivateOverride {
    public void f() {
        System.out.println("private f()");
    }

    public static void main(String[] args) {
        PrivateOverride po = new Derived();
        po.f();
    }
}

class Derived extends PrivateOverride {
    public void f() {
        System.out.println("public f()");
    }
}
/* Output:
private f()
*/
