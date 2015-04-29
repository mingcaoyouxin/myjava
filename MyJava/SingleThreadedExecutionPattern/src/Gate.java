/**
 * Created by pc on 15-4-29.
 * 表示门的类，当人经过时会记录姓名与出生地
 * 共享资源类
 */
public class Gate {
    private String userName;
    private String userArea;
    private UserThread userThread;
    private int counter=0;//表示目前已经通过这道门的人数

    public synchronized void pass(String userName,String userArea){
        counter++;
        this.userName=userName;
        this.userArea=userArea;
        check();
    }

    //检查现在门的状态，通过人的姓名和出生地第一个字符是否相同，这里我们故意将人的名字和出生地设为第一个字符相同
    private void check(){
        if(userName.charAt(0)!=userArea.charAt(0)){
            System.out.println("*************Broken*****************"+toString());
        }
    }

    public synchronized String toString(){
        return "No."+counter+":"+userName+","+userArea;
    }

}
