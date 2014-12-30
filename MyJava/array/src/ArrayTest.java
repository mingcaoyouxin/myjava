/**
 * Created by huoweiguang on 14-11-29.
 */
public class ArrayTest {
    public static void main(String args[]){
       /* int a[] = new int[10];
        Class clazz = a.getClass();
        System.out.println(clazz.getName());//[I*/
        int a[] = new int[10];
        Class clazz = a.getClass();
        System.out.println(clazz.getDeclaredFields().length);//0 说明没有成员变量
        System.out.println(clazz.getDeclaredMethods().length);//0 说明没有方法
        System.out.println(clazz.getDeclaredConstructors().length);//0 说明没有构造器
        System.out.println(clazz.getDeclaredAnnotations().length);//0 没有Annotations
        System.out.println(clazz.getDeclaredClasses().length);//0
        System.out.println(clazz.getSuperclass());//class java.lang.Object
    }

}

