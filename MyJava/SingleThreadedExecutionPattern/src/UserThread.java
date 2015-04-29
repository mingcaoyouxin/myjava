/**
 * Created by pc on 15-4-29.
 * 表示人的类，只负责处理不断地在门间穿梭通过
 */
public class UserThread extends Thread{
    private Gate gate;
    private String userName;
    private String userArea;

    public UserThread(Gate gate,String userName,String userArea){
        this.gate=gate;
        this.userName=userName;
        this.userArea=userArea;
    }
    @Override
    public void run(){
        System.out.println(userName+"Begin");
        while(true)
            gate.pass(userName,userArea);
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    public String getUserArea() {
        return userArea;
    }

    public void setUserArea(String userArea) {
        this.userArea = userArea;
    }

    public Gate getGate() {
        return gate;
    }

    public void setGate(Gate gate) {
        this.gate = gate;
    }






}
