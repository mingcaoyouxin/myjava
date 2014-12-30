/**
 * Created by huoweiguang on 14-11-26.
 */
public class PrimitiveOverloading {
    void f1(char x) { System.out.println("f1(char) "); }
    void f1(byte x) { System.out.println("f1(byte) "); }
    void f1(short x) { System.out.println("f1(short) "); }
    void f1(int x) { System.out.println("f1(int) "); }
    void f1(long x) { System.out.println("f1(long) "); }
    void f1(float x) { System.out.println("f1(float) "); }
    void f1(double x) { System.out.println("f1(double) "); }

    void f2(byte x) { System.out.println("f2(byte) "); }
    void f2(short x) { System.out.println("f2(short) "); }
    void f2(int x) { System.out.println("f2(int) "); }
    void f2(long x) { System.out.println("f2(long) "); }
    void f2(float x) { System.out.println("f2(float) "); }
    void f2(double x) { System.out.println("f2(double) "); }

    void f3(short x) { System.out.println("f3(short) "); }
    void f3(int x) { System.out.println("f3(int) "); }
    void f3(long x) { System.out.println("f3(long) "); }
    void f3(float x) { System.out.println("f3(float) "); }
    void f3(double x) { System.out.println("f3(double) "); }

    void f4(int x) { System.out.println("f4(int) "); }
    void f4(long x) { System.out.println("f4(long) "); }
    void f4(float x) { System.out.println("f4(float) "); }
    void f4(double x) { System.out.println("f4(double) "); }

    void f5(long x) { System.out.println("f5(long) "); }
    void f5(float x) { System.out.println("f5(float) "); }
    void f5(double x) { System.out.println("f5(double) "); }

    void f6(float x) { System.out.println("f6(float) "); }
    void f6(double x) { System.out.println("f6(double) "); }

    void f7(double x) { System.out.println("f7(double) "); }

    void testConstVal() {
        System.out.println("5: ");
        f1(5);//f1(int)
        f2(5);//f2(int)
        f3(5);//f3(int)
        f4(5);//f4(int)
        f5(5);//f5(long)--f5没有形参为int类型的方法，则实参数据类型会被提升为long
        f6(5);//f6(float)--f6没有形参为int类型的方法，则实参数据类型会被提升
        f7(5);//f7(double)--f7没有形参为int类型的方法，则实参数据类型会被提升
    }
    void testChar() {
        char x = 'x';
        System.out.println("char: ");
        f1(x);//f1(char)
        f2(x);//f2(int)--f2没有形参为char类型的方法，则实参数据类型会被提升为int
        f3(x);//f3(int)--f3没有形参为char类型的方法，则实参数据类型会被提升
        f4(x);//f4(int)--f4没有形参为char类型的方法，则实参数据类型会被提升
        f5(x);//f5(long)--f5没有形参为char类型的方法，则实参数据类型会被提升
        f6(x);//f6(float)--f6没有形参为char类型的方法，则实参数据类型会被提升
        f7(x);//f7(double)--f7没有形参为char类型的方法，则实参数据类型会被提升
    }
    void testByte() {
        byte x = 0;
        System.out.println("byte: ");
        f1(x);//f1(byte)
        f2(x);//f2(byte)
        f3(x);//f3(short)--f3没有形参为byte类型的方法，则实参数据类型会被提为short
        f4(x);//f4(int)--f4没有形参为byte类型的方法，则实参数据类型会被提升
        f5(x);//f5(long)--f5没有形参为byte类型的方法，则实参数据类型会被提升
        f6(x);//f6(float)--f6没有形参为byte类型的方法，则实参数据类型会被提升
        f7(x);//f7(double)--f7没有形参为byte类型的方法，则实参数据类型会被提升
    }
    void testShort() {
        short x = 0;
        System.out.println("short: ");
        f1(x);//f1(short)
        f2(x);//f2(short)
        f3(x);//f3(short)
        f4(x);//f4(int)--f4没有形参为short类型的方法，则实参数据类型会被提升
        f5(x);//f5(long)--f5没有形参为short类型的方法，则实参数据类型会被提升
        f6(x);//f6(float)--f6没有形参为short类型的方法，则实参数据类型会被提升
        f7(x);//f7(double)--f7没有形参为short类型的方法，则实参数据类型会被提升
    }
    void testInt() {
        int x = 0;
        System.out.println("int: ");
        f1(x);//f1(int)
        f2(x);//f2(int)
        f3(x);//f3(int)
        f4(x);//f4(int)
        f5(x);//f5(long)--f5没有形参为int类型的方法，则实参数据类型会被提升为long
        f6(x);//f6(float)--f6没有形参为int类型的方法，则实参数据类型会被提升
        f7(x);//f7(double)--f7没有形参为int类型的方法，则实参数据类型会被提升
    }
    void testLong() {
        long x = 0;
        System.out.println("long: ");
        f1(x);//f1(long)
        f2(x);//f2(long)
        f3(x);//f3(long)
        f4(x);//f4(long)
        f5(x);//f5(long)
        f6(x);//f6(float)--f6没有形参为long类型的方法，则实参数据类型会被提升为float
        f7(x);//f7(double)--f7没有形参为long类型的方法，则实参数据类型会被提升
    }
    void testFloat() {
        float x = 0;
        System.out.println("float: ");
        f1(x);//f1(float)
        f2(x);//f2(float)
        f3(x);//f3(float)
        f4(x);//f4(float)
        f5(x);//f5(float)
        f6(x);//f6(float)
        f7(x);//f7(double)--f7没有形参为float类型的方法，则实参数据类型会被提升为double
    }
    void testDouble() {
        double x = 0;
        System.out.println("double: ");
        f1(x);//f1(double)
        f2(x);//f2(double)
        f3(x);//f3(double)
        f4(x);//f4(double)
        f5(x);//f5(double)
        f6(x);//f6(double)
        f7(x);//f7(double)
    }
    public static void main(String[] args) {
        PrimitiveOverloading p =
                new PrimitiveOverloading();
        p.testConstVal();
        p.testChar();
        p.testByte();
        p.testShort();
        p.testInt();
        p.testLong();
        p.testFloat();
        p.testDouble();
    }
}