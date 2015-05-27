/**
 * Created by pc on 15-5-25.
 * 命令模式的客户
 */
public class RemoteControlTest {
    public static void main(String[] args) {
        //遥控器就是调用者，会传入一个命令对象，可以用来发出请求
        SimpleRemoteControl remote=new SimpleRemoteControl();
        //请求的接收者
        Light light=new Light();
        //创建命令，将接收着传给它
        LightOnCommand lightOn=new LightOnCommand(light);
        //把命令传给调用者
        remote.setCommand(lightOn);
        remote.buttonPressed();
    }
}
