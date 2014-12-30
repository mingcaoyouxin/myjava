/**
 * Created by huoweiguang on 14-11-25.
 */
public class Float {
    public static  void  main(String [] args){

        System.out.println(Math.round(12.2));//12
        System.out.println(Math.round(12.5));//13
        System.out.println(Math.round(12.8));//13
        System.out.println(Math.round(-12.2));//-12
        System.out.println(Math.round(-12.5));//-12
        System.out.println(Math.round(-12.8));//-13


        System.out.println(Math.ceil(12.2));//13.0
        System.out.println(Math.ceil(12.5));//13.0
        System.out.println(Math.ceil(12.8));//13.0
        System.out.println(Math.ceil(-12.2));//-12.0
        System.out.println(Math.ceil(-12.5));//-12.0
        System.out.println(Math.ceil(-12.8));//-12.0

        System.out.println(Math.floor(12.2));//12.0
        System.out.println(Math.floor(12.5));//12.0
        System.out.println(Math.floor(12.8));//12.0
        System.out.println(Math.floor(-12.2));//-13.0
        System.out.println(Math.floor(-12.5));//-13.0
        System.out.println(Math.floor(-12.8));//-13.0

    }
}
