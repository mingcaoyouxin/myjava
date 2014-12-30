/**
 * Created by huoweiguang on 14-11-30.
 */
public class FieldAccess {

    public static void main(String[] args) {
        Super sup = new Sub(); // 向上转型
        System.out.println("sup.field = " + sup.field +
                ", sup.getField() = " + sup.getField());
        Sub sub = new Sub();
        System.out.println("sub.field = " +
                sub.field + ", sub.getField() = " +
                sub.getField() +
                ", sub.getSuperField() = " +
                sub.getSuperField());
    }
}

class Super {
    public String field = "SuperField";

    public String getField() {
        return field;
    }
}

class Sub extends Super {
    public String field = "SubField";

    public String getField() {
        return field;
    }

    public String getSuperField() {
        return super.field;
    }
}
/*
* output:
* sup.field = SuperField, sup.getField() = SubField
sub.field = SubField, sub.getField() = SubField, sub.getSuperField() = SuperField
* */