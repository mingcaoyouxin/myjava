/**
 * Created by pc on 15-5-25.
 *简单的遥控器，只有一个按钮和一个插槽，可以控制一个装置
 */
public class SimpleRemoteControl {
    Command slot;//有一个插槽持有命令，而这个命令控制着一个装置

    public SimpleRemoteControl(){}

    //设置插槽控制的命令。如果这段代码的客户想要改变遥控器按钮的行为，可以多次调用这个方法
    public void setCommand(Command command){
        this.slot=command;
    }

    public void buttonPressed(){
        slot.execute();
    }
}
