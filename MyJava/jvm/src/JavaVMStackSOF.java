/**
 * Created by pc on 14-11-27.
 */
public class JavaVMStackSOF {
    private int stackLength=1;
    public void stackLeak(){
       /* stackLength++;*/
        stackLeak();
    }
    public void stackLeakNone(){
        try{
            stackLeakNone();
        }finally{
            stackLeakNone();
        }
    }
    public static void main(String [] args) throws Throwable {
        JavaVMStackSOF oom=new JavaVMStackSOF();
        try{
            oom.stackLeakNone();
            System.out.println("stackOverFlow");
        }catch (Throwable e){
            System.out.println("stack length:"+oom.stackLength);
            throw e;
        }
      /*  try{
            oom.stackLeak();
        }catch (Throwable e){
            System.out.println("stack length:"+oom.stackLength);
            throw e;
        }*/

    }
}
